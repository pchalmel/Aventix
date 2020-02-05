                        /*Interface Services Personne*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import modele.Personne;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesPersonne {
    
    public void referencerPersonne(Personne p);
    public void dereferencerPersonne(Personne p);
    public void miseAJourPersonne(Personne p);
    public List<Personne> findAllPersonnes();
    public List<Personne> findPersonneByPrenom(String prenom);
    public List<Personne> findPersonneByNom(String nom);
    public Personne findPersonneByIdPersonne(Long idPersonne);
}

                       /*Fin Interface Services Personne*/
