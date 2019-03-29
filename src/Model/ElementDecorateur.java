/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pom
 */
public class ElementDecorateur extends ElementSimple {
    
    public ElementSimple element;

    /**
     * Constructeur
     * @param elemntSimple 
     */
    public void ElementDecorateur(ElementSimple elemntSimple){
        this.element= elemntSimple;
    }
 
    /**
     * 
     */
    @Override
    public void afficher(){
        this.element.afficher();
    }
    
    
}
