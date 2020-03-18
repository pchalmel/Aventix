/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aventix.AventixApp.util;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *
 * @author olivi
 */
public class JpaUtil implements Serializable{   
    private static EntityManagerFactory factory;
    private static ThreadLocal<EntityManager> threadLocal = new ThreadLocal<EntityManager>();
    
    public static EntityManager getEntityManager(){
        EntityManager em = threadLocal.get();
        if(em == null){
            factory = getEntityManagerFactory();
            em = factory.createEntityManager();
            threadLocal.set(em);
        }
        return em;
    }
    
    private static EntityManagerFactory getEntityManagerFactory(){
        if(factory == null){
            factory = Persistence.createEntityManagerFactory("AventixPU");
        }
        return factory;
    }
    
    public static void closeEntityManager(){
        EntityManager em = threadLocal.get();
        if(em != null){
            em.close();
            threadLocal.set(null);
        }
    }
    
    public static EntityTransaction getEntityTransaction() throws Exception{
        return getEntityManager().getTransaction();
    }
    
}