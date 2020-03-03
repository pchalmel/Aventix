                               /*Classe ServiceFacturation*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import services.ServicesImpl;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.mail.internet.MimeMessage;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class ServiceFacturation implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServiceFacturation;
    
    private String email, password;

/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public ServiceFacturation() {
        this.email = "service.facturation.aventix@gmail.com";
        this.password = "aventix2020";
    }
    
//Constructeur par valeurs 
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idServiceFacturation;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
/*----------------------------------Setters-----------------------------------*/
   
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    //Changer l'email du compte du ServiceFacturation
    public void changerEmail(String email) {
        ServicesImpl services = new ServicesImpl();
        ServiceFacturation sF = services.findServiceFacturationById(this.getId());
        sF.setEmail(email);
        services.miseAJourServiceFacturation(sF);
    }
    
    //Changer le mot de passe du compte de l'employe
    public void changerPassword(String password) {
        ServicesImpl services = new ServicesImpl();
        ServiceFacturation sF = services.findServiceFacturationById(this.getId());
        sF.setPassword(password);
        services.miseAJourServiceFacturation(sF);
    }
    
    //Verification password
    public boolean verifLogin(String email, String password) {
        ServicesImpl services = new ServicesImpl();
        ServiceFacturation sF = services.findServiceFacturationByEmail(this.getEmail());    
        return (sF.getPassword().equals(password));
    }
    
    //Afficher l'historique des commandes
    public List<Commande> historiqueCommandes() {
        ServicesImpl services = new ServicesImpl();
        return services.findAllCommandes();
    }
    
    //Envoyer la facture d'une commande
    public void envoyerFacture(Commande c) throws AddressException, MessagingException {
        ServicesImpl services = new ServicesImpl();
        Commande commande = services.findCommandeById(c.getId());
        //Configuration du serveur smtp
        String smtpHost = "smtp.gmail.com";
        String to = commande.getEntreprise().getEmail();

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
        ServiceFacturation sF = services.findServiceFacturationById(1L);
        message.setFrom(new InternetAddress(sF.getEmail()));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("Facture commande N° " + c.getId());
        message.setText("Commande N° " + c.getId() + "\n\nDate commande : " + c.getDateCommande() + "\n\nEntreprise N° " + c.getEntreprise().getId() + "\n\nNom entreprise : " + c.getEntreprise().getNomEntreprise() + "\n\nNombre de cartes commandees : " + c.getNbCartes() + "\n\nMontant total TTC : " + c.getMontantTotal() + " euros" + "\n\nCommentaires : " + c.getCommentaires());

        Transport tr = session.getTransport("smtp");
        tr.connect(smtpHost, sF.getEmail(), sF.getPassword());
        message.saveChanges();
        tr.sendMessage(message,message.getAllRecipients());
        tr.close();
        
        commande.setStatut(true);
        services.miseAJourCommande(commande);
    }

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServiceFacturation != null ? idServiceFacturation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceFacturation)) {
            return false;
        }
        ServiceFacturation other = (ServiceFacturation) object;
        if ((this.idServiceFacturation == null && other.idServiceFacturation != null) || (this.idServiceFacturation != null && !this.idServiceFacturation.equals(other.idServiceFacturation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modele.ServiceFacturation[ id service facturation=" + idServiceFacturation + ", email=" + getEmail() + ", password=" + password + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                        /*Fin classe ServiceFacturation*/