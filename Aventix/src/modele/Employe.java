                               /*Classe Employe*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import services.ServicesImpl;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Employe implements Serializable {
    
/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    
    @ManyToOne
    private Entreprise entreprise;
    
    @OneToOne
    private Carte carte;
    
    private String prenom, nom, adresse, email, password;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Employe() {
        this.prenom = "John";
        this.nom = "Doe";
        this.adresse = "";
        this.email = this.getPrenom().toLowerCase().replace(" ", "-") + "." + this.getNom().toLowerCase().replace(" ", "") + "@aventix.fr";
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
    }
    
//Constructeur par valeurs 1
    
    public Employe(String prenom, String nom, String adresse, String email, Entreprise entreprise, Carte carte) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.entreprise = entreprise;
        this.carte = carte;
    }
    
//Constructeur par valeurs 2
    
    public Employe(String prenom, String nom, String email, Entreprise entreprise, Carte carte) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = "";
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.entreprise = entreprise;
        this.carte = carte;
    }
    
//Constructeur par valeurs 3
    
    public Employe(String prenom, String nom, String adresse, String email, Entreprise entreprise) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.entreprise = entreprise;
    }
    
//Constructeur par valeurs 4
    
    public Employe(String prenom, String nom, String email, Entreprise entreprise) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = "";
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.entreprise = entreprise;
    }
    
//Constructeur par valeurs 5
    
    public Employe(String prenom, String nom, String adresse, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
    }
    
//Constructeur par valeurs 6
    
    public Employe(String prenom, String nom, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = "";
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
    }
    
//Constructeur par valeurs 7
    
    public Employe(String prenom, String nom, String adresse, String email, Carte carte) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.carte = carte;
    }
    
//Constructeur par valeurs 8
    
    public Employe(String prenom, String nom, String email, Carte carte) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = "";
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.carte = carte;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idEmploye;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public Entreprise getEntreprise() {
        return entreprise;
    }
    
    public Carte getCarte() {
        return carte;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
    
    public void setCarte(Carte carte) {
        this.carte = carte;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    //Changer l'adresse de l'employe
    public void demenager(String adresse) {
        ServicesImpl services = new ServicesImpl();
        Employe e = services.findEmployeById(this.idEmploye);
        e.setAdresse(adresse);
        services.miseAJourEmploye(e);
    }
    
    //Changer le nom de famille de l'employe
    public void marier(String nom) {
        ServicesImpl services = new ServicesImpl();
        Employe e = services.findEmployeById(this.idEmploye);
        e.setNom(nom);
        services.miseAJourEmploye(e);
    }
    
    //Changer l'email du compte de l'employe
    public void changerEmail(String email) {
        ServicesImpl services = new ServicesImpl();
        Employe e = services.findEmployeById(this.idEmploye);
        e.setEmail(email);
        services.miseAJourEmploye(e);
    }
    
    //Changer le mot de passe du compte de l'employe
    public void changerPassword(String password) {
        ServicesImpl services = new ServicesImpl();
        Employe e = services.findEmployeById(this.idEmploye);
        e.setPassword(password);
        services.miseAJourEmploye(e);
    }
    
    //Affecter la carte à l'employe
    public void affecterCarte(Carte carte) {
        ServicesImpl services = new ServicesImpl();
        Employe e = services.findEmployeById(this.idEmploye);
        e.setCarte(carte);
        services.miseAJourEmploye(e);
        carte.setEmploye(e);
        services.miseAJourCarte(carte);
    }
    
    //Consulter le solde de la carte de l'employe
    public float consulterSolde() {
        ServicesImpl services = new ServicesImpl();
        return services.findCarteByIdEmploye(this.idEmploye).getSolde();
    }
    
    //Consulter toutes les transactions effectuées par l'employe
    public List<Transa> historiqueTransas() {
        ServicesImpl services = new ServicesImpl();
        return services.findTransaByIdCarte(this.getCarte().getId());
    }
    
    //Verification password
    public boolean verifLogin(String email, String password) {
        ServicesImpl services = new ServicesImpl();
        Employe e = services.findEmployeByEmail(this.email);
        return (e.password.equals(password));
    }
    
    //Mot de passe oublie
    public void passwordOublie() throws AddressException, MessagingException {
        ServicesImpl services = new ServicesImpl();
        Employe e = services.findEmployeById(this.idEmploye);
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
        message.setSubject("Nouveau mot de passe");
        message.setText("Vous recevez ce mail si vous avez oublie votre mot de passe. Si ce n'est pas votre demarche, contactez votre administrateur.\n\nVotre mot de passe est : " + e.getPassword() + "\n\nIl vous est conseille de changer votre mot de passe des maintenant.");
        Transport tr = session.getTransport("smtp");
        tr.connect(smtpHost, sF.getEmail(), sF.getPassword());
        message.saveChanges();
        tr.sendMessage(message,message.getAllRecipients());
        tr.close();
    }

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmploye != null ? idEmploye.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        if ((this.idEmploye == null && other.idEmploye != null) || (this.idEmploye != null && !this.idEmploye.equals(other.idEmploye))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "modele.Employe[ idEmploye=" + idEmploye + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", email=" + email + ", password=" + password + ", entreprise=" + entreprise + ", carte=" + carte + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Employe*/