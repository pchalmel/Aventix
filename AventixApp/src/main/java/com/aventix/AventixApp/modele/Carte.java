                               /*Classe Carte*/

package com.aventix.AventixApp.modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.aventix.AventixApp.services.ServicesImpl;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Carte implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarte;
    
    @OneToOne
    private Employe employe;
    
    private boolean validite;
    private int montantMaxJournalier;
    private float solde;

/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Carte() {
        this.validite = false;
        this.montantMaxJournalier = 0;
        this.solde = 0;
    }
    
//Constructeur par valeurs
    
    public Carte(int montantMaxJournalier) {
        this.validite = true;
        this.montantMaxJournalier = montantMaxJournalier;
        this.solde = 0;
    }    
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idCarte;
    }
    
    public Employe getEmploye() {
        return employe;
    }
    
    public boolean getValidite() {
        return validite;
    }
    
    public int getMontantMaxJournalier() {
        return montantMaxJournalier;
    }
    
    public float getSolde() {
        return solde;
    }
    
/*----------------------------------Setters-----------------------------------*/
   
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
    public void setValidite(boolean validite) {
        this.validite = validite;
    }
    
    public void setMontantMaxJournalier(int montantMaxJournalier) {
        this.montantMaxJournalier = montantMaxJournalier;
    }
    
    public void setSolde(float solde) {
        this.solde = solde;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    public void recharger(int montant) {
        this.solde += montant;
    }
    
    public void changerMontantMaxJournalier(int montant) {
        this.setMontantMaxJournalier(montant);
    }
    
    //Affecter l'employe à la carte
    public void affecterEmploye(Employe employe) {
        ServicesImpl services = new ServicesImpl();
        Carte c = services.findCarteById(this.getId());
        c.setEmploye(employe);
        services.miseAJourCarte(c);
        employe.setCarte(c);
        services.miseAJourEmploye(employe);
    }

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarte != null ? idCarte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carte)) {
            return false;
        }
        Carte other = (Carte) object;
        if ((this.idCarte == null && other.idCarte != null) || (this.idCarte != null && !this.idCarte.equals(other.idCarte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modele.Carte[ id carte=" + idCarte + ", employe=" + this.getEmploye().getId() + ", validite=" + validite + ", montant max journalier=" + montantMaxJournalier + ", solde=" + solde + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Carte*/