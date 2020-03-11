                        /*Interface Services Carte*/
package com.aventix.AventixApp.services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.Date;
import java.util.List;
import com.aventix.AventixApp.modele.Carte;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesCarte {
    
    public void referencerCarte(Carte c);
    public void dereferencerCarte(Carte c);
    public void miseAJourCarte(Carte c);
    public List<Carte> findAllCartes();
    public Carte findCarteById(Long idCarte);
    public Carte findCarteByIdEmploye(Long idEmploye);
}

                    /*Fin Interface Services Carte*/