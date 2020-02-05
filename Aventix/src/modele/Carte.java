                               /*Classe Carte*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Carte implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarte;
    
    private boolean validite;
    private int montantMaxJournalier;
    private float solde;
    private Long idEmploye;

/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Carte() {
        this.idEmploye = 0L;
        this.montantMaxJournalier = 0;
        this.solde = 0;
        this.validite = false;
    }
    
//Constructeur par valeurs 1
    
    public Carte(Long idEmploye, int montantMaxJournalier) {
        this.idEmploye = idEmploye;
        this.montantMaxJournalier = montantMaxJournalier;
        this.solde = 0;
        this.validite = true;
    }
    
//Constructeur par valeurs 2
    
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public int getIdCarte() {
        return hashCode();
    }
    
    public Long getIdEmploye() {
        return idEmploye;
    }
    
    public int getMontantMaxJournalier() {
        return montantMaxJournalier;
    }
    
    public float getSolde() {
        return solde;
    }
    
    public boolean getValidite() {
        return validite;
    }
    
/*----------------------------------Setters-----------------------------------*/
   
    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
    }
    
    public void setMontantMaxJournalier(int montantMaxJournalier) {
        this.montantMaxJournalier = montantMaxJournalier;
    }
    
    public void setSolde(float solde) {
        this.solde = solde;
    }
    
    public void setValidite(boolean validite) {
        this.validite = validite;
    }
    
/*-----------------------------------Others-----------------------------------*/
    


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
        return "modele.Carte[ id carte=" + idCarte + ", id employe=" + idEmploye + ", montant max journalier=" + montantMaxJournalier + ", solde=" + solde + ", validite=" + validite + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Carte*/