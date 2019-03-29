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
public class TelephoneFixe  extends ElementDecorateur{
    @Expose
    private String telephoneFixe;

    /**
     * Constructeur
     *
     * @param telephoneFixe
     * @param element représente le type d'une personne (Morale, Entreprise
     * etc...)
     */
    public TelephoneFixe(String telephoneFixe, ElementSimple element) {
        this.telephoneFixe = telephoneFixe;
        this.element = element;
    }

    public String getTelephoneFixe() {
        return this.telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    /**
     *
     */
    @Override
    public void afficher() {
        System.out.println("Bonjour je suis de type TelephoneFixe " + this.getTelephoneFixe());
        this.element.afficher();
    }

    @Override
    public String afficherStr() {
        return ("Bonjour je suis de type TelephoneFixe " + this.getTelephoneFixe() + "\n"
                + this.element.afficherStr());

    }
}
