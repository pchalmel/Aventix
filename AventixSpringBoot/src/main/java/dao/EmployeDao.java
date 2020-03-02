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
        Query query = em.createQuery("select e from Employe as e");
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public Employe findEmployeById(Long idEmploye){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Employe.class, idEmploye);
    }
    
    public List<Employe> findEmployeByPrenom(String prenom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from Employe as e where e.prenom=:prenom").setParameter("prenom", prenom);
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public List<Employe> findEmployeByNom(String nom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from Employe as e where e.nom=:nom").setParameter("nom", nom);
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public List<Employe> findEmployeByEntreprise(Long idEntreprise){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from Employe as e where e.idEntreprise=:idEntreprise").setParameter("idEntreprise", idEntreprise);
        List<Employe> liste = query.getResultList();
        return liste;
    }
    
    public Employe findEmployeByIdCarte(Long idCarte){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Employe.class, idCarte);
    }
    
    public Employe findEmployeByEmail(String email){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Employe.class, email);
    }
    
/*---------------------------FIN FINDERS EMPLOYES-----------------------------*/
    
}

                             /*Fin Dao Employe*/