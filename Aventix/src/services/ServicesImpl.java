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

public class ServicesImpl implements ServicesEmploye, ServicesEntreprise, ServicesCommercant, ServicesCommande, ServicesCarte, ServicesTransa, ServicesServiceFacturation {
      
/*--------------------------------ENTREPRISES---------------------------------*/
    
    public void referencerEntreprise(Entreprise e) {
        EntrepriseDao dao = new EntrepriseDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createEntreprise(e);
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
    
    public void dereferencerEntreprise(Entreprise e) {
        EntrepriseDao dao = new EntrepriseDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteEntreprise(e);
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
    
    public void miseAJourEntreprise(Entreprise e) {
        EntrepriseDao dao = new EntrepriseDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateEntreprise(e);
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
    
    public List<Entreprise> findAllEntreprises() {
        EntrepriseDao dao = new EntrepriseDao();
        return dao.findAllEntreprises();
    }
    
    public Entreprise findEntrepriseByNom(String nomEntreprise) {
        EntrepriseDao dao = new EntrepriseDao();
        return dao.findEntrepriseByNom(nomEntreprise);
    }
    
    public Entreprise findEntrepriseByEmail(String email) {
        EntrepriseDao dao = new EntrepriseDao();
        return dao.findEntrepriseByEmail(email);
    }
    
    public Entreprise findEntrepriseById(Long idEntreprise) {
        EntrepriseDao dao = new EntrepriseDao();
        return dao.findEntrepriseById(idEntreprise);
    }
    
/*------------------------------FIN ENTREPRISES-------------------------------*/
    
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
    
    public List<Employe> findEmployeByEntreprise(Long idEntreprise) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByEntreprise(idEntreprise);
    }
    
    public Employe findEmployeByIdCarte(Long idCarte) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByIdCarte(idCarte);
    }
    
    public Employe findEmployeByEmail(String email) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeByEmail(email);
    }
    
    public Employe findEmployeById(Long idEmploye) {
        EmployeDao dao = new EmployeDao();
        return dao.findEmployeById(idEmploye);
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
    
    public Commercant findCommercantByNom(String nomCommercant) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantByNom(nomCommercant);
    }
    
    public Commercant findCommercantByEmail(String email) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantByEmail(email);
    }
    
    public Commercant findCommercantById(Long idCommercant) {
        CommercantDao dao = new CommercantDao();
        return dao.findCommercantById(idCommercant);
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
    
    public Commande findCommandeById(Long idCommande) {
        CommandeDao dao = new CommandeDao();
        return dao.findCommandeById(idCommande);
    }
    
    public List<Commande> findCommandeByDate(Date dateCommande) {
        CommandeDao dao = new CommandeDao();
        return dao.findCommandeByDate(dateCommande);
    }
    
    public List<Commande> findCommandeByIdEntreprise(Long idEntreprise) {
        CommandeDao dao = new CommandeDao();
        return dao.findCommandeByIdEntreprise(idEntreprise);
    }
    
/*-------------------------------FIN COMMANDES--------------------------------*/
    
/*----------------------------------CARTES------------------------------------*/
    
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
    
    public Carte findCarteById(Long idCarte) {
        CarteDao dao = new CarteDao();
        return dao.findCarteById(idCarte);
    }
    
    public Carte findCarteByIdEmploye(Long idEmploye) {
        CarteDao dao = new CarteDao();
        return dao.findCarteByIdEmploye(idEmploye);
    }
    
/*--------------------------------FIN CARTES----------------------------------*/
    
/*-------------------------------TRANSACTIONS---------------------------------*/
    
    public void referencerTransa(Transa t) {
        TransaDao dao = new TransaDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createTransa(t);
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
    
    public void dereferencerTransa(Transa t) {
        TransaDao dao = new TransaDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteTransa(t);
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
    
    public void miseAJourTransa(Transa t) {
        TransaDao dao = new TransaDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateTransa(t);
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
    
    public List<Transa> findAllTransas() {
        TransaDao dao = new TransaDao();
        return dao.findAllTransas();
    }
    
    public Transa findTransaById(Long idTransaction) {
        TransaDao dao = new TransaDao();
        return dao.findTransaById(idTransaction);
    }
    
    public List<Transa> findTransaByDate(Date dateTransa) {
        TransaDao dao = new TransaDao();
        return dao.findTransaByDate(dateTransa);
    }
    
    public List<Transa> findTransaByIdCarte(Long idCarte) {
        TransaDao dao = new TransaDao();
        return dao.findTransaByIdCarte(idCarte);
    }
    
    public List<Transa> findTransaByIdCommercant(Long idCommercant) {
        TransaDao dao = new TransaDao();
        return dao.findTransaByIdCommercant(idCommercant);
    }
    
    public List<Transa> findTransaByStatut(boolean statut) {
        TransaDao dao = new TransaDao();
        return dao.findTransaByStatut(statut);
    }
    
/*------------------------------FIN TRANSACTIONS------------------------------*/
    
/*----------------------------SERVICE FACTURATION-----------------------------*/
    
    public void referencerServiceFacturation(ServiceFacturation sF) {
        ServiceFacturationDao dao = new ServiceFacturationDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.createServiceFacturation(sF);
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
    
    public void dereferencerServiceFacturation(ServiceFacturation sF) {
        ServiceFacturationDao dao = new ServiceFacturationDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.deleteServiceFacturation(sF);
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
    
    public void miseAJourServiceFacturation(ServiceFacturation sF) {
        ServiceFacturationDao dao = new ServiceFacturationDao();
        EntityTransaction tx = null;
        try{
            tx = JpaUtil.getEntityTransaction();
            tx.begin();
            dao.updateServiceFacturation(sF);
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
    
    public ServiceFacturation findServiceFacturationById(Long idServiceFacturation) {
        ServiceFacturationDao dao = new ServiceFacturationDao();
        return dao.findServiceFacturationById(idServiceFacturation);
    }
    
    public ServiceFacturation findServiceFacturationByEmail(String email) {
        ServiceFacturationDao dao = new ServiceFacturationDao();
        return dao.findServiceFacturationByEmail(email);
    }
    
/*---------------------------FIN SERVICE FACTURATION--------------------------*/
    
}

                    /*Fin Implementation Interface Services*/