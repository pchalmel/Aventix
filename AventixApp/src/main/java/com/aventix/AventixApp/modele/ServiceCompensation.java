                          /*Classe ServiceCompensation*/

package com.aventix.AventixApp.modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.Properties;
import java.util.TimerTask;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.aventix.AventixApp.services.ServicesImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class ServiceCompensation extends TimerTask {
    
/*---------------------------------ATTRIBUTS----------------------------------*/
    
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public ServiceCompensation() {
    }
    
//Constructeur par valeurs    
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/

    
/*----------------------------------Setters-----------------------------------*/
   

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public void run() {
        try {
            //Configuration du serveur smtp
            ServicesImpl services = new ServicesImpl();
            String smtpHost = "smtp.gmail.com";
            String to = "olivier.cinquin@insa-lyon.fr";
            
            Properties props = new Properties();
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.host", smtpHost);
            props.put("mail.smtp.enable", "true");
            props.put("mail.smtp.starttls.required", "true");
            props.put("mail.smtp.auth", "true");
            
            Session session = Session.getDefaultInstance(props);
            session.setDebug(true);
            
            //Redaction du message
            MimeMessage message = new MimeMessage(session);
            List<Transa> listeTransaction = services.findTransaByStatut(false);
            message.setFrom(new InternetAddress("service.facturation.aventix@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Transactions a compenser");
            message.setText(listeTransaction.toString());
            Transport tr = session.getTransport("smtp");
            tr.connect(smtpHost, "service.facturation.aventix@gmail.com", "aventix2020");
            message.saveChanges();
            tr.sendMessage(message,message.getAllRecipients());
            tr.close();
        } catch (MessagingException ex) {
            Logger.getLogger(ServiceCompensation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                        /*Fin classe ServiceCompensation*/