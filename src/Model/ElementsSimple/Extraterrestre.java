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
public class Extraterrestre extends ElementSimple {
    private String nom;
    private String prenom;

    public Extraterrestre(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
    
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
    
    
    /**
     * 
     */
    @Override
    public void afficher(){
        System.out.println("Bonjour je suis de type Extraterrestre " + this.getPrenom() + " " + this.getNom());
    }
    
    @Override
    public String afficherStr(){
        return ("Bonjour je suis de type Extraterrestre " + this.getPrenom() + " " + this.getNom()+"\n");
    }
    
}
