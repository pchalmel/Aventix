                        /*Interface Services Utilisateur*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import modele.Utilisateur;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesUtilisateur {
    
    public void referencerUtilisateur(Utilisateur u);
    public void dereferencerUtilisateur(Utilisateur u);
    public void miseAJourUtilisateur(Utilisateur u);
    public List<Utilisateur> findAllUtilisateurs();
    public List<Utilisateur> findUtilisateurByPrenom(String prenom);
    public List<Utilisateur> findUtilisateurByNom(String nom);
    public Utilisateur findUtilisateurByIdentifiant(String identifiant);
    public Utilisateur findUtilisateurByIdPersonne(Long idPersonne);
}

                    /*Fin Interface Services Utilisateur*/