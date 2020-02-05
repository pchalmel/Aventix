                        /*Test Classe Personne*/

package modele;

/*---------------------------------IMPORTS------------------------------------*/

import org.junit.Test;
import services.ServicesImpl;
import static org.junit.Assert.*;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class PersonneTest {
    
    public PersonneTest() {
        this.p1 = new Personne();
        this.p2 = new Personne("Olivier", "Cinquin");
        this.p3 = new Personne("Oscar", "De Gramont", "9 rue de Brest");
        this.adr1 = "19 rue de l'Yvette";
        this.adr2 = "5 rue des sciences";
        this.adr3 = "1 rue des Acacias";
        this.nom1 = "Moreau";
        this.nom2 = "Joly";
        this.nom3 = "Chassine";
    }
    
    Personne p1, p2, p3;
    String adr1, adr2, adr3, nom1, nom2, nom3;

    /**
     * Test of getIdPersonne method, of class Personne.
     */
    @Test
    public void testGetIdPersonne() {
        System.out.println("getIdPersonne");
        ServicesImpl services = new ServicesImpl();
        services.referencerPersonne(p1);
        services.referencerPersonne(p2);
        services.referencerPersonne(p3);
        int expResult1 = 1;
        int expResult2 = 2;
        int expResult3 = 3;
        int result1 = p1.getIdPersonne();
        int result2 = p2.getIdPersonne();
        int result3 = p3.getIdPersonne();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        String expResult1 = "John";
        String expResult2 = "Olivier";
        String expResult3 = "Oscar";
        String result1 = p1.getPrenom();
        String result2 = p2.getPrenom();
        String result3 = p3.getPrenom();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult1 = "Doe";
        String expResult2 = "Cinquin";
        String expResult3 = "De Gramont";
        String result1 = p1.getNom();
        String result2 = p2.getNom();
        String result3 = p3.getNom();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getAdresse method, of class Personne.
     */
    @Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        String expResult1 = "";
        String expResult2 = "";
        String expResult3 = "9 rue de Brest";
        String result1 = p1.getAdresse();
        String result2 = p2.getAdresse();
        String result3 = p3.getAdresse();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of setPrenom method, of class Personne.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom1 = "Audrey";
        String prenom2 = "Jacques";
        String prenom3 = "Sylvie";
        p1.setPrenom(prenom1);
        assertEquals(prenom1,p1.getPrenom());
        p2.setPrenom(prenom2);
        assertEquals(prenom2,p2.getPrenom());
        p3.setPrenom(prenom3);
        assertEquals(prenom3,p3.getPrenom());
    }

    /**
     * Test of setNom method, of class Personne.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        p1.setNom(nom1);
        assertEquals(nom1,p1.getNom());
        p2.setNom(nom2);
        assertEquals(nom2,p2.getNom());
        p3.setNom(nom3);
        assertEquals(nom3,p3.getNom());
    }

    /**
     * Test of setAdresse method, of class Personne.
     */
    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        p1.setAdresse(adr1);
        assertEquals(adr1,p1.getAdresse());
        p2.setAdresse(adr2);
        assertEquals(adr2,p2.getAdresse());
        p3.setAdresse(adr3);
        assertEquals(adr3,p3.getAdresse());
    }

    /**
     * Test of demenager method, of class Personne.
     */
    @Test
    public void testDemenager() {
        System.out.println("demenager");
        p1.demenager(adr2);
        assertEquals(adr2,p1.getAdresse());
        p2.demenager(adr3);
        assertEquals(adr3,p2.getAdresse());
        p3.demenager(adr1);
        assertEquals(adr1,p3.getAdresse());
    }

    /**
     * Test of marier method, of class Personne.
     */
    @Test
    public void testMarier() {
        System.out.println("marier");
        p1.marier(nom2);
        assertEquals(nom2,p1.getNom());
        p2.marier(nom3);
        assertEquals(nom3,p2.getNom());
        p3.marier(nom1);
        assertEquals(nom1,p3.getNom());
    }
    
}

                        /*Fin Test Classe Personne*/