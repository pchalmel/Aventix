                               /*Classe Entreprise*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Entreprise implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntreprise;
    
    @OneToMany(mappedBy="entreprise", cascade = CascadeType.PERSIST)
    private Collection<Employe> employes;
    
    @OneToMany(mappedBy="entreprise", cascade = CascadeType.PERSIST)
    private Collection<Commande> commandes;
    
    private String nomEntreprise, email, password, adresse, telephone;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Entreprise() {
        this.nomEntreprise = "";
        this.email = "";
        this.password = "";
        this.adresse = "";
        this.telephone = "";
    }
    
//Constructeur par valeurs
    
    public Entreprise(String nomEntreprise, String email, String adresse, String telephone) {
        this.nomEntreprise = nomEntreprise;
        this.email = email;
        this.password = (this.getNomEntreprise() + "@" + "2020").replace(" ", "");
        this.adresse = adresse;
        this.telephone = telephone;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public int getId() {
        return hashCode();
    }
    
    public String getNomEntreprise() {
        return nomEntreprise;
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
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
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
    
/*-----------------------------------Others-----------------------------------*/
    
    public void demenager(String adresse) {
        this.setAdresse(adresse);
    }
    
    public void changerNom(String nom) {
        this.setNomEntreprise(nom);
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
        hash += (idEntreprise != null ? idEntreprise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entreprise)) {
            return false;
        }
        Entreprise other = (Entreprise) object;
        if ((this.idEntreprise == null && other.idEntreprise != null) || (this.idEntreprise != null && !this.idEntreprise.equals(other.idEntreprise))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "modele.Entreprise[ idEntreprise=" + idEntreprise + ", nom entreprise=" + nomEntreprise + ", email=" + email + ", password=" + password + ", adresse=" + adresse + ", telephone=" + telephone + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Employeur*/