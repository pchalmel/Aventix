                        /*Interface Services Employeur*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import modele.Employeur;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesEmployeur {
    
    public void referencerEmployeur(Employeur e);
    public void dereferencerEmployeur(Employeur e);
    public void miseAJourEmployeur(Employeur e);
    public List<Employeur> findAllEmployeurs();
    public List<Employeur> findEmployeurByPrenom(String prenom);
    public List<Employeur> findEmployeurByNom(String nom);
    public Employeur findEmployeurByNomSociete(String nomSociete);
    public Employeur findEmployeurByIdentifiant(String identifiant);
    public Employeur findEmployeurByIdPersonne(Long idPersonne);
}

                    /*Fin Interface Services Employeur*/