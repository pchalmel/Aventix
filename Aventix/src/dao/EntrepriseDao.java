                                /*Dao Entreprise*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Entreprise;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class EntrepriseDao {
    
/*----------------------------GESTION ENTREPRISE------------------------------*/
    
    public void createEntreprise(Entreprise e){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(e);
    }
    
    public void updateEntreprise(Entreprise e){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(e);
    }
    
    public void deleteEntreprise(Entreprise e){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(e));
    }
    
/*--------------------------FIN GESTION ENTREPRISES---------------------------*/
    
/*----------------------------FINDERS ENTREPRISES-----------------------------*/
    
    public List<Entreprise> findAllEntreprises(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select e from Entreprise as e");
        List<Entreprise> liste = query.getResultList();
        return liste;
    }
    
    public Entreprise findEntrepriseById(Long idEntreprise){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Entreprise.class, idEntreprise);
    }
    
    public Entreprise findEntrepriseByNom(String nomEntreprise){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Entreprise.class, nomEntreprise);
    }
    
    public Entreprise findEntrepriseByEmail(String email){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Entreprise.class, email);
    }
    
/*--------------------------FIN FINDERS ENTREPRISES---------------------------*/
    
}

                            /*Fin Dao Entreprise*/