/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsSimple.Extraterrestres;

import Model.ElementsSimple.Extraterrestre;

/**
 *
 * @author pom
 */
public class Marsien extends Extraterrestre{
       
    /**
     * Constructeur
     * @param nom d'une personne morale
     * @param prenom d'une personne morale
     */
    public Marsien(String prenom, String nom){
        super(nom, prenom);
    }
    
    /**
     * 
     */
      @Override
    public void afficher(){
        System.out.println("Bonjour je suis de type Marsien " + this.getPrenom() + " " + this.getNom());
    }
    
    @Override
    public String afficherStr(){
        return ("Bonjour je suis de type Marsien " + this.getPrenom() + " " + this.getNom()+"\n");
    }
    
}
