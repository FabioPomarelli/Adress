/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsDecorateur;

import Model.ElementDecorateur;
import Model.ElementSimple;
import com.google.gson.annotations.Expose;
import org.json.simple.JSONObject;

/**
 *
 * @author pom
 */
public class Email extends ElementDecorateur {

    @Expose
    private String email;

    public Email(String email, ElementSimple element) {
        this.email = email;
        this.setElement(element);
        element.add(this);
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
        //this.getElement().afficher();

    }

    @Override
    public String afficherStr() {
        return ("Bonjour je suis de type Email " + this.getEmail() + "\n"
                + this.getElement().afficherStr());
    }
    /*
     @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("adress", this.email);
        return json;
    }*/
}
