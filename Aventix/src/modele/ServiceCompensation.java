                          /*Classe ServiceCompensation*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.ServicesImpl;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class ServiceCompensation extends TimerTask {
    
/*---------------------------------ATTRIBUTS----------------------------------*/
    
    
/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public ServiceCompensation() {
    }
    
//Constructeur par valeurs    
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/

    
/*----------------------------------Setters-----------------------------------*/
   

/*-----------------------------------Others-----------------------------------*/
 
    

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public void run() {
        System.out.println("Ok");
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                        /*Fin classe ServiceCompensation*/