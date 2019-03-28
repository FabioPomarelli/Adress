/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsSimple.Personnes;

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
public class MoraleTest {
    
    public MoraleTest() {
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
     * Test of afficher method, of class Morale.
     */
    @Test
    public void testAfficher() {
        System.out.println("Test méthode afficher de la classe morale");
        Morale instance = new Morale("Steeve", "Moral");
        instance.afficher();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }
   
    
}
