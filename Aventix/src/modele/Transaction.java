                               /*Classe Transaction*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Transaction implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;
    
    private Long idCarte, idCommercant;
    private float montant;
    @Transient
    private DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    private Date dateTransaction;
    private boolean statut;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Transaction() {
        this.idCarte = 0L;
        this.idCommercant = 0L;
        this.dateTransaction = new Date();
        this.montant = 0;
        this.statut = false;
    }
    
//Constructeur par valeurs
    
    public Transaction(Long idCarte, Long idCommercant, float montant) {
        this.idCarte = idCarte;
        this.idCommercant = idCommercant;
        this.dateTransaction = new Date();
        this.montant = montant;
        this.statut = false;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public int getId() {
        return hashCode();
    }
    
    public Long getIdCarte() {
        return this.idCarte;
    }
    
    public Long getIdCommercant() {
        return this.idCommercant;
    }
    
    public Date getDate() {
        return dateTransaction;
    }
    
    public float getMontant() {
        return montant;
    }
    
    public boolean getStatut() {
        return statut;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setIdCarte(Long idCarte) {
        this.idCarte = idCarte;
    }
    
    public void setIdCommercant(Long idCommercant) {
        this.idCommercant = idCommercant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }
    
    public void setStatut(boolean statut) {
        this.statut = statut;
    }

/*-----------------------------------Others-----------------------------------*/
    

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaction != null ? idTransaction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.idTransaction == null && other.idTransaction != null) || (this.idTransaction != null && !this.idTransaction.equals(other.idTransaction))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "modele.Transaction[ id transaction=" + idTransaction + ", id carte=" + idCarte + ", idCommercant=" + idCommercant + ", date=" + dateTransaction + ", montant=" + montant + ", statut=" + statut + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Transaction*/