                                /*Dao Employeur*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Employeur;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class EmployeurDao {
    
/*-----------------------------GESTION EMPLOYEUR------------------------------*/
    
    public void createEmployeur(Employeur e){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(e);
    }
    
    public void updateEmployeur(Employeur e){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(e);
    }
    
    public void deleteEmployeur(Employeur e){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(e));
    }
    
/*---------------------------FIN GESTION EMPLOYEURS---------------------------*/
    
/*-----------------------------FINDERS EMPLOYEURS-----------------------------*/
    
    public List<Employeur> findAllEmployeurs(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employeur as e");
        List<Employeur> liste = query.getResultList();
        return liste;
    }
    
    public Employeur findEmployeurByIdPersonne(Long idPersonne){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Employeur.class, idPersonne);
    }
    
    public List<Employeur> findEmployeurByPrenom(String prenom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employeur as e where e.prenom=:prenom").setParameter("prenom", prenom);
        List<Employeur> liste = query.getResultList();
        return liste;
    }
    
    public List<Employeur> findEmployeurByNom(String nom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employeur as e where e.nom=:nom").setParameter("nom", nom);
        List<Employeur> liste = query.getResultList();
        return liste;
    }
    
    public Employeur findEmployeurByNomSociete(String nomSociete){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employeur as e where e.nomSociete=:nomSociete").setParameter("nomSociete", nomSociete);
        Employeur e = (Employeur) query.getResultList();
        return e;
    }
    
    public Employeur findEmployeurByIdentifiant(String identifiant){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Employeur.class, identifiant);
    }
    
/*---------------------------FIN FINDERS EMPLOYEURS---------------------------*/
    
}

                            /*Fin Dao Employeur*/