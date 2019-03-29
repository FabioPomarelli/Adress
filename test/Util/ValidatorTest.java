/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yasmine
 */
public class ValidatorTest {

    public ValidatorTest() {
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
     * Test of validateNom method, of class Validator.
     */
    @Test
    public void testValidateNom() {
        System.out.println("validateNom");
        String nom = "TERIEUR";
        boolean expResult = true;
        boolean result = Validator.validateNom(nom);
        assertEquals(expResult, result);
    }

    /**
     * Test of validatePrenom method, of class Validator.
     */
    @Test
    public void testValidatePrenom() {
        System.out.println("validatePrenom");
        String prenom = "Alain";
        boolean expResult = true;
        boolean result = Validator.validatePrenom(prenom);
        assertEquals(expResult, result);

    }

    /**
     * Test of validateTel method, of class Validator.
     */
    @Test
    public void testValidateTel() {
        System.out.println("validateTel");
        String numTel = "0612345678";
        boolean expResult = true;
        boolean result = Validator.validateTel(numTel);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateEmail method, of class Validator.
     */
    @Test
    public void testValidateEmail() {
        System.out.println("validateEmail");
        String email = "Alain.terieur@code.java";
        boolean expResult = true;
        boolean result = Validator.validateEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateAdresse method, of class Validator.
     */
    @Test
    public void testValidateAdresse() {
        System.out.println("validateAdresse");
        String adresse = "30_Avenue du Code_31000_LDNR";
        boolean expResult = true;
        boolean result = Validator.validateAdresse(adresse);
        assertEquals(expResult, result);
        
    }

}
