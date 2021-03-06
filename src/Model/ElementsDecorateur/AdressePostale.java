/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsDecorateur;

import org.json.simple.JSONObject;

/**
 *
 * @author pom
 */
public class AdressePostale implements IElementDecorateur {

    public static final String SCLASS = "AdressePostale";
    public final String OCLASS = "AdressePostale";

    // @Expose
    private String adress;

    /**
     * Constructeur
     *
     * @param adress
     * @param element représente le type d'une personne (Morale, Entreprise
     * etc...)
     */
    public AdressePostale() {

    }

    public AdressePostale(String adress) {
        this.adress = adress;

    }

    public AdressePostale(String[] adress) {

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
    //@Override
    public void afficher() {
        System.out.println("Bonjour je suis de type AdressePostale " + this.getAdress());
        //this.getElement().afficher();
    }

    // @Override
    public String afficherStr() {
        return ("Bonjour je suis de type AdressePostale " + this.getAdress() + "\n");
        // + this.getElement().afficherStr());

    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("AdressePostale", this);
        json.put("adress", this.adress);
        //   json.put("AdressePostale", this);
        return json;
    }
}
