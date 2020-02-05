                            /*Classe Personne*/

package modele;

/*---------------------------------IMPORTS------------------------------------*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Personne implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    //idPersonne géré et incrémenté automatiquement
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersonne;
    
    private String prenom, nom, adresse;

/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
    //Constructeur par défault
    public Personne() {
        this.prenom = "John";
        this.nom = "Doe";
        this.adresse = "";
    } 
    
    //Constructeur par valeurs 1
    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = "";
    }
    
    //Constructeur par valeurs 2
    public Personne(String prenom, String nom, String adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*---------------------------------METHODES-----------------------------------*/
/*---------------------------------Getters------------------------------------*/
    
    public int getIdPersonne() {
        return hashCode();
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
    
/*---------------------------------Setters------------------------------------*/
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
/*---------------------------------Others-------------------------------------*/
    
    public void demenager(String adresse) {
        this.setAdresse(adresse);
    }
    
    public void marier(String nom) {
        this.setNom(nom);
    }

/*--------------------------------Surcharges----------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonne != null ? idPersonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.idPersonne == null && other.idPersonne != null) || (this.idPersonne != null && !this.idPersonne.equals(other.idPersonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modele.Personne[ idPersonne=" + this.hashCode() + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin Classe Personne*/