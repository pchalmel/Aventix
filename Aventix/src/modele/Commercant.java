                               /*Classe Commercant*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import services.ServicesImpl;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Commercant implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommercant;
    
    private String nomCommercant, email, password, adresse, telephone, iban;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Commercant() {
        this.nomCommercant = "";
        this.email = "";
        this.password = "";
        this.adresse = "";
        this.telephone = "";
        this.iban = "";
    }
    
//Constructeur par valeurs
    
    public Commercant(String nomCommercant, String email, String adresse, String telephone, String iban) {
        this.nomCommercant = nomCommercant;
        this.email = email;
        this.password = (this.getNomCommercant() + "@" + "2020").replace(" ", "");
        this.adresse = adresse;
        this.telephone = telephone;
        this.iban = iban;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idCommercant;
    }
    
    public String getNomCommercant() {
        return nomCommercant;
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
    
    public String getIban() {
        return iban;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setNomCommercant(String nomCommercant) {
        this.nomCommercant = nomCommercant;
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
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    //Changer l'adresse du commerce
    public void demenager(String adresse) {
        ServicesImpl services = new ServicesImpl();
        Commercant c = services.findCommercantById(this.getId());
        c.setAdresse(adresse);
        services.miseAJourCommercant(c);
    }
    
    //Changer le nom du commerce
    public void changerNom(String nom) {
        ServicesImpl services = new ServicesImpl();
        Commercant c = services.findCommercantById(this.getId());
        c.setNomCommercant(nom);
        services.miseAJourCommercant(c);
    }
    
    //Changer l'email du compte du commercant
    public void changerEmail(String email) {
        ServicesImpl services = new ServicesImpl();
        Commercant c = services.findCommercantById(this.getId());
        c.setEmail(email);
        services.miseAJourCommercant(c);
    }
    
    //Changer le mot de passe du compte du commercant
    public void changerPassword(String password) {
        ServicesImpl services = new ServicesImpl();
        Commercant c = services.findCommercantById(this.getId());
        c.setPassword(password);
        services.miseAJourCommercant(c);
    }
    
    //Changer l'IBAN du compte du commercant
    public void changerIban(String iban) {
        ServicesImpl services = new ServicesImpl();
        Commercant c = services.findCommercantById(this.getId());
        c.setIban(iban);
        services.miseAJourCommercant(c);
    }

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommercant != null ? idCommercant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commercant)) {
            return false;
        }
        Commercant other = (Commercant) object;
        if ((this.idCommercant == null && other.idCommercant != null) || (this.idCommercant != null && !this.idCommercant.equals(other.idCommercant))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "modele.Commercant[ idCommercant=" + idCommercant + ", nom commercant=" + nomCommercant + ", email=" + email + ", password=" + password + ", adresse=" + adresse + ", telephone=" + telephone + ", iban=" + iban + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Commercant*/