                               /*Classe Commercant*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    
    public int getId() {
        return hashCode();
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
    
    public void demenager(String adresse) {
        this.setAdresse(adresse);
    }
    
    public void changerNom(String nom) {
        this.setNomCommercant(nom);
    }
    
    public void changerEmail(String email) {
        this.setEmail(email);
    }
    
    public void changerPassword(String password) {
        this.setPassword(password);
    }
    
    public void changerIban(String iban) {
        this.setIban(iban);
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