                                /*Dao Utilisateur*/

package dao;

/*----------------------------------IMPORTS-----------------------------------*/

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Utilisateur;
import util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class UtilisateurDao {
    
/*----------------------------GESTION UTILISATEURS----------------------------*/
    
    public void createUtilisateur(Utilisateur u){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(u);
    }
    
    public void updateUtilisateur(Utilisateur u){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(u);
    }
    
    public void deleteUtilisateur(Utilisateur u){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(u));
    }
    
/*--------------------------FIN GESTION UTILISATEURS--------------------------*/
    
/*----------------------------FINDERS UTILISATEURS----------------------------*/
    
    public List<Utilisateur> findAllUtilisateurs(){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select u from utilisateur as u");
        List<Utilisateur> liste = query.getResultList();
        return liste;
    }
    
    public Utilisateur findUtilisateurByIdPersonne(Long idPersonne){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(Utilisateur.class, idPersonne);
    }
    
    public List<Utilisateur> findUtilisateurByPrenom(String prenom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select u from utilisateur as u where u.prenom=:prenom").setParameter("prenom", prenom);
        List<Utilisateur> liste = query.getResultList();
        return liste;
    }
    
    public List<Utilisateur> findUtilisateurByNom(String nom){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select u from utilisateur as u where u.nom=:nom").setParameter("nom", nom);
        List<Utilisateur> liste = query.getResultList();
        return liste;
    }
    
    public Utilisateur findUtilisateurByIdentifiant(String identifiant){
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select u from utilisateur as u where u.identifiant=:identifiant").setParameter("identifiant", identifiant);
        Utilisateur u = (Utilisateur) query.getSingleResult();
        return u;
    }
    
/*--------------------------FIN FINDERS UTILISATEURS--------------------------*/
    
}

                            /*Fin Dao Utilisateur*/