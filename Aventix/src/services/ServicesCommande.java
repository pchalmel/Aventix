                        /*Interface Services Commande*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.Date;
import java.util.List;
import modele.Commande;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesCommande {
    
    public void referencerCommande(Commande c);
    public void dereferencerCommande(Commande c);
    public void miseAJourCommande(Commande c);
    public List<Commande> findAllCommandes();
    public List<Commande> findCommandeByDate(Date dateCommande);
    public List<Commande> findCommandeByIdEmployeur(Long idEmployeur);
    public Commande findCommandeByIdCommande(Long idCommande);
}

                    /*Fin Interface Services Commande*/