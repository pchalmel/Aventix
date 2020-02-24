                               /*Classe Commande*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class Commande implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
 
    @ManyToOne
    private Entreprise entreprise;
    
    private long nbCartes;
    private float montantTotal;
    private String commentaires;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCommande;
    private boolean statut;
    //@Transient
    private DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    //@Transient
    final private int prixUnitaire = 10;
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public Commande() {
        this.dateCommande = new Date();
        this.nbCartes = 0;
        this.montantTotal = 0;
        this.commentaires = "";
        this.statut = false;
    }
    
//Constructeur par valeurs 1
    
    public Commande(Entreprise entreprise, long nbCartes, String commentaires) {
        this.entreprise = entreprise;
        this.dateCommande = new Date();
        this.nbCartes = nbCartes;
        this.montantTotal = nbCartes * prixUnitaire;
        this.commentaires = commentaires;
        this.statut = false;
    }
    
//Constructeur par valeurs 2
    
    public Commande(Entreprise entreprise, long nbCartes) {
        this.entreprise = entreprise;
        this.dateCommande = new Date();
        this.nbCartes = nbCartes;
        this.montantTotal = nbCartes * prixUnitaire;
        this.commentaires = "";
        this.statut = false;
    }
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idCommande;
    }
    
    public Entreprise getEntreprise() {
        return entreprise;
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
    
    public boolean getStatut() {
        return statut;
    }
    
/*----------------------------------Setters-----------------------------------*/
    
    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
    
    public void setNbCartes(long nbCartes) {
        this.nbCartes = nbCartes;
    }
    
    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }
    
    public void setStatut(boolean statut) {
        this.statut = statut;
    }
    
/*-----------------------------------Others-----------------------------------*/

    //Ajoute un nombre de jour a une date
    public Date ajouterJour(Date date, int nbJour) { 
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(date);
        cal.add(Calendar.DATE, nbJour);
        return cal.getTime();
    }

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
        return "modele.Commande[ id commande=" + idCommande + ", entreprise=" + this.getEntreprise().getNomEntreprise() + ", date=" + shortDateFormat.format(dateCommande) + ", nb cartes=" + nbCartes + ", montant total=" + montantTotal + ", commentaires=" + commentaires + ", statut=" + statut + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe Commande*/