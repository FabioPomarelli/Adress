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
public class Finale extends ElementDecorateur {

    public Finale(ElementSimple element) {
        this.setElement(element);
        element.add(this);
    }

    @Override
    public void afficher() {
        this.getElement().afficher();
    }

    @Override
    public String afficherStr() {
        return this.getElement().afficherStr();
    }
}
