                        /*Interface Services Entreprise*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import modele.Entreprise;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesEntreprise {
    
    public void referencerEntreprise(Entreprise e);
    public void dereferencerEntreprise(Entreprise e);
    public void miseAJourEntreprise(Entreprise e);
    public List<Entreprise> findAllEntreprises();
    public Entreprise findEntrepriseByNom(String nomEntreprise);
    public Entreprise findEntrepriseByEmail(String email);
    public Entreprise findEntrepriseById(Long idEntreprise);
}

                    /*Fin Interface Services Entreprise*/