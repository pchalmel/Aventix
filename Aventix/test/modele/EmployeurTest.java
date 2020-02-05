                        /*Test Classe Employeur*/

package modele;

/*---------------------------------IMPORTS------------------------------------*/

import org.junit.Test;
import services.ServicesImpl;
import static org.junit.Assert.*;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class EmployeurTest {

    public EmployeurTest() {
        this.e1 = new Employeur();
        this.e2 = new Employeur("Olivier", "Cinquin", "Aventix", "Lyon", "0400000000");
        this.e3 = new Employeur("Oscar", "De Gramont", "9 rue de Brest", "Sodexo", "Villeurbanne", "0450000000");
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

    Employeur e1, e2, e3;
    String adr1, adr2, adr3, nom1, nom2, nom3, identifiant1, identifiant2, identifiant3, password1, password2, password3;

    /**
     * Test of getIdentifiant method, of class Employeur.
     */
    
    @Test
    public void testGetIdentifiant() {
        System.out.println("getIdentifiant");
        String expResult1 = "jdoe";
        String expResult2 = "ocinquin";
        String expResult3 = "odegramont";
        String result1 = e1.getIdentifiant();
        String result2 = e2.getIdentifiant();
        String result3 = e3.getIdentifiant();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getPassword method, of class Employeur.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult1 = "DoeJohn@2020";
        String expResult2 = "CinquinOlivier@2020";
        String expResult3 = "DeGramontOscar@2020";
        String result1 = e1.getPassword();
        String result2 = e2.getPassword();
        String result3 = e3.getPassword();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of setIdentifiant method, of class Employeur.
     */
    @Test
    public void testSetIdentifiant() {
        System.out.println("setIdentifiant");
        e1.setIdentifiant(identifiant1);
        assertEquals(identifiant1,e1.getIdentifiant());
        e2.setIdentifiant(identifiant2);
        assertEquals(identifiant2,e2.getIdentifiant());
        e3.setIdentifiant(identifiant3);
        assertEquals(identifiant3,e3.getIdentifiant());
    }

    /**
     * Test of setPassword method, of class Employeur.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        e1.setPassword(password1);
        assertEquals(password1,e1.getPassword());
        e2.setPassword(password2);
        assertEquals(password2,e2.getPassword());
        e3.setPassword(password3);
        assertEquals(password3,e3.getPassword());
    }

    /**
     * Test of actualiserIdentifiant method, of class Employeur.
     */
    @Test
    public void testActualiserIdentifiant() {
        System.out.println("actualiserIdentifiant");
        String expResult1 = "jdoe";
        String expResult2 = "ocinquin";
        String expResult3 = "odegramont";
        e1.actualiserIdentifiant();
        assertEquals(e1.getIdentifiant(),expResult1);
        e2.actualiserIdentifiant();
        assertEquals(e2.getIdentifiant(),expResult2);
        e3.actualiserIdentifiant();
        assertEquals(e3.getIdentifiant(),expResult3);
    }

    /**
     * Test of changerPassword method, of class Employeur.
     */
    @Test
    public void testChangerPassword() {
        System.out.println("changerPassword");
        e1.changerPassword(password2);
        assertEquals(password2,e1.getPassword());
        e2.changerPassword(password3);
        assertEquals(password3,e2.getPassword());
        e3.changerPassword(password1);
        assertEquals(password1,e3.getPassword());
    }

    /**
     * Test of marier method, of class Employeur.
     */
    @Test
    public void testMarier() {
        System.out.println("marier");
        e1.marier(nom2);
        String expResult1 = "jjoly";
        String expResult2 = "ochassine";
        String expResult3 = "omoreau";
        assertEquals(nom2,e1.getNom());
        assertEquals(expResult1, e1.getIdentifiant());
        e2.marier(nom3);
        assertEquals(nom3,e2.getNom());
        assertEquals(expResult2, e2.getIdentifiant());
        e3.marier(nom1);
        assertEquals(nom1,e3.getNom());
        assertEquals(expResult3, e3.getIdentifiant());
    }
    
    /**
     * Test of demenager method, of class Employeur.
     */
    @Test
    public void testDemenager() {
        System.out.println("demenager");
        e1.demenager(adr1);
        assertEquals(adr1,e1.getAdresse());
        e2.demenager(adr2);
        assertEquals(adr2,e2.getAdresse());
        e3.demenager(adr3);
        assertEquals(adr3,e3.getAdresse());
    }
    
    /**
     * Test of getId method, of class Employeur.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ServicesImpl services = new ServicesImpl();
        services.referencerPersonne(e1);
        services.referencerPersonne(e2);
        services.referencerPersonne(e3);
        int expResult1 = 1;
        int expResult2 = 2;
        int expResult3 = 3;
        int result1 = e1.getId();
        int result2 = e2.getId();
        int result3 = e3.getId();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getPrenom method, of class Employeur.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        String expResult1 = "John";
        String expResult2 = "Olivier";
        String expResult3 = "Oscar";
        String result1 = e1.getPrenom();
        String result2 = e2.getPrenom();
        String result3 = e3.getPrenom();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getNom method, of class Employeur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult1 = "Doe";
        String expResult2 = "Cinquin";
        String expResult3 = "De Gramont";
        String result1 = e1.getNom();
        String result2 = e2.getNom();
        String result3 = e3.getNom();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getAdresse method, of class Employeur.
     */
    @Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        String expResult1 = "";
        String expResult2 = "";
        String expResult3 = "9 rue de Brest";
        String result1 = e1.getAdresse();
        String result2 = e2.getAdresse();
        String result3 = e3.getAdresse();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of setPrenom method, of class Employeur.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom1 = "Audrey";
        String prenom2 = "Jacques";
        String prenom3 = "Sylvie";
        e1.setPrenom(prenom1);
        assertEquals(prenom1,e1.getPrenom());
        e2.setPrenom(prenom2);
        assertEquals(prenom2,e2.getPrenom());
        e3.setPrenom(prenom3);
        assertEquals(prenom3,e3.getPrenom());
    }

    /**
     * Test of setNom method, of class Employeur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        e1.setNom(nom3);
        assertEquals(nom3,e1.getNom());
        e2.setNom(nom1);
        assertEquals(nom1,e2.getNom());
        e3.setNom(nom2);
        assertEquals(nom2,e3.getNom());
    }

    /**
     * Test of setAdresse method, of class Employeur.
     */
    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        e1.setAdresse(adr3);
        assertEquals(adr3,e1.getAdresse());
        e2.setAdresse(adr1);
        assertEquals(adr1,e2.getAdresse());
        e3.setAdresse(adr2);
        assertEquals(adr2,e3.getAdresse());
    }
    
    /**
     * Test of getNomSociete method, of class Employeur.
     */
    @Test
    public void testGetNomSociete() {
        System.out.println("getNomSociete");
        String expResult1 = "";
        String expResult2 = "Aventix";
        String expResult3 = "Sodexo";
        String result1 = e1.getNomSociete();
        String result2 = e2.getNomSociete();
        String result3 = e3.getNomSociete();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getAdresseSociete method, of class Employeur.
     */
    @Test
    public void testGetAdresseSociete() {
        System.out.println("getAdresseSociete");
        String expResult1 = "";
        String expResult2 = "Lyon";
        String expResult3 = "Villeurbanne";
        String result1 = e1.getAdresseSociete();
        String result2 = e2.getAdresseSociete();
        String result3 = e3.getAdresseSociete();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }
    
    /**
     * Test of getTelSociete method, of class Employeur.
     */
    @Test
    public void testGetTelSociete() {
        System.out.println("getTelSociete");
        String expResult1 = "";
        String expResult2 = "0400000000";
        String expResult3 = "0450000000";
        String result1 = e1.getTelSociete();
        String result2 = e2.getTelSociete();
        String result3 = e3.getTelSociete();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }
    
    /**
     * Test of setNomSociete method, of class Employeur.
     */
    @Test
    public void testSetNomSociete() {
        System.out.println("setNomSociete");
        String societe1 = "Amazon";
        String societe2 = "Google";
        String societe3 = "Lidle";
        e1.setNomSociete(societe3);
        assertEquals(societe3,e1.getNomSociete());
        e2.setNomSociete(societe1);
        assertEquals(societe1,e2.getNomSociete());
        e3.setNomSociete(societe2);
        assertEquals(societe2,e3.getNomSociete());
    }
    
    /**
     * Test of setAdresseSociete method, of class Employeur.
     */
    @Test
    public void testSetAdresseSociete() {
        System.out.println("setAdresseSociete");
        String adresseSociete1 = "US";
        String adresseSociete2 = "Inde";
        String adresseSociete3 = "France";
        e1.setAdresseSociete(adresseSociete1);
        assertEquals(adresseSociete1,e1.getAdresseSociete());
        e2.setAdresseSociete(adresseSociete2);
        assertEquals(adresseSociete2,e2.getAdresseSociete());
        e3.setAdresseSociete(adresseSociete3);
        assertEquals(adresseSociete3,e3.getAdresseSociete());
    }
    
    /**
     * Test of setTelSociete method, of class Employeur.
     */
    @Test
    public void testSetTelSociete() {
        System.out.println("setTelSociete");
        String telSociete1 = "US";
        String telSociete2 = "Inde";
        String telSociete3 = "France";
        e1.setTelSociete(telSociete1);
        assertEquals(telSociete1,e1.getTelSociete());
        e2.setTelSociete(telSociete2);
        assertEquals(telSociete2,e2.getTelSociete());
        e3.setTelSociete(telSociete3);
        assertEquals(telSociete3,e3.getTelSociete());
    }

}

                        /*Fin Test Classe Employeur*/