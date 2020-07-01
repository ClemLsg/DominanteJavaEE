/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantetraitement.logic;

import java.util.Date;
import java.util.Properties;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Seagel
 */
@Stateless
@LocalBean
public class MailSender {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void sendMail(String[] data){
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        String myAccountEmail = "thedarkdady@gmail.com";
        String myAccountPassword = "gzmorgobebvokbyu";

        
        Session session = Session.getInstance(props, new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, myAccountPassword);
            }
        });

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("decryptor@javadominante.com"));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress("clement.lesage@viacesi.fr"));
            msg.setSubject("Fichier déchiffré avec succes !");
            msg.setSentDate(new Date());
            msg.setText("Le secret a été trouvé !\n"
                    + "le fichier est le suivant : "
                    + data[2]
                    + "\n"
                    + "Avec la clé suivante :"
                    + data[4]
                    + "\n"
                    + "Le secret est :"
                    + data[5]);
            Transport.send(msg);
        } catch (MessagingException mex) {
            System.out.println("send failed, exception: " + mex);
        }
    }
}
