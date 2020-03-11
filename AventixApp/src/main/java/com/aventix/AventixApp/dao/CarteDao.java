                                /*Dao Carte*/

package com.aventix.AventixApp.dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.aventix.AventixApp.modele.Carte;
import com.aventix.AventixApp.util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class CarteDao {
    
/*------------------------------GESTION CARTES--------------------------------*/
    
    public void createCarte(Carte c){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(c);
    }
    
    public void updateCarte(Carte c){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(c);
    }
    
    public void deleteCarte(Carte c){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(c));
    }
    
/*----------------------------FIN GESTION CARTES------------------------------*/
    
/*------------------------------FINDERS CARTES--------------------------------*/
    
    public List<Carte> findAllCartes(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Carte as c");
        List<Carte> liste = query.getResultList();
        return liste;
    }
    
    public Carte findCarteById(Long idCarte){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Carte.class, idCarte);
    }
    
    public Carte findCarteByIdEmploye(Long idEmploye){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Carte.class, idEmploye);
    }
    
/*----------------------------FIN FINDERS CARTES------------------------------*/
    
}

                              /*Fin Dao Carte*/