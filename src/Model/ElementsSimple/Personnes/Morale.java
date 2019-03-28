/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsSimple.Personnes;


import Model.ElementsSimple.Personne;

/**
 *
 * @author pom
 */
public class Morale extends Personne {
    
    public Morale(){}
    /**
     * Constructeur
     * @param nom d'une personne morale
     * @param prenom d'une personne morale
     */
    public Morale(String prenom, String nom){
        this.setNom(nom);
        this.setPrenom(prenom);
    }
    
    /**
     * 
     */
    @Override
    public void afficher(){
        System.out.println("Bonjour je suis " + this.getPrenom()+ " " + this.getNom());
    }
}
