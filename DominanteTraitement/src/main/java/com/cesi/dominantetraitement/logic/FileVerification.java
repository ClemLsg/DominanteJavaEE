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
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;

/**
 *
 * @author Seagel
 */
@Stateless
@LocalBean
public class FileVerification {
    
    @Inject //paquetage javax.inject
    private MessageDispatcher dispatcher;

    public void verifyFile(String[] data){
        
        String percent = getPercentage(data);
        String secret = findSecret(data);
        
        String[] finalData = {data[0], data[1], data[2], percent, secret};
        
        dispatcher.dispatch("sendResults", finalData);
    }
    
    static String readFile(String path, Charset encoding) 
        throws IOException 
      {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
      }
    
    public String getPercentage(String[] data){
        String main = data[0];
        
        String string1 = "";
        try {
            string1 = readFile("C:\\Users\\Seagel\\Desktop\\liste_francais.txt", StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(FileVerification.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

        float percentageOfWordsInDictionnary = (top / bottom) * 100;
        
        System.out.println(String.valueOf(percentageOfWordsInDictionnary));
        
        return String.valueOf(percentageOfWordsInDictionnary);
    }
    
    public String findSecret(String[] data){
        
        return "test";
    }
}
