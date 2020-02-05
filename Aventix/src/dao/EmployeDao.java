                                /*Dao Employe*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Employe;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class EmployeDao {
    
/*-----------------------------GESTION EMPLOYES-------------------------------*/
    
    public void createEmploye(Employe e){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(e);
    }
    
    public void updateEmploye(Employe e){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(e);
    }
    
    public void deleteEmploye(Employe e){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(e));
    }
    
/*---------------------------FIN GESTION EMPLOYES-----------------------------*/
    
/*-----------------------------FINDERS EMPLOYES-------------------------------*/
    
    public List<Employe> findAllEmployes(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employe as e");
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public Employe findEmployeByIdPersonne(Long idPersonne){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Employe.class, idPersonne);
    }
    
    public List<Employe> findEmployeByPrenom(String prenom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employe as e where e.prenom=:prenom").setParameter("prenom", prenom);
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public List<Employe> findEmployeByNom(String nom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employe as e where e.nom=:nom").setParameter("nom", nom);
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public List<Employe> findEmployeByNomSociete(Long idEmployeur){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employe as e where e.idEmployeur=:idEmployeur").setParameter("idEmployeur", idEmployeur);
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public Employe findEmployeByIdCarte(Long idCarte){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from employe as e where e.idCarte=:idCarte").setParameter("idCarte", idCarte);
        Employe e = (Employe) query.getResultList();
        return e;
    }
    
    public Employe findEmployeByIdentifiant(String identifiant){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Employe.class, identifiant);
    }
    
/*---------------------------FIN FINDERS EMPLOYES-----------------------------*/
    
}

                             /*Fin Dao Employe*/