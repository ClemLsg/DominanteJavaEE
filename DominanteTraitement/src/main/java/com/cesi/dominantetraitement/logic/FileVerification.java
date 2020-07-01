/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantetraitement.logic;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Seagel
 */
@Stateless
@LocalBean
public class FileVerification {
    
    @Inject //paquetage javax.inject
    private MessageDispatcher dispatcher;
    
    @PersistenceContext
    EntityManager entityManager;

    public void verifyFile(String[] data){
        
        String percent = getPercentage(data);
        String secret = findSecret(data);
        if (Float.parseFloat(percent) >= 25 && secret != null){
            String[] finalData = {data[0], data[1], data[2], data[3], percent, secret, "true"};
            dispatcher.dispatch("sendMail", finalData);
            dispatcher.dispatch("sendResults", finalData);
        } else {
            String[] finalData = {data[0], data[1], data[2], data[3], percent, secret, "false"};
            dispatcher.dispatch("sendResults", finalData);
        }
        
    }
    
    public String getPercentage(String[] data){
        
        TypedQuery<Dictionnary> tq = entityManager.createNamedQuery("Dictionnary.findAll", Dictionnary.class);
        List<Dictionnary> dictionnary;
        String string1 = "";
        try {
            dictionnary = tq.getResultList();
            for (Dictionnary dico : dictionnary){
                string1 = string1 + " " + dico.getWord();
            }
        }
        catch(NoResultException ex){
            ex.printStackTrace();
        }
        
        String main = data[0];
        
        // Extract all the words whose length is > 1 and remove duplicates
        Set<String> mainWords = new HashSet<>();
        for (String s : main.split("\\W")) {
            if (s.length() > 1) {
                mainWords.add(s);
            }
        }

        Set<String> mainWordsToFind = new HashSet<>(mainWords);
        // Iterate over all the words and remove the word from the list to find
        for (String word : string1.split("\\W")) {
            if (word.length() > 1) {
                mainWordsToFind.remove(word);
            }
        }
        
        float top = (mainWords.size() - mainWordsToFind.size());
        float bottom = mainWords.size();

        float percentageOfWordsInDictionnary;
        if(bottom != 0){
            percentageOfWordsInDictionnary = (top / bottom) * 100;
        } else {
            percentageOfWordsInDictionnary = 0;
        }
        
        
        System.out.println(String.valueOf(percentageOfWordsInDictionnary));
        
        return String.valueOf(percentageOfWordsInDictionnary);
    }
    
    public String findSecret(String[] data){
        String[] strArr = data[0].split("information secrète");
        if(strArr.length > 1) {
            strArr = strArr[1].trim().split(" ");
            return strArr[0];
        }
        return null;   
    }
}
