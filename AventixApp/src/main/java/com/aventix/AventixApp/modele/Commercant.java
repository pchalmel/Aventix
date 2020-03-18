                               /*Classe Commercant*/

package com.aventix.AventixApp.modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.aventix.AventixApp.services.ServicesImpl;

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
    
    public Commercant(String nomCommercant, String email, String password, String adresse, String telephone, String iban) {
        this.nomCommercant = nomCommercant;
        this.email = email;
        this.password = password;
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
    
    //Editer le compte (adresse, nom Commercant, email, password, iban, telephone)
    public void editerCompteCommercant(String adresse, String nomCommercant, String email, String password, String iban, String telephone) {
        ServicesImpl services = new ServicesImpl();
        Commercant c = services.findCommercantById(this.getId());
        c.setAdresse(adresse);
        c.setNomCommercant(nomCommercant);
        c.setEmail(email);
        c.setPassword(password);
        c.setIban(iban);
        c.setTelephone(telephone);
        services.miseAJourCommercant(c);
    }
    
    //Verification password
    public boolean verifLogin(String email, String password) {
        ServicesImpl services = new ServicesImpl();
        Commercant c = services.findCommercantByEmail(this.getEmail());    
        return (c.getPassword().equals(password));
    }
    
    //Afficher l'historique des transactions
    public List<Transa> historiqueTransas() {
        ServicesImpl services = new ServicesImpl();
        return services.findTransaByIdCommercant(this.getId());
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
        return "nom commercant=" + nomCommercant + ", email=" + email + ", adresse=" + adresse + ", telephone=" + telephone + ", iban=" + iban;
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Commercant*/