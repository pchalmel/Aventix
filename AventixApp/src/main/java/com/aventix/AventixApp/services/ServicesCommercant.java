                        /*Interface Services Commercant*/
package com.aventix.AventixApp.services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import com.aventix.AventixApp.modele.Commercant;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesCommercant {
    
    public void referencerCommercant(Commercant c);
    public void dereferencerCommercant(Commercant c);
    public void miseAJourCommercant(Commercant c);
    public List<Commercant> findAllCommercants();
    public Commercant findCommercantByNom(String nomCommercant);
    public Commercant findCommercantByEmail(String email);
    public Commercant findCommercantById(Long idCommercant);
}

                    /*Fin Interface Services Commercant*/