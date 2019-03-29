/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsDecorateur;

import Model.ElementDecorateur;
import Model.ElementSimple;

/**
 *
 * @author pom
 */
public class Email  extends ElementDecorateur {
    
    private String email;

    /**
     * Constructeur
     *
     * @param email
     * @param element représente le type d'une personne (Morale, Entreprise
     * etc...)
     */
    public void Email(String email, ElementSimple element) {
        this.email = email;
        this.element = element;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     */
    @Override
    public void afficher() {
        System.out.println("Bonjour je suis de type Email " + this.getEmail());
        this.element.afficher();
    }

    @Override
    public String afficherStr() {
        return ("Bonjour je suis de type Email " + this.getEmail() + "\n" + 
                this.element.afficherStr());
        
    }
}
