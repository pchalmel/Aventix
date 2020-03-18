                        /*Interface Services Transa*/
package com.aventix.AventixApp.services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.Date;
import java.util.List;
import com.aventix.AventixApp.modele.Transa;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesTransa {
    
    public void referencerTransa(Transa t);
    public void dereferencerTransa(Transa t);
    public void miseAJourTransa(Transa t);
    public List<Transa> findAllTransas();
    public List<Transa> findTransaByDate(Date dateTransa);
    public List<Transa> findTransaByIdCarte(Long idCarte);
    public List<Transa> findTransaByIdCommercant(Long idCommercant);
    public List<Transa> findTransaByStatut(boolean statut);
    public Transa findTransaById(Long idTransa);
}

                    /*Fin Interface Services Transa*/