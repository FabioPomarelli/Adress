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
public class TelephoneMobile  extends ElementDecorateur {
    @Expose
    private String telephoneMobile;

    /**
     * Constructeur
     *
     * @param telephoneMobile
     * @param element représente le type d'une personne (Morale, Entreprise
     * etc...)
     */
    public TelephoneMobile(String telephoneMobile, ElementSimple element) {
        this.telephoneMobile = telephoneMobile;
        this.setElement(element);
        element.add(this);
    }

    public String getTelephoneMobile() {
        return this.telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    /**
     *
     */
    @Override
    public void afficher() {
        System.out.println("Bonjour je suis de type TelephoneMobile " + this.getTelephoneMobile());
     //   this.getElement().afficher();
    }

    @Override
    public String afficherStr() {
        return ("Bonjour je suis de type TelephoneMobile " + this.getTelephoneMobile() + "\n"
                + this.getElement().afficherStr());

    }
    
}
