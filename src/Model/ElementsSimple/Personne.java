/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsSimple;

import Model.ElementSimple;

/**
 *
 * @author pom
 */
public abstract class Personne extends ElementSimple {
    
    private String nom;
    private String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    /**
     * 
     */
    @Override
    public void afficher(){
        
    }
}
