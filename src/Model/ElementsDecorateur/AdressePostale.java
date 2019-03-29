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
public class AdressePostale extends ElementDecorateur {

    @Expose
    private String adress;

    /**
     * Constructeur
     *
     * @param adress
     * @param element représente le type d'une personne (Morale, Entreprise
     * etc...)
     */
    public AdressePostale(String adress, ElementSimple element) {
        this.adress = adress;
        this.setElement(element);
        element.add(this);
        //this.setElementClass(nomClass);

    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     *
     */
    @Override
    public void afficher() {
        System.out.println("Bonjour je suis de type AdressePostale " + this.getAdress());
        //this.getElement().afficher();
    }

    @Override
    public String afficherStr() {
        return ("Bonjour je suis de type AdressePostale " + this.getAdress() + "\n"
                + this.getElement().afficherStr());

    }
/*
    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("adress", this.adress);
        return json;
    }*/
}
