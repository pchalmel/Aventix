                               /*Classe Employe*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import javax.persistence.Entity;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Employe extends Utilisateur {
    
/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private Long idEmployeur, idCarte;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Employe() {
        super();
        this.idEmployeur = 0L;
        this.idCarte = 0L;
    }
    
//Constructeur par valeurs 1
    
    public Employe(String prenom, String nom, String adresse, Long idEmployeur, Long idCarte) {
        super(prenom, nom, adresse);
        this.idEmployeur = idEmployeur;
        this.idCarte = idCarte;
    }
    
//Constructeur par valeurs 2
    
    public Employe(String prenom, String nom, Long idEmployeur, Long idCarte) {
        super(prenom, nom);
        this.idEmployeur = idEmployeur;
        this.idCarte = idCarte;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getIdEmployeur() {
        return idEmployeur;
    }
    
    public Long getIdCarte() {
        return idCarte;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setIdEmployeur(Long idEmployeur) {
        this.idEmployeur = idEmployeur;
    }
    
    public void setIdCarte(Long idCarte) {
        this.idCarte = idCarte;
    }
    
/*-----------------------------------Others-----------------------------------*/
    


/*---------------------------------Surcharges---------------------------------*/

    @Override
    public String toString() {
        return "modele.Employe[ id=" + this.getIdPersonne() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom() + ", adresse=" + this.getAdresse() + ", identifiant=" + this.getIdentifiant() + ", password=" + this.getPassword() + ", id employeur=" + idEmployeur + ", id carte=" + idCarte + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Employe*/