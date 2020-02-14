                               /*Classe Employe*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Employe implements Serializable {
    
/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    private Long idEntreprise, idCarte;
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
        this.idEntreprise = 0L;
        this.idCarte = 0L;
    }
    
//Constructeur par valeurs 1
    
    public Employe(String prenom, String nom, String adresse, String email, Long idEntreprise, Long idCarte) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.idEntreprise = idEntreprise;
        this.idCarte = idCarte;
    }
    
//Constructeur par valeurs 2
    
    public Employe(String prenom, String nom, String email, Long idEntreprise, Long idCarte) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = "";
        this.email = email;
        this.password = (this.getNom() + this.getPrenom() + "@" + "2020").replace(" ", "");
        this.idEntreprise = idEntreprise;
        this.idCarte = idCarte;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public int getId() {
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
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public Long getIdEntreprise() {
        return idEntreprise;
    }
    
    public Long getIdCarte() {
        return idCarte;
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
    
    public void setIdEntreprise(Long idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setIdCarte(Long idCarte) {
        this.idCarte = idCarte;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    public void demenager(String adresse) {
        this.setAdresse(adresse);
    }
    
    public void marier(String nom) {
        this.setNom(nom);
    }
    
    public void changerEmail(String email) {
        this.setEmail(email);
    }
    
    public void changerPassword(String password) {
        this.setPassword(password);
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
        return "modele.Employe[ idEmploye=" + idEmploye + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", email=" + email + ", password=" + password + ", id employeur=" + idEntreprise + ", id carte=" + idCarte + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Employe*/