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
import services.ServicesImpl;

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
    
    public Long getId() {
        return idEntreprise;
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
    
    //Changer l'adresse de l'entreprise
    public void demenager(String adresse) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.idEntreprise);
        e.setAdresse(adresse);
        services.miseAJourEntreprise(e);
    }
    
    //Changer le nom de l'entreprise
    public void changerNom(String nom) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.idEntreprise);
        e.setNomEntreprise(nom);
        services.miseAJourEntreprise(e);
    }
    
    //Changer l'email du compte de l'entreprise
    public void changerEmail(String email) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.idEntreprise);
        e.setEmail(email);
        services.miseAJourEntreprise(e);
    }
    
    //Changer le mot de passe du compte de l'entreprise
    public void changerPassword(String password) {
        ServicesImpl services = new ServicesImpl();
        Entreprise e = services.findEntrepriseById(this.idEntreprise);
        e.setPassword(password);
        services.miseAJourEntreprise(e);
    }
    
    //Nouvelle commande de cartes avec commentaire
    public void nouvelleCommande(long nbCartes, String commentaire) {
        ServicesImpl services = new ServicesImpl();
        Commande c = new Commande(this, nbCartes, commentaire);
        services.referencerCommande(c);
    }
    
    //Nouvelle commande de cartes sans commentaire
    public void nouvelleCommande(long nbCartes) {
        ServicesImpl services = new ServicesImpl();
        Commande c = new Commande(this, nbCartes);
        services.referencerCommande(c);
    }
    
    //Recharger la carte d'un employe
    public void rechargerCarte(Employe employe, int montant) {
        ServicesImpl services = new ServicesImpl();
        Carte c = services.findCarteByIdEmploye(employe.getId());
        c.recharger(montant);
        services.miseAJourCarte(c);
    }
    
    //Recharger une carte
    public void rechargerCarte(Carte carte, int montant) {
        ServicesImpl services = new ServicesImpl();
        carte.recharger(montant);
        services.miseAJourCarte(carte);
    }
    
    //Changer le montant max journalier d'une carte
    public void changerMontantMaxJournalier(Carte carte, int montant) {
        ServicesImpl services = new ServicesImpl();
        carte.changerMontantMaxJournalier(montant);
        services.miseAJourCarte(carte);
    }
    
    //Changer le montant max journalier de la carte d'un employe
    public void changerMontantMaxJournalier(Employe employe, int montant) {
        ServicesImpl services = new ServicesImpl();
        Carte c = services.findCarteByIdEmploye(employe.getId());
        c.changerMontantMaxJournalier(montant);
        services.miseAJourCarte(c);
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