                            /*Classe Utilisateur*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import javax.persistence.Entity;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Utilisateur extends Personne {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private String identifiant, password;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Utilisateur() {
        super();
        this.identifiant = (this.getPrenom().toLowerCase().charAt(0) + this.getNom().toLowerCase()).replace(" ", "");
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
    }

//Constructeur par valeurs 1
    
    public Utilisateur(String prenom, String nom) {
        super(prenom, nom);
        this.identifiant = (prenom.toLowerCase().charAt(0) + nom.toLowerCase()).replace(" ", "");
        this.password = (nom + prenom + "@" + "2020").replace(" ", "");
    }
    
//Constructeur par valeurs 2
    
    public Utilisateur(String prenom, String nom, String adresse) {
        super(prenom, nom, adresse);
        this.identifiant = (prenom.toLowerCase().charAt(0) + nom.toLowerCase()).replace(" ", "");
        this.password = (nom + prenom + "@" + "2020").replace(" ", "");
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public String getIdentifiant() {
        return identifiant;
    }
    
    public String getPassword() {
        return password;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    public void actualiserIdentifiant() {
        this.setIdentifiant((this.getPrenom().toLowerCase().charAt(0) + this.getNom().toLowerCase()).replace(" ", ""));
    }
    
    public void changerPassword(String password) {
        this.setPassword(password);
    }

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public void marier(String nom) {
        this.setNom(nom);
        this.actualiserIdentifiant();
    }
    
    @Override
    public String toString() {
        return "modele.Utilisateur[ id=" + this.getIdPersonne() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom() + ", adresse=" + this.getAdresse() + ", identifiant=" + identifiant + ", password=" + password + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                           /*Fin Classe Utilisateur*/