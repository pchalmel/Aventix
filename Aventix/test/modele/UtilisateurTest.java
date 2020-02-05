                        /*Test Classe Utilisateur*/

package modele;

/*---------------------------------IMPORTS------------------------------------*/

import org.junit.Test;
import services.ServicesImpl;
import static org.junit.Assert.*;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class UtilisateurTest {
    
    public UtilisateurTest() {
        this.u1 = new Utilisateur();
        this.u2 = new Utilisateur("Olivier", "Cinquin");
        this.u3 = new Utilisateur("Oscar", "De Gramont", "9 rue de Brest");
        this.adr1 = "19 rue de l'Yvette";
        this.adr2 = "5 rue des sciences";
        this.adr3 = "1 rue  des Acacias";
        this.nom1 = "Moreau";
        this.nom2 = "Joly";
        this.nom3 = "Chassine";
        this.identifiant1 = "Audrey";
        this.identifiant2 = "Jacques";
        this.identifiant3 = "Sylvie";
        this.password1 = "Audrey51";
        this.password2 = "Jacques51";
        this.password3 = "Sylvie51";
    }
    
    Utilisateur u1, u2, u3;
    String adr1, adr2, adr3, nom1, nom2, nom3, identifiant1, identifiant2, identifiant3, password1, password2, password3;
    
    /**
     * Test of getIdentifiant method, of class Utilisateur.
     */
    
    @Test
    public void testGetIdentifiant() {
        System.out.println("getIdentifiant");
        String expResult1 = "jdoe";
        String expResult2 = "ocinquin";
        String expResult3 = "odegramont";
        String result1 = u1.getIdentifiant();
        String result2 = u2.getIdentifiant();
        String result3 = u3.getIdentifiant();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getPassword method, of class Utilisateur.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult1 = "DoeJohn@2020";
        String expResult2 = "CinquinOlivier@2020";
        String expResult3 = "DeGramontOscar@2020";
        String result1 = u1.getPassword();
        String result2 = u2.getPassword();
        String result3 = u3.getPassword();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of setIdentifiant method, of class Utilisateur.
     */
    @Test
    public void testSetIdentifiant() {
        System.out.println("setIdentifiant");
        u1.setIdentifiant(identifiant1);
        assertEquals(identifiant1,u1.getIdentifiant());
        u2.setIdentifiant(identifiant2);
        assertEquals(identifiant2,u2.getIdentifiant());
        u3.setIdentifiant(identifiant3);
        assertEquals(identifiant3,u3.getIdentifiant());
    }

    /**
     * Test of setPassword method, of class Utilisateur.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        u1.setPassword(password1);
        assertEquals(password1,u1.getPassword());
        u2.setPassword(password2);
        assertEquals(password2,u2.getPassword());
        u3.setPassword(password3);
        assertEquals(password3,u3.getPassword());
    }

    /**
     * Test of actualiserIdentifiant method, of class Utilisateur.
     */
    @Test
    public void testActualiserIdentifiant() {
        System.out.println("actualiserIdentifiant");
        String expResult1 = "jdoe";
        String expResult2 = "ocinquin";
        String expResult3 = "odegramont";
        u1.actualiserIdentifiant();
        assertEquals(u1.getIdentifiant(),expResult1);
        u2.actualiserIdentifiant();
        assertEquals(u2.getIdentifiant(),expResult2);
        u3.actualiserIdentifiant();
        assertEquals(u3.getIdentifiant(),expResult3);
    }

    /**
     * Test of changerPassword method, of class Utilisateur.
     */
    @Test
    public void testChangerPassword() {
        System.out.println("changerPassword");
        u1.changerPassword(password2);
        assertEquals(password2,u1.getPassword());
        u2.changerPassword(password3);
        assertEquals(password3,u2.getPassword());
        u3.changerPassword(password1);
        assertEquals(password1,u3.getPassword());
    }

    /**
     * Test of marier method, of class Utilisateur.
     */
    @Test
    public void testMarier() {
        System.out.println("marier");
        u1.marier(nom2);
        String expResult1 = "jjoly";
        String expResult2 = "ochassine";
        String expResult3 = "omoreau";
        assertEquals(nom2,u1.getNom());
        assertEquals(expResult1, u1.getIdentifiant());
        u2.marier(nom3);
        assertEquals(nom3,u2.getNom());
        assertEquals(expResult2, u2.getIdentifiant());
        u3.marier(nom1);
        assertEquals(nom1,u3.getNom());
        assertEquals(expResult3, u3.getIdentifiant());
    }
    
    /**
     * Test of demenager method, of class Utilisateur.
     */
    @Test
    public void testDemenager() {
        System.out.println("demenager");
        u1.demenager(adr1);
        assertEquals(adr1,u1.getAdresse());
        u2.demenager(adr2);
        assertEquals(adr2,u2.getAdresse());
        u3.demenager(adr3);
        assertEquals(adr3,u3.getAdresse());
    }
    
    /**
     * Test of getId method, of class Utilisateur.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ServicesImpl services = new ServicesImpl();
        services.referencerPersonne(u1);
        services.referencerPersonne(u2);
        services.referencerPersonne(u3);
        int expResult1 = 1;
        int expResult2 = 2;
        int expResult3 = 3;
        int result1 = u1.getId();
        int result2 = u2.getId();
        int result3 = u3.getId();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getPrenom method, of class Utilisateur.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        String expResult1 = "John";
        String expResult2 = "Olivier";
        String expResult3 = "Oscar";
        String result1 = u1.getPrenom();
        String result2 = u2.getPrenom();
        String result3 = u3.getPrenom();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getNom method, of class Utilisateur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult1 = "Doe";
        String expResult2 = "Cinquin";
        String expResult3 = "De Gramont";
        String result1 = u1.getNom();
        String result2 = u2.getNom();
        String result3 = u3.getNom();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getAdresse method, of class Utilisateur.
     */
    @Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        String expResult1 = "";
        String expResult2 = "";
        String expResult3 = "9 rue de Brest";
        String result1 = u1.getAdresse();
        String result2 = u2.getAdresse();
        String result3 = u3.getAdresse();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of setPrenom method, of class Utilisateur.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom1 = "Audrey";
        String prenom2 = "Jacques";
        String prenom3 = "Sylvie";
        u1.setPrenom(prenom1);
        assertEquals(prenom1,u1.getPrenom());
        u2.setPrenom(prenom2);
        assertEquals(prenom2,u2.getPrenom());
        u3.setPrenom(prenom3);
        assertEquals(prenom3,u3.getPrenom());
    }

    /**
     * Test of setNom method, of class Utilisateur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        u1.setNom(nom3);
        assertEquals(nom3,u1.getNom());
        u2.setNom(nom1);
        assertEquals(nom1,u2.getNom());
        u3.setNom(nom2);
        assertEquals(nom2,u3.getNom());
    }

    /**
     * Test of setAdresse method, of class Utilisateur.
     */
    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        u1.setAdresse(adr3);
        assertEquals(adr3,u1.getAdresse());
        u2.setAdresse(adr1);
        assertEquals(adr1,u2.getAdresse());
        u3.setAdresse(adr2);
        assertEquals(adr2,u3.getAdresse());
    }
    
}

                        /*Fin Test Classe Utilisateur*/