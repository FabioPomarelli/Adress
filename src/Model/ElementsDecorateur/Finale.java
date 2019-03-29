/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsDecorateur;

import Model.ElementDecorateur;
import Model.ElementSimple;
import com.google.gson.annotations.Expose;

/**
 *
 * @author pom
 */
public class Finale extends ElementDecorateur {

    @Expose
    private String email;

    public Finale(String email, ElementSimple element) {
        this.email = email;
        this.setElement(element);
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
        this.getElement().afficher();

    }

    @Override
    public String afficherStr() {
        return ("Bonjour je suis de type Email " + this.getEmail() + "\n"
                + this.getElement().afficherStr());

    }
}
