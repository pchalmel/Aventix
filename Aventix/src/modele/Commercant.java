                               /*Classe Commercant*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import javax.persistence.Entity;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Commercant extends Utilisateur {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private String nomCommercant, adresseCommercant, telCommercant;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Commercant() {
        super();
        this.nomCommercant = "";
        this.adresseCommercant = "";
        this.telCommercant = "";
    }
    
//Constructeur par valeurs 1
    
    public Commercant(String prenom, String nom, String adresse, String nomCommercant, String adresseCommercant, String telCommercant) {
        super(prenom, nom, adresse);
        this.nomCommercant = nomCommercant;
        this.adresseCommercant = adresseCommercant;
        this.telCommercant = telCommercant;
    }
    
//Constructeur par valeurs 2
    
    public Commercant(String prenom, String nom, String nomCommercant, String adresseCommercant, String telCommercant) {
        super(prenom, nom);
        this.nomCommercant = nomCommercant;
        this.adresseCommercant = adresseCommercant;
        this.telCommercant = telCommercant;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public String getNomCommercant() {
        return nomCommercant;
    }
    
    public String getAdresseCommercant() {
        return adresseCommercant;
    }
    
    public String getTelCommercant() {
        return telCommercant;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setNomCommercant(String nomComemrcant) {
        this.nomCommercant = nomCommercant;
    }
    
    public void setAdresseCommercant(String adresseCommercant) {
        this.adresseCommercant = adresseCommercant;
    }
    
    public void setTelCommercant(String telCommercant) {
        this.telCommercant = telCommercant;
    }
    
/*-----------------------------------Others-----------------------------------*/
    


/*---------------------------------Surcharges---------------------------------*/

    @Override
    public String toString() {
        return "modele.Commercant[ idPersonne=" + this.getIdPersonne() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom() + ", adresse=" + this.getAdresse() + ", identifiant=" + this.getIdentifiant() + ", password=" + this.getPassword() + ", nom commercant=" + nomCommercant + ", adresseCommercant=" + adresseCommercant + ", telCommercant=" + telCommercant + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Commercant*/