                                /*Dao Commercant*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Commercant;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class CommercantDao {
    
/*----------------------------GESTION COMMERCANTS-----------------------------*/
    
    public void createCommercant(Commercant c){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(c);
    }
    
    public void updateCommercant(Commercant c){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(c);
    }
    
    public void deleteCommercant(Commercant c){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(c));
    }
    
/*--------------------------FIN GESTION COMMERCANTS---------------------------*/
    
/*----------------------------FINDERS COMMERCANTS-----------------------------*/
    
    public List<Commercant> findAllCommercants(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from commercant as c");
        List<Commercant> liste = query.getResultList();
        return liste;
    }
    
    public Commercant findCommercantByIdPersonne(Long idPersonne){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Commercant.class, idPersonne);
    }
    
    public List<Commercant> findCommercantByPrenom(String prenom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from commercant as c where c.prenom=:prenom").setParameter("prenom", prenom);
        List<Commercant> liste = query.getResultList();
        return liste;
    }
    
    public List<Commercant> findCommercantByNom(String nom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from commercant as c where c.nom=:nom").setParameter("nom", nom);
        List<Commercant> liste = query.getResultList();
        return liste;
    }
    
    public Commercant findCommercantByNomCommercant(String nomCommercant){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from commercant as c where c.nomCommercant=:nomCommercant").setParameter("nomCommercant", nomCommercant);
        Commercant c = (Commercant) query.getResultList();
        return c;
    }
    
    public Commercant findCommercantByIdentifiant(String identifiant){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Commercant.class, identifiant);
    }
    
/*--------------------------FIN FINDERS COMMERCANTS---------------------------*/
    
}

                            /*Fin Dao Commercant*/