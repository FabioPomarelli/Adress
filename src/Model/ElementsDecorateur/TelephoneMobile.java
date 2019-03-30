/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsDecorateur;

/**
 *
 * @author pom
 */
public class TelephoneMobile implements IElementDecorateur {

    public static final String SCLASS = "TelephoneMobile";
    public final String OCLASS = "TelephoneMobile";
    private String telephoneMobile;

    /**
     * Constructeur
     *
     * @param telephoneMobile
     * @param element représente le type d'une personne (Morale, Entreprise
     * etc...)
     */
    public TelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;

    }

    public TelephoneMobile(String[] telephoneMobile) {

    }

    public TelephoneMobile() {
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
    // @Override
    public void afficher() {
        System.out.println("Bonjour je suis de type TelephoneMobile " + this.getTelephoneMobile());
        //   this.getElement().afficher();
    }

    // @Override
    public String afficherStr() {
        return ("Bonjour je suis de type TelephoneMobile " + this.getTelephoneMobile() + "\n");
        //+ this.getElement().afficherStr());

    }

}
