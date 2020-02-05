                               /*Classe Employeur*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import javax.persistence.Entity;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Employeur extends Utilisateur {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private String nomSociete, adresseSociete, telSociete;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Employeur() {
        super();
        this.nomSociete = "";
        this.adresseSociete = "";
        this.telSociete = "";
    }
    
//Constructeur par valeurs 1
    
    public Employeur(String prenom, String nom, String adresse, String nomSociete, String adresseSociete, String telSociete) {
        super(prenom, nom, adresse);
        this.nomSociete = nomSociete;
        this.adresseSociete = adresseSociete;
        this.telSociete = telSociete;
    }
    
//Constructeur par valeurs 2
    
    public Employeur(String prenom, String nom, String nomSociete, String adresseSociete, String telSociete) {
        super(prenom, nom);
        this.setAdresse("");
        this.nomSociete = nomSociete;
        this.adresseSociete = adresseSociete;
        this.telSociete = telSociete;
    }

/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public String getNomSociete() {
        return nomSociete;
    }
    
    public String getAdresseSociete() {
        return adresseSociete;
    }
    
    public String getTelSociete() {
        return telSociete;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }
    
    public void setAdresseSociete(String adresseSociete) {
        this.adresseSociete = adresseSociete;
    }
    
    public void setTelSociete(String telSociete) {
        this.telSociete = telSociete;
    }
    
/*-----------------------------------Others-----------------------------------*/
    


/*---------------------------------Surcharges---------------------------------*/

    @Override
    public String toString() {
        return "modele.Employeur[ id=" + this.getIdPersonne() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom() + ", adresse=" + this.getAdresse() + ", identifiant=" + this.getIdentifiant() + ", password=" + this.getPassword() + ", nom societe=" + nomSociete + ", adresse societe=" + adresseSociete + ", tel societe=" + telSociete + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Employeur*/