                        /*Test Classe Employeur*/

package modele;

/*---------------------------------IMPORTS------------------------------------*/

import org.junit.Test;
import services.ServicesImpl;
import static org.junit.Assert.*;

/*--------------------------------FIN IMPORTS---------------------------------*/

public class EmployeTest {
    
    public EmployeTest() {
        this.e1 = new Employe();
        this.e2 = new Employe("Olivier", "Cinquin", 1L, 2L);
        this.e3 = new Employe("Oscar", "De Gramont", "9 rue de Brest", 1L, 1L);
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
    
    Employe e1, e2, e3;
    String adr1, adr2, adr3, nom1, nom2, nom3, identifiant1, identifiant2, identifiant3, password1, password2, password3;

    /**
     * Test of getIdEmployeur method, of class Employe.
     */
    @Test
    public void testGetIdEmploye() {
        System.out.println("getIdEmploye");
        Employe instance = new Employe();
        Long expResult = null;
        Long result = instance.getIdEmploye();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdCarte method, of class Employe.
     */
    @Test
    public void testGetIdCarte() {
        System.out.println("getIdCarte");
        Employe instance = new Employe();
        Long expResult = null;
        Long result = instance.getIdCarte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEmployeur method, of class Employe.
     */
    @Test
    public void testSetIdEmployeur() {
        System.out.println("setIdEmployeur");
        Long idEmployeur = null;
        Employe instance = new Employe();
        instance.setIdEmployeur(idEmployeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCarte method, of class Employe.
     */
    @Test
    public void testSetIdCarte() {
        System.out.println("setIdCarte");
        Long idCarte = null;
        Employe instance = new Employe();
        instance.setIdCarte(idCarte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
