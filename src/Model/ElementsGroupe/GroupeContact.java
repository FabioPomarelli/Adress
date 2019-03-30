/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsGroupe;

import Model.ElementsSimple.ElementContact;
import Model.ElementsSimple.SimpleContact;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pom
 */
public class GroupeContact extends ElementContact {
   
     public static final String SCLASS = "GroupeContact";
    public final String OCLASS = "GroupeContact";
    

    private List<SimpleContact> elementCarnetAdress = new ArrayList<>();

    /**
     *
     * @param element
     */
    public void add(SimpleContact element) {
        this.elementCarnetAdress.add(element);

    }

    /**
     *
     * @param element
     */
    public void retirer(ElementContact element) {
        this.elementCarnetAdress.remove(element);
    }

    /**
     *
     */
   
    public void getGroupe(List element) {
         this.elementCarnetAdress=element;
    }
    
    
    
    public List getGroupe() {
        return this.elementCarnetAdress;
    }

    /**
     *
     */
    public void afficher() {
        for (Object obj : this.elementCarnetAdress) {
            ((SimpleContact) (obj)).afficher();
        }
    }

    public String afficherStr() {
        String app = "";
        for (Object obj : this.elementCarnetAdress) {
            app += ((SimpleContact) (obj)).afficherStr();
        }
        return app;
    }
}
