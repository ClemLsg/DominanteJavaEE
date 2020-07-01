/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantetraitement.logic;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author Seagel
 */
@MessageDriven(mappedName = "jms/messageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MessageProcessor implements MessageListener {
    
    @Inject //paquetage javax.inject
    private MessageDispatcher dispatcher;
    
    public MessageProcessor() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            String decryptFile = message.getBody(String.class);
            String originalFile = message.getStringProperty("originalFile");
            String filename = message.getStringProperty("filename");
            
            String[] data = {decryptFile, originalFile, filename};
            
            dispatcher.dispatch("verify", data);
            
        } catch (JMSException ex) {
            Logger.getLogger(MessageProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
