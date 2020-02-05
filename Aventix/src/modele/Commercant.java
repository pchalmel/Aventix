                               /*Classe Commercant*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import javax.persistence.Entity;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Commercant extends Utilisateur {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private String nomCommercant, telCommercant;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Commercant() {
        super();
        this.nomCommercant = "";
        this.telCommercant = "";
    }
    
//Constructeur par valeurs 1
    
    public Commercant(String prenom, String nom, String adresse, String nomCommercant, String telCommercant) {
        super(prenom, nom, adresse);
        this.nomCommercant = nomCommercant;
        this.telCommercant = telCommercant;
    }
    
//Constructeur par valeurs 2
    
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public String getNomCommercant() {
        return nomCommercant;
    }
    
    public String getTelCommercant() {
        return telCommercant;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setNomCommercant(String nomComemrcant) {
        this.nomCommercant = nomCommercant;
    }
    
    public void setTelCommercant(String telCommercant) {
        this.telCommercant = telCommercant;
    }
    
/*-----------------------------------Others-----------------------------------*/
    


/*---------------------------------Surcharges---------------------------------*/

    @Override
    public String toString() {
        return "modele.Commercant[ id=" + this.getIdPersonne() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom() + ", adresse=" + this.getAdresse() + ", identifiant=" + this.getIdentifiant() + ", password=" + this.getPassword() + ", nom commercant=" + nomCommercant + ", telCommercant=" + telCommercant + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Commercant*/