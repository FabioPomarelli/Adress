/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsSimple;

import Model.ElementsDecorateur.IElementDecorateur;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pom
 */
public class SimpleContact extends ElementContact {

    public static final String SCLASS = "SimpleContact";
    public final String OCLASS = "SimpleContact";

    private String nom;
    private String prenom;

    @JsonAnySetter
    private List<IElementDecorateur> elementDecoratuer = new ArrayList<>();

    public SimpleContact() {

    }

    public SimpleContact(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void afficher() {
        System.out.println("Bonjour je suis de type Contact " + this.getPrenom() + " " + this.getNom());
    }

    public String afficherStr() {
        return ("Bonjour je suis de type Contact " + this.getPrenom() + " " + this.getNom() + "\n");
    }

    /**
     *
     * @param element
     */
    public void add(IElementDecorateur element) {

        this.elementDecoratuer.add(element);

    }

    /**
     *
     * @param element
     */
    public void retirer(IElementDecorateur element) {
        this.elementDecoratuer.remove(element);
    }

    /**
     *
     */
    @JsonAnyGetter(enabled = false)
    public List getGroupe() {
        return this.elementDecoratuer;
    }

    public void setParametres(String[] array) {
        nom = array[1];
        prenom = array[2];
    }
}
