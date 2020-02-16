                                /*Dao Transa*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Transa;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class TransaDao {
    
/*----------------------------GESTION TRANSACTIONS----------------------------*/
    
    public void createTransa(Transa t){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(t);
    }
    
    public void updateTransa(Transa t){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(t);
    }
    
    public void deleteTransa(Transa t){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(t));
    }
    
/*--------------------------FIN GESTION TRANSACTIONS--------------------------*/
    
/*----------------------------FINDERS TRANSACTIONS----------------------------*/
    
    public List<Transa> findAllTransas(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select t from transa as t");
        List<Transa> liste = query.getResultList();
        return liste;
    }
    
    public Transa findTransaById(Long idTransa){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Transa.class, idTransa);
    }
    
    public List<Transa> findTransaByDate(Date dateTransa){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select t from transa as t where t.dateTransa=:dateTransa").setParameter("dateTransa", dateTransa);
        List<Transa> liste = query.getResultList();
        return liste;
    }
    
    public List<Transa> findTransaByIdCarte(Long idCarte){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select t from transa as t where t.idCarte=:idCarte").setParameter("idCarte", idCarte);
        List<Transa> liste = query.getResultList();
        return liste;
    }
    
/*--------------------------FIN FINDERS TRANSACTIONS--------------------------*/
    
}

                            /*Fin Dao Transa*/