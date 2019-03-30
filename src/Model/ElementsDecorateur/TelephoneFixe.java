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
public class TelephoneFixe implements IElementDecorateur {

    public static final String SCLASS = "TelephoneFixe";
    public final String OCLASS = "TelephoneFixe";
    private String telephoneFixe;

   
    public TelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;

    }

    public TelephoneFixe(String[] telephoneFixe) {

    }

    public TelephoneFixe() {
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
    // @Override
    public void afficher() {
        System.out.println("Bonjour je suis de type TelephoneFixe " + this.getTelephoneFixe());
        //    this.getElement().afficher();
    }

    //@Override
    public String afficherStr() {
        return ("Bonjour je suis de type TelephoneFixe " + this.getTelephoneFixe() + "\n");
        //+ this.getElement().afficherStr());

    }
}
