                               /*Classe Entreprise*/

package com.aventix.AventixApp.modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.aventix.AventixApp.services.ServicesImpl;
import java.util.List;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Entreprise implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntreprise;
    
    @OneToMany(mappedBy="entreprise")
    private Collection<Employe> employes;
    
    @OneToMany(mappedBy="entreprise")
    private Collection<Commande> commandes;
    
    private String nomEntreprise, email, password, adresse, telephone;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Entreprise() {
        this.nomEntreprise = "";
        this.email = "";
        this.password = "";
        this.adresse = "";
        this.telephone = "";
    }
    
//Constructeur par valeurs
    
    public Entreprise(String nomEntreprise, String email, String adresse, String telephone) {
        this.nomEntreprise = nomEntreprise;
        this.email = email;
        this.password = (this.getNomEntreprise() + "@" + "2020").replace(" ", "");
        this.adresse = adresse;
        this.telephone = telephone;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idEntreprise;
    }
    
    public String getNomEntreprise() {
        return nomEntreprise;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    //Changer l'adresse de l'entreprise
    public void demenager(String adresse) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.getId());
        e.setAdresse(adresse);
        services.miseAJourEntreprise(e);
    }
    
    //Changer le nom de l'entreprise
    public void changerNom(String nom) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.getId());
        e.setNomEntreprise(nom);
        services.miseAJourEntreprise(e);
    }
    
    //Changer l'email du compte de l'entreprise
    public void changerEmail(String email) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.getId());
        e.setEmail(email);
        services.miseAJourEntreprise(e);
    }
    
    //Changer le mot de passe du compte de l'entreprise
    public void changerPassword(String password) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.getId());
        e.setPassword(password);
        services.miseAJourEntreprise(e);
    }
    
    //Nouvelle commande de cartes avec commentaire
    public void nouvelleCommande(long nbCartes, String commentaire) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.getId());
        Commande c = new Commande(e, nbCartes, commentaire);
        services.referencerCommande(c);
    }
    
    //Nouvelle commande de cartes sans commentaire
    public void nouvelleCommande(long nbCartes) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.getId());
        Commande c = new Commande(e, nbCartes);
        services.referencerCommande(c);
    }
    
    //Recharger la carte d'un employe
    public void rechargerCarte(Employe employe, int montant) {
        ServicesImpl services = new ServicesImpl();
        Carte c = services.findCarteByIdEmploye(employe.getId());
        c.recharger(montant);
        services.miseAJourCarte(c);
    }
    
    //Recharger une carte
    public void rechargerCarte(Carte carte, int montant) {
        ServicesImpl services = new ServicesImpl();
        carte.recharger(montant);
        services.miseAJourCarte(carte);
    }
    
    //Changer le montant max journalier d'une carte
    public void changerMontantMaxJournalier(Carte carte, int montant) {
        ServicesImpl services = new ServicesImpl();
        carte.changerMontantMaxJournalier(montant);
        services.miseAJourCarte(carte);
    }
    
    //Changer le montant max journalier de la carte d'un employe
    public void changerMontantMaxJournalier(Employe employe, int montant) {
        ServicesImpl services = new ServicesImpl();
        Carte c = services.findCarteByIdEmploye(employe.getId());
        c.changerMontantMaxJournalier(montant);
        services.miseAJourCarte(c);
    }
    
    //Verification password
    public boolean verifLogin(String email, String password) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseByEmail(this.getEmail());    
        return (e.getPassword().equals(password));
    }
    
    //Ajout d'un nouvel employe
    public void nouvelEmploye(Employe e) throws AddressException, MessagingException {
        ServicesImpl services = new ServicesImpl();
        services.referencerEmploye(e);
        //Configuration du serveur smtp
        String smtpHost = "smtp.gmail.com";
        String to = e.getEmail();

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
        message.setSubject("Bienvenue dans le systeme Aventix !");
        message.setText("Bonjour " + e.getPrenom() + ",\n\nBienvenue dans le systeme de paiement Aventix, votre login et mot de passe sont les suivant (ne jamais communiquer a quiconque sous aucun pretexte) :\n\nLogin : " + e.getEmail() + "\nMot de passe : " + e.getPassword() + "\n\nVeuillez changer de mot de passe immediatement apres lecture de ce mail.\n\nCordialement,\nL'equipe Aventix");
        Transport tr = session.getTransport("smtp");
        tr.connect(smtpHost, sF.getEmail(), sF.getPassword());
        message.saveChanges();
        tr.sendMessage(message,message.getAllRecipients());
        tr.close();
    }
    
    //Modifier la commande (dans les 5 jours)
    public void modifierCommande(Commande c) {
        ServicesImpl services = new ServicesImpl();
        Date now = new Date();
        if (services.findCommandeById(c.getId()).ajouterJour(services.findCommandeById(c.getId()).getDateCommande(), 5).after(now)) {
            services.miseAJourCommande(c);
        }
    }
    
    //Annuler une commande
    public void annulerCommande(Commande c) {
        ServicesImpl services = new ServicesImpl();
        Date now = new Date();
        if (services.findCommandeById(c.getId()).ajouterJour(services.findCommandeById(c.getId()).getDateCommande(), 5).after(now)) {
            services.dereferencerCommande(c);
        }
    }
        
    //Liste toutes les cartes
    public List<Carte> listeCartes() {
        ServicesImpl services = new ServicesImpl();
        return services.findCarteByIdEntreprise(this.getId());
    }

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntreprise != null ? idEntreprise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entreprise)) {
            return false;
        }
        Entreprise other = (Entreprise) object;
        if ((this.idEntreprise == null && other.idEntreprise != null) || (this.idEntreprise != null && !this.idEntreprise.equals(other.idEntreprise))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "modele.Entreprise[ idEntreprise=" + idEntreprise + ", nom entreprise=" + nomEntreprise + ", email=" + email + ", password=" + password + ", adresse=" + adresse + ", telephone=" + telephone + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Employeur*/