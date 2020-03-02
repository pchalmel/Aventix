                        /*Interface Services Employe*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.List;
import modele.Employe;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesEmploye {
    
    public void referencerEmploye(Employe e);
    public void dereferencerEmploye(Employe e);
    public void miseAJourEmploye(Employe e);
    public List<Employe> findAllEmployes();
    public List<Employe> findEmployeByPrenom(String prenom);
    public List<Employe> findEmployeByNom(String nom);
    public List<Employe> findEmployeByEntreprise(Long idEntreprise);
    public Employe findEmployeByIdCarte(Long idCarte);
    public Employe findEmployeByEmail(String email);
    public Employe findEmployeById(Long idEmploye);
}

                    /*Fin Interface Services Employe*/