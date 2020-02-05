                             /*Main Classe*/

package gui;

/*----------------------------------IMPORTS-----------------------------------*/

import modele.Carte;
import modele.Utilisateur;
import modele.Commande;
import modele.Commercant;
import modele.Employe;
import modele.Employeur;
import modele.Personne;
import services.ServicesImpl;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class Main {

    public static void main(String[] args) {
        
        //Instanciation de 2 objets de chaque entité
      /*Personne p = new Personne("Marie", "Pozzera", "Les Arc 1800");
        Personne p2 = new Personne("Jacques", "Cinquin", "19 rue de l'Yvette");
        Utilisateur u1 = new Utilisateur("Olivier", "Cinquin", "5 rue des Sciences");
        Utilisateur u2 = new Utilisateur("Oscar", "De Gramont", "9 rue  de Brest");*/
        Employeur employeur1 = new Employeur("Sylvie", "Cinquin", "19 rue de l'Yvette", "Schlumberger", "5 rue du port", "0161457884");
        Employeur employeur2 = new Employeur("Quentin", "Chassine", "Chez  Sagar Rennes", "MarcheDelice", "Chez Sagar et un peu en Inde", "0264977852");
        Employe employe1 = new Employe("Paul", "Chassine", "Paname", 1L, 1L);
        Employe employe2 = new Employe("Nicolas", "Moreau", "Gare d'Igny", 0L, 2L);
        Commercant commercant1 = new Commercant("Pierre", "Steffen", "Compiegne", "RoyalPd", "0605782413");
        Commercant commercant2 = new Commercant("Samy", "Chevrier", "Port de bouc", "Chimiral", "0674169853");
        Carte carte1 = new Carte(1L, 19);
        Carte carte2 = new Carte(2L, 12);
        Commande commande1 = new Commande(1L, 64, "Plus vite que ca");
        Commande commande2 = new Commande(2L, 24, "Merci");
        
        //Instanciation d'un objet service qui interagira avec la BDD
        ServicesImpl services = new ServicesImpl();
        
        //Application du service de referencement en BDD de toutes les instances des differentes entités
      /*services.referencerPersonne(p);
        services.referencerPersonne(p2);*/
        services.referencerCarte(carte1);
        services.referencerCarte(carte2);
        services.referencerCommande(commande1);
        services.referencerCommande(commande2);
        services.referencerCommercant(commercant1);
        services.referencerCommercant(commercant2);
        services.referencerEmploye(employe1);
        services.referencerEmploye(employe2);
        services.referencerEmployeur(employeur1);
        services.referencerEmployeur(employeur2);
      /*services.dereferencerUtilisateur(u1);
        services.dereferencerUtilisateur(u2);*/
        
        //Affichage de toutes les instances des differentes entités
      /*System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(u1.toString());
        System.out.println(u2.toString());*/
        System.out.println(employeur1.toString());
        System.out.println(employeur2.toString());
        System.out.println(employe1.toString());
        System.out.println(employe2.toString());
        System.out.println(commercant1.toString());
        System.out.println(commercant2.toString());
        System.out.println(carte1.toString());
        System.out.println(carte2.toString());
        System.out.println(commande1.toString());
        System.out.println(commande2.toString());
    }

}

                            /*Fin Main Classe*/