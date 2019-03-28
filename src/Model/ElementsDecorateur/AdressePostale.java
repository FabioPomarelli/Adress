/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsDecorateur;

import Model.ElementDecorateur;
import Model.ElementSimple;
import java.io.PrintStream;

/**
 *
 * @author pom
 */
public class AdressePostale extends ElementDecorateur {
    
    private String adress;
  
       
    /**
     * Constructeur
     * @param adress
     * @param element représente le type d'une personne (Morale, Entreprise etc...)
     */
    public void AdressePostale(String adress, ElementSimple element){
        this.adress = adress;
        this.element = element;
    }
    
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
     /**
     * 
     */
    @Override
    public void afficher(){
        System.out.println(this.element + " J'habite au : " + this.getAdress());
    }
}
