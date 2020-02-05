                        /*Interface Services Commercant*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import modele.Commercant;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesCommercant {
    
    public void referencerCommercant(Commercant c);
    public void dereferencerCommercant(Commercant c);
    public void miseAJourCommercant(Commercant c);
    public List<Commercant> findAllCommercants();
    public List<Commercant> findCommercantByPrenom(String prenom);
    public List<Commercant> findCommercantByNom(String nom);
    public Commercant findCommercantByNomCommercant(String nomCommercant);
    public Commercant findCommercantByIdentifiant(String identifiant);
    public Commercant findCommercantByIdPersonne(Long idPersonne);
}

                    /*Fin Interface Services Commercant*/