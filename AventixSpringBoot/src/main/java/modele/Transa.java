                               /*Classe Transa*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Transa implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransa;
    
    private Long idCarte, idCommercant;
    private float montant;
    @Transient
    private DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateTransa;
    private boolean statut;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Transa() {
        this.idCarte = 0L;
        this.idCommercant = 0L;
        this.dateTransa = new Date();
        this.montant = 0;
        this.statut = false;
    }
    
//Constructeur par valeurs
    
    public Transa(Long idCarte, Long idCommercant, float montant) {
        this.idCarte = idCarte;
        this.idCommercant = idCommercant;
        this.dateTransa = new Date();
        this.montant = montant;
        this.statut = false;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idTransa;
    }
    
    public Long getIdCarte() {
        return this.idCarte;
    }
    
    public Long getIdCommercant() {
        return this.idCommercant;
    }
    
    public Date getDate() {
        return dateTransa;
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
        hash += (idTransa != null ? idTransa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transa)) {
            return false;
        }
        Transa other = (Transa) object;
        if ((this.idTransa == null && other.idTransa != null) || (this.idTransa != null && !this.idTransa.equals(other.idTransa))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "modele.Transaction[ id transaction=" + idTransa + ", id carte=" + idCarte + ", idCommercant=" + idCommercant + ", date=" + dateTransa + ", montant=" + montant + ", statut=" + statut + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Transa*/