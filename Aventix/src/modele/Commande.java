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

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Commande implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCommande;
 
    private Long idEmployeur;
    private long nbCartes;
    private float montantTotal;
    private String commentaires;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCommande;
    
    private DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    final private int prixUnitaire = 10;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Commande() {
        this.idEmployeur = 0L;
        this.nbCartes = 0;
        this.montantTotal = 0;
        this.commentaires = "";
        this.dateCommande = new Date();
    }
    
//Constructeur par valeurs 1
    
    public Commande(Long idEmployeur, long nbCartes, String commentaires) {
        this.idEmployeur = idEmployeur;
        this.nbCartes = nbCartes;
        this.montantTotal = nbCartes * prixUnitaire;
        this.commentaires = commentaires;
        this.dateCommande = new Date();
    }
    
//Constructeur par valeurs 2
    
    public Commande(Long idEmployeur, long nbCartes) {
        this.idEmployeur = idEmployeur;
        this.nbCartes = nbCartes;
        this.montantTotal = nbCartes * prixUnitaire;
        this.dateCommande = new Date();
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public int getIdCommande() {
        return hashCode();
    }
    
    public Long getIdEmployeur() {
        return idEmployeur;
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
    
    public Date getDateCommande() {
        return dateCommande;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setIdEmployeur(Long idEmployeur) {
        this.idEmployeur = idEmployeur;
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
        return "modele.Commande[ id commande=" + idCommande + ", id employeur=" + idEmployeur + ", nb cartes=" + nbCartes + ", montant total=" + montantTotal + ", date=" + shortDateFormat.format(dateCommande) + ", commentaires=" + commentaires + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Commande*/