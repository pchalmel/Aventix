                             /*Main Classe*/

package gui;

/*----------------------------------IMPORTS-----------------------------------*/

import modele.Carte;
import modele.Commande;
import modele.Commercant;
import modele.Employe;
import modele.Entreprise;
import modele.Transa;
import services.ServicesImpl;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class Main {

    public static void main(String[] args) {
        
        //Instanciation de 2 objets de chaque entité
        Entreprise entreprise1 = new Entreprise("Sodexo", "sodexo@sodex.fr", "19 rue de l'Yvette", "0161457884");
        Entreprise entreprise2 = new Entreprise("Total", "total@tot.fr", "5 rue du Port", "0264977852");
        Carte carte1 = new Carte(19);
        Carte carte2 = new Carte(12);
        Employe employe1 = new Employe("Paul", "Chassine", "paul.chassine@hotmail.fr", entreprise1);
        Employe employe2 = new Employe("Nicolas", "Moreau", "ricson.varish@hotmail.fr", entreprise2);
        carte1.affecterEmploye(employe1);
        carte2.affecterEmploye(employe2);
        Commercant commercant1 = new Commercant("Miche2Pain", "miche@pain.fr", "9 rue de Brest", "0605782413", "16645997788534461669");
        Commercant commercant2 = new Commercant("KsCrout'", "crout@ks.fr", "79 boulevard Martin", "0674169853", "19765328465925134785");
        Commande commande1 = new Commande(entreprise1, 64, "Plus vite que ca");
        Commande commande2 = new Commande(entreprise2, 24, "Merci");
        Transa transaction1 = new Transa(1L, 2L, 13);
        Transa transaction2 = new Transa(2L, 1L, 9);
        
        //Instanciation d'un objet service qui interagira avec la BDD
        ServicesImpl services = new ServicesImpl();
        
        //Application du service de referencement en BDD de toutes les instances des differentes entités
        services.referencerEntreprise(entreprise1);
        services.referencerEntreprise(entreprise2);
        services.referencerCommande(commande1);
        services.referencerCommande(commande2);
        services.referencerCommercant(commercant1);
        services.referencerCommercant(commercant2);
        services.referencerEmploye(employe1);
        services.referencerEmploye(employe2);
        services.referencerTransa(transaction1);
        services.referencerTransa(transaction2);
        
        //Affichage de toutes les instances des differentes entités
        System.out.println(entreprise1.toString());
        System.out.println(entreprise2.toString());
        System.out.println(employe1.toString());
        System.out.println(employe2.toString());
        System.out.println(commercant1.toString());
        System.out.println(commercant2.toString());
        System.out.println(carte1.toString());
        System.out.println(carte2.toString());
        System.out.println(commande1.toString());
        System.out.println(commande2.toString());
        System.out.println(transaction1.toString());
        System.out.println(transaction2.toString());
    }

}

                            /*Fin Main Classe*/