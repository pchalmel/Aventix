                                /*Dao Commande*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Commande;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class CommandeDao {
    
/*-----------------------------GESTION COMMANDES------------------------------*/
    
    public void createCommande(Commande c){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(c);
    }
    
    public void updateCommande(Commande c){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(c);
    }
    
    public void deleteCommande(Commande c){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(c));
    }
    
/*---------------------------FIN GESTION COMMANDES----------------------------*/
    
/*-----------------------------FINDERS COMMANDES------------------------------*/
    
    public List<Commande> findAllCommandes(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from commande as c");
        List<Commande> liste = query.getResultList();
        return liste;
    }
    
    public Commande findCommandeByIdCommande(Long idCommande){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Commande.class, idCommande);
    }
    
    public List<Commande> findCommandeByDate(Date dateCommande){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from commande as c where c.dateCommande=:dateCommande").setParameter("dateCommande", dateCommande);
        List<Commande> liste = query.getResultList();
        return liste;
    }
    
    public List<Commande> findCommandeByIdEmployeur(Long idEmployeur){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from commande as c where c.idEmployeur=:idEmployeur").setParameter("idEmployeur", idEmployeur);
        List<Commande> liste = query.getResultList();
        return liste;
    }
    
/*---------------------------FIN FINDERS COMMANDES----------------------------*/
    
}

                              /*Fin Dao Commande*/