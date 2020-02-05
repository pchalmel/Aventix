                                /*Dao Personne*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Personne;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class PersonneDao {
    
/*-----------------------------GESTION PERSONNES------------------------------*/
    
    public void createPersonne(Personne p){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(p);
    }
    
    public void updatePersonne(Personne p){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(p);
    }
    
    public void deletePersonne(Personne p){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(p));
    }
    
/*-----------------------------FIN GESTION PERSONNES--------------------------*/
    
/*-------------------------------FINDERS PERSONNES----------------------------*/
    
    public List<Personne> findAllPersonnes(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select p from personne as p");
        List<Personne> liste = query.getResultList();
        return liste;
    }
    
    public Personne findPersonneByIdPersonne(Long idPersonne){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Personne.class, idPersonne);
    }
    
    public List<Personne> findPersonneByPrenom(String prenom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select p from personne as p where p.prenom=:prenom").setParameter("prenom", prenom);
        List<Personne> liste = query.getResultList();
        return liste;
    }
    
    public List<Personne> findPersonneByNom(String nom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select p from personne as p where p.nom=:nom").setParameter("nom", nom);
        List<Personne> liste = query.getResultList();
        return liste;
    }
    
/*-----------------------------FIN FINDERS PERSONNES--------------------------*/
    
}

                                /*Fin Dao Personne*/