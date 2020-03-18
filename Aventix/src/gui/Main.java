                             /*Main Classe*/

package gui;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.IOException;
import javax.mail.MessagingException;
import modele.Carte;
import modele.Commande;
import modele.Commercant;
import modele.Employe;
import modele.Entreprise;
import modele.ServiceFacturation;
import modele.Transa;
import services.ServicesImpl;
import java.lang.Runnable;
import java.lang.Thread;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import modele.ServiceCompensation;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class Main {

    public static void main(String[] args) throws MessagingException, IOException {
        
        //Instanciation de 2 objets de chaque entité
        ServiceFacturation sF1 = new ServiceFacturation();
        Entreprise entreprise1 = new Entreprise("Vivian Corporation", "vivian.wong@insa-lyon.fr", "Caluir", "0661457884");
        Entreprise entreprise2 = new Entreprise("Total", "total@tot.fr", "5 rue du Port", "0264977852");
        Carte carte1 = new Carte(19);
        Carte carte2 = new Carte(12);
        Employe employe1 = new Employe("Vivian", "Wong", "vivian.wong@insa-lyon.fr");
        Employe employe2 = new Employe("Nicolas", "Moreau", "ricson.varish@hotmail.fr", entreprise2);
        Commercant commercant1 = new Commercant("Miche2Pain", "miche@pain.fr", "9 rue de Brest", "0605782413", "16645997788534461669");
        Commercant commercant2 = new Commercant("KsCrout'", "crout@ks.fr", "79 boulevard Martin", "0674169853", "19765328465925134785");
        Commande commande1 = new Commande(entreprise1, 64, "Tada !!!!!!! :D");
        Commande commande2 = new Commande(entreprise2, 24, "Merci");
        
        //Instanciation d'un objet service qui interagira avec la BDD
        ServicesImpl services = new ServicesImpl();
        
        //Application du service de referencement en BDD de toutes les instances des differentes entités
        services.referencerServiceFacturation(sF1);
        services.referencerEntreprise(entreprise1);
        services.referencerEntreprise(entreprise2);
        services.referencerCommercant(commercant1);
        services.referencerCommercant(commercant2);
        services.referencerEmploye(employe1);
        services.referencerEmploye(employe2);
        services.referencerCarte(carte1);
        services.referencerCarte(carte2);
        services.referencerCommande(commande1);
        services.referencerCommande(commande2);
        carte1.affecterEmploye(employe1);
        carte2.affecterEmploye(employe2);
        Transa transaction1 = new Transa(employe1.getCarte().getId(), commercant2.getId(), 13);
        Transa transaction2 = new Transa(employe2.getCarte().getId(), commercant1.getId(), 9);
        services.referencerTransa(transaction1);
        services.referencerTransa(transaction2);
        
        //Méthodes Employe
        employe1.demenager("1 rue du Paradis");
        
        //Affichage de toutes les instances des differentes entités
        System.out.println(services.findAllEntreprises());
        System.out.println(services.findAllEmployes());
        System.out.println(services.findAllCommercants());
        System.out.println(services.findAllCartes());
        System.out.println(services.findAllCommandes());
        System.out.println(services.findAllTransas());
        System.out.println(employe1.historiqueTransas().toString());
        
        //sF1.envoyerFacture(commande1);
        //employe2.passwordOublie();
        //entreprise1.nouvelEmploye(employe1);
        
        TimerTask timerTask = new ServiceCompensation();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, new Date(), 5000);
        System.in.read();
    }
}

                            /*Fin Main Classe*/