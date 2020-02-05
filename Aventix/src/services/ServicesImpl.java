                    /*Implementation Interface Services*/

package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import javax.persistence.EntityTransaction;
import modele.*;
import dao.*;
import java.util.Date;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class ServicesImpl implements ServicesPersonne, ServicesUtilisateur, ServicesEmployeur, ServicesEmploye, ServicesCommercant, ServicesCommande, ServicesCarte {
    
/*---------------------------------PERSONNES----------------------------------*/
    
    public void referencerPersonne(Personne p) {
        PersonneDao dao = new PersonneDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createPersonne(p);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void dereferencerPersonne(Personne p) {
        PersonneDao dao = new PersonneDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deletePersonne(p);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void miseAJourPersonne(Personne p) {
        PersonneDao dao = new PersonneDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updatePersonne(p);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public List<Personne> findAllPersonnes() {
        PersonneDao dao = new PersonneDao();
        return dao.findAllPersonnes();
    }
    
    public List<Personne> findPersonneByPrenom(String prenom) {
        PersonneDao dao = new PersonneDao();
        return dao.findPersonneByPrenom(prenom);
    }
    
    public List<Personne> findPersonneByNom(String nom) {
        PersonneDao dao = new PersonneDao();
        return dao.findPersonneByNom(nom);
    }
    
    public Personne findPersonneByIdPersonne(Long idPersonne) {
        PersonneDao dao = new PersonneDao();
        return dao.findPersonneByIdPersonne(idPersonne);
    }
    
/*--------------------------------FIN PERSONNES-------------------------------*/
    
/*--------------------------------UTILISATEURS--------------------------------*/
    
    public void referencerUtilisateur(Utilisateur u) {
        UtilisateurDao dao = new UtilisateurDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createUtilisateur(u);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void dereferencerUtilisateur(Utilisateur u) {
        UtilisateurDao dao = new UtilisateurDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteUtilisateur(u);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void miseAJourUtilisateur(Utilisateur u) {
        UtilisateurDao dao = new UtilisateurDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateUtilisateur(u);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public List<Utilisateur> findAllUtilisateurs() {
        UtilisateurDao dao = new UtilisateurDao();
        return dao.findAllUtilisateurs();
    }
    
    public List<Utilisateur> findUtilisateurByPrenom(String prenom) {
        UtilisateurDao dao = new UtilisateurDao();
        return dao.findUtilisateurByPrenom(prenom);
    }
    
    public List<Utilisateur> findUtilisateurByNom(String nom) {
        UtilisateurDao dao = new UtilisateurDao();
        return dao.findUtilisateurByNom(nom);
    }
    
    public Utilisateur findUtilisateurByIdentifiant(String identifiant) {
        UtilisateurDao dao = new UtilisateurDao();
        return dao.findUtilisateurByIdentifiant(identifiant);
    }
    
    public Utilisateur findUtilisateurByIdPersonne(Long idPersonne) {
        UtilisateurDao dao = new UtilisateurDao();
        return dao.findUtilisateurByIdPersonne(idPersonne);
    }
    
/*------------------------------FIN UTILISATEURS------------------------------*/
    
/*---------------------------------EMPLOYEURS---------------------------------*/
    
    public void referencerEmployeur(Employeur e) {
        EmployeurDao dao = new EmployeurDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createEmployeur(e);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void dereferencerEmployeur(Employeur e) {
        EmployeurDao dao = new EmployeurDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteEmployeur(e);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void miseAJourEmployeur(Employeur e) {
        EmployeurDao dao = new EmployeurDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateEmployeur(e);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public List<Employeur> findAllEmployeurs() {
        EmployeurDao dao = new EmployeurDao();
        return dao.findAllEmployeurs();
    }
    
    public List<Employeur> findEmployeurByPrenom(String prenom) {
        EmployeurDao dao = new EmployeurDao();
        return dao.findEmployeurByPrenom(prenom);
    }
    
    public List<Employeur> findEmployeurByNom(String nom) {
        EmployeurDao dao = new EmployeurDao();
        return dao.findEmployeurByNom(nom);
    }
    
    public Employeur findEmployeurByNomSociete(String nomSociete) {
        EmployeurDao dao = new EmployeurDao();
        return dao.findEmployeurByNomSociete(nomSociete);
    }
    
    public Employeur findEmployeurByIdentifiant(String identifiant) {
        EmployeurDao dao = new EmployeurDao();
        return dao.findEmployeurByIdentifiant(identifiant);
    }
    
    public Employeur findEmployeurByIdPersonne(Long idPersonne) {
        EmployeurDao dao = new EmployeurDao();
        return dao.findEmployeurByIdPersonne(idPersonne);
    }
    
/*-------------------------------FIN EMPLOYEURS-------------------------------*/
    
/*----------------------------------EMPLOYES----------------------------------*/
    
    public void referencerEmploye(Employe e) {
        EmployeDao dao = new EmployeDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createEmploye(e);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void dereferencerEmploye(Employe e) {
        EmployeDao dao = new EmployeDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteEmploye(e);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void miseAJourEmploye(Employe e) {
        EmployeDao dao = new EmployeDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateEmploye(e);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public List<Employe> findAllEmployes() {
        EmployeDao dao = new EmployeDao();
        return dao.findAllEmployes();
    }
    
    public List<Employe> findEmployeByPrenom(String prenom) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByPrenom(prenom);
    }
    
    public List<Employe> findEmployeByNom(String nom) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByNom(nom);
    }
    
    public List<Employe> findEmployeByNomSociete(Long idEmployeur) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByNomSociete(idEmployeur);
    }
    
    public Employe findEmployeByIdCarte(Long idCarte) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByIdCarte(idCarte);
    }
    
    public Employe findEmployeByIdentifiant(String identifiant) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByIdentifiant(identifiant);
    }
    
    public Employe findEmployeByIdPersonne(Long idPersonne) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByIdPersonne(idPersonne);
    }
    
/*--------------------------------FIN EMPLOYES--------------------------------*/
    
/*--------------------------------COMMERCANTS---------------------------------*/
    
    public void referencerCommercant(Commercant c) {
        CommercantDao dao = new CommercantDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createCommercant(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void dereferencerCommercant(Commercant c) {
        CommercantDao dao = new CommercantDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteCommercant(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void miseAJourCommercant(Commercant c) {
        CommercantDao dao = new CommercantDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateCommercant(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public List<Commercant> findAllCommercants() {
        CommercantDao dao = new CommercantDao();
        return dao.findAllCommercants();
    }
    
    public List<Commercant> findCommercantByPrenom(String prenom) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantByPrenom(prenom);
    }
    
    public List<Commercant> findCommercantByNom(String nom) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantByNom(nom);
    }
    
    public Commercant findCommercantByNomCommercant(String nomCommercant) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantByNomCommercant(nomCommercant);
    }
    
    public Commercant findCommercantByIdentifiant(String identifiant) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantByIdentifiant(identifiant);
    }
    
    public Commercant findCommercantByIdPersonne(Long idPersonne) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantByIdPersonne(idPersonne);
    }
    
/*------------------------------FIN COMMERCANTS-------------------------------*/
    
/*---------------------------------COMMANDES----------------------------------*/
    
    public void referencerCommande(Commande c) {
        CommandeDao dao = new CommandeDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createCommande(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void dereferencerCommande(Commande c) {
        CommandeDao dao = new CommandeDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteCommande(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void miseAJourCommande(Commande c) {
        CommandeDao dao = new CommandeDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateCommande(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public List<Commande> findAllCommandes() {
        CommandeDao dao = new CommandeDao();
        return dao.findAllCommandes();
    }
    
    public Commande findCommandeByIdCommande(Long idCommande) {
        CommandeDao dao = new CommandeDao();
        return dao.findCommandeByIdCommande(idCommande);
    }
    
    public List<Commande> findCommandeByDate(Date dateCommande) {
        CommandeDao dao = new CommandeDao();
        return dao.findCommandeByDate(dateCommande);
    }
    
    public List<Commande> findCommandeByIdEmployeur(Long idEmployeur) {
        CommandeDao dao = new CommandeDao();
        return dao.findCommandeByIdEmployeur(idEmployeur);
    }
    
/*-------------------------------FIN COMMANDES--------------------------------*/
    
/*---------------------------------CARTES----------------------------------*/
    
    public void referencerCarte(Carte c) {
        CarteDao dao = new CarteDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createCarte(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void dereferencerCarte(Carte c) {
        CarteDao dao = new CarteDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteCarte(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public void miseAJourCarte(Carte c) {
        CarteDao dao = new CarteDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateCarte(c);
            tx.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx != null && tx.isActive()){
                tx.rollback();
            }
        }finally{
            JpaUtil.closeEntityManager();
        }
    }
    
    public List<Carte> findAllCartes() {
        CarteDao dao = new CarteDao();
        return dao.findAllCartes();
    }
    
    public Carte findCarteByIdCarte(Long idCarte) {
        CarteDao dao = new CarteDao();
        return dao.findCarteByIdCarte(idCarte);
    }
    
    public Carte findCarteByIdEmploye(Long idEmploye) {
        CarteDao dao = new CarteDao();
        return dao.findCarteByIdEmploye(idEmploye);
    }
    
/*-------------------------------FIN CARTES--------------------------------*/
    
}

                    /*Fin Implementation Interface Services*/