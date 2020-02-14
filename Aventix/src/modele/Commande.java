                               /*Classe Commande*/

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
public class Commande implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
 
    private Long idEntreprise;
    private long nbCartes;
    private float montantTotal;
    private String commentaires;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCommande;
    @Transient
    private DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    @Transient
    final private int prixUnitaire = 10;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Commande() {
        this.idEntreprise = 0L;
        this.dateCommande = new Date();
        this.nbCartes = 0;
        this.montantTotal = 0;
        this.commentaires = "";
    }
    
//Constructeur par valeurs 1
    
    public Commande(Long idEntreprise, long nbCartes, String commentaires) {
        this.idEntreprise = idEntreprise;
        this.dateCommande = new Date();
        this.nbCartes = nbCartes;
        this.montantTotal = nbCartes * prixUnitaire;
        this.commentaires = commentaires;
    }
    
//Constructeur par valeurs 2
    
    public Commande(Long idEntreprise, long nbCartes) {
        this.idEntreprise = idEntreprise;
        this.dateCommande = new Date();
        this.nbCartes = nbCartes;
        this.montantTotal = nbCartes * prixUnitaire;
        this.commentaires = "";
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public int getId() {
        return hashCode();
    }
    
    public Long getIdEntreprise() {
        return idEntreprise;
    }
    
    public Date getDateCommande() {
        return dateCommande;
    }
    
    public long getNbCartes() {
        return nbCartes;
    }
    
    public float getMontantTotal() {
        return montantTotal;
    }
    
    public String getCommentaires() {
        return commentaires;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setIdEntreprise(Long idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setNbCartes(long nbCartes) {
        this.nbCartes = nbCartes;
    }
    
    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }
    
/*-----------------------------------Others-----------------------------------*/
    


/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommande != null ? idCommande.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.idCommande == null && other.idCommande != null) || (this.idCommande != null && !this.idCommande.equals(other.idCommande))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modele.Commande[ id commande=" + idCommande + ", id entreprise=" + idEntreprise + ", date=" + shortDateFormat.format(dateCommande) + ", nb cartes=" + nbCartes + ", montant total=" + montantTotal + ", commentaires=" + commentaires + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Commande*/