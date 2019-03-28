/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsDecorateur;

import Model.ElementSimple;
import Model.ElementsSimple.Personnes.Morale;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author florent losada
 */
public class AdressePostaleTest {
    
    public AdressePostaleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AdressePostale method, of class AdressePostale.
     */
    @Test
    public void testAdressePostale() {
        System.out.println("Test pour la construction d'une addresse en lui passant un objet de type Personne");
        String adress = "38 rue pardal";
        ElementSimple element = new Morale("Bob", "Marley");
        AdressePostale instance = new AdressePostale();
        instance.AdressePostale(adress, element);
        element.afficher();
        instance.afficher();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }
    
}
