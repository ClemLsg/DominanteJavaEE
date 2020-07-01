/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantetraitement.logic;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;

/**
 *
 * @author Seagel
 */
@Stateless
@LocalBean
public class MessageDispatcher {
    
    @Inject //paquetage javax.inject
    private FileVerification verificator;
    
    @Inject //paquetage javax.inject
    private WCFMessenger wcfMessenger;
    
    public void dispatch(String methodName, String[] data){
        switch(methodName){
            case "verify":
                verificator.verifyFile(data);
                break;
            
            case "sendResults":
                wcfMessenger.sendMessage(data);
                break;
        }
    }
}
