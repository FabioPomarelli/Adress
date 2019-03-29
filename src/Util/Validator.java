/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.regex.*;

/**
 *
 * @author Yasmine
 */
public class Validator {

    static boolean validateNom(String nom) {

        // compilation de la regex
        //^[A-Z][A-Z\\-]+$ : le nom s'écrit tout en majuscules séparées de tirets éventuellement.
        Pattern p = Pattern.compile("^[A-Z][A-Z\\-]+$");

        // création d'un moteur de recherche
        Matcher m = p.matcher(nom);

        // lancement de la recherche de toutes les occurrences
        boolean b = m.matches();

        return b;

    }

    static boolean validatePrenom(String prenom) {
        // compilation de la regex
        //^[A-Z][a-zA-Z\\-]+$ : le prénom s'écrit avec une première lettre majuscule puis en minuscules ou majuscules spérées de tiret.
        Pattern p = Pattern.compile("^[A-Z][a-zA-Z\\-]+$");

        // création d'un moteur de recherche
        Matcher m = p.matcher(prenom);

        // lancement de la recherche de toutes les occurrences
        boolean b = m.matches();

        return b;

    }

    static boolean validateTel(String numTel) {
        //TODO étendre aux numéro de tel hors Français?
        //^0[1-9][0-9]{8}: commence par zéro suivi d'un chiffre entre 1 et 9 puis 8 autres chiffres entre 0 et 9.
        // compilation de la regex
        Pattern p = Pattern.compile("^0[1-9][0-9]{8}");

        // création d'un moteur de recherche
        Matcher m = p.matcher(numTel);

        // lancement de la recherche de toutes les occurrences
        boolean b = m.matches();

        return b;
    }

    static boolean validateEmail(String email) {
        // compilation de la regex
        Pattern p = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");

        // création d'un moteur de recherche
        Matcher m = p.matcher(email);

        // lancement de la recherche de toutes les occurrences
        boolean b = m.matches();

        return b;
    }
     static boolean validateAdresse(String adresse){
         //^[0-9]{1,4}\\t[a-zA-Z0-9-\\s]+\\t[0-9]{5}[A-Z0-9-\\s]+$
         //adresse: chaine de caractères sous forme "numero_nomRue_codePostal_ville"
          // compilation de la regex
        Pattern p = Pattern.compile("^[0-9]{1,4}_[a-zA-Z0-9-\\s]+_[0-9]{5}_[A-Z0-9-\\s]+$");

        // création d'un moteur de recherche
        Matcher m = p.matcher(adresse);

        // lancement de la recherche de toutes les occurrences
        boolean b = m.matches();

        return b;
    }
}
