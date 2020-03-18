                           /*Dao ServiceFacturation*/

package com.aventix.AventixApp.dao;

/*----------------------------------IMPORTS-----------------------------------*/

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.aventix.AventixApp.modele.ServiceFacturation;
import com.aventix.AventixApp.util.JpaUtil;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class ServiceFacturationDao {
    
/*------------------------GESTION SERVICE FACTURATION-------------------------*/
    
    public void createServiceFacturation(ServiceFacturation sF){
        EntityManager em = JpaUtil.getEntityManager();
        em.persist(sF);
    }
    
    public void updateServiceFacturation(ServiceFacturation sF){
        EntityManager em = JpaUtil.getEntityManager();
        em.merge(sF);
    }
    
    public void deleteServiceFacturation(ServiceFacturation sF){
        EntityManager em = JpaUtil.getEntityManager();
        em.remove(em.merge(sF));
    }
    
/*----------------------FIN GESTION SERVICE FACTURATION-----------------------*/
    
/*-----------------------FINDERS SERVICE FACTURATION--------------------------*/
    
    public ServiceFacturation findServiceFacturationById(Long idServiceFacturation){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(ServiceFacturation.class, idServiceFacturation);
    }
    
    public ServiceFacturation findServiceFacturationByEmail(String email){
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(ServiceFacturation.class, email);
    }
    
/*---------------------FIN FINDERS SERVICE FACTURATION------------------------*/
    
}

                       /*Fin Dao ServiceFacturation*/