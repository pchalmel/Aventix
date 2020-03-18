                        /*Interface Services Commande*/
package com.aventix.AventixApp.services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.Date;
import java.util.List;
import com.aventix.AventixApp.modele.Commande;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesCommande {
    
    public void referencerCommande(Commande c);
    public void dereferencerCommande(Commande c);
    public void miseAJourCommande(Commande c);
    public List<Commande> findAllCommandes();
    public List<Commande> findCommandeByDate(Date dateCommande);
    public List<Commande> findCommandeByIdEntreprise(Long idEntreprise);
    public Commande findCommandeById(Long idCommande);
}

                    /*Fin Interface Services Commande*/