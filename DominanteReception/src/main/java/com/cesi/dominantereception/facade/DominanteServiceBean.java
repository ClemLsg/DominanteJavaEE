/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantereception.facade;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.jws.WebService;

/**
 *
 * @author Seagel
 */
@Stateless
@WebService(
endpointInterface = "com.cesi.dominantereception.facade.DominanteServiceEndpointInterface",
portName = "DominantePort", 
serviceName = "DominanteService"
 )
public class DominanteServiceBean implements DominanteServiceEndpointInterface {
    
    @Inject //paquetage javax.inject
    private JMSContext context; //paquetage javax.jms
    
    @Resource(lookup = "jms/messageQueue") //paquetage javax.annotation
    private Queue messageQueue; //paquetage javax.jms
    
    @Override
    public void SendMessageToJMS(String decryptFile, String originalFile, String filename){
        TextMessage msg = context.createTextMessage(decryptFile);
            
        //envoi du message dans la queue paymentQueue
        context.createProducer().send(messageQueue, msg);
    }
}