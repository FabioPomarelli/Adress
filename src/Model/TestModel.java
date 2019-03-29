/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ElementsDecorateur.AdressePostale;
import Model.ElementsDecorateur.Email;
import Model.ElementsDecorateur.TelephoneFixe;
import Model.ElementsDecorateur.TelephoneMobile;
import Model.ElementsSimple.Personnes.Enterprise;
import Model.ElementsSimple.Personnes.Morale;
import com.google.gson.Gson;

/**
 *
 * @author pom
 */
public class TestModel {

    private static void test() {

        ElementCarnetAdresse m1 = new Morale("Fabio", "ooooo");
        ElementCarnetAdresse m2 = new Morale("Yasmine", "eeeee");
        ElementCarnetAdresse m3 = new Morale("Florent", "ttttt");
        ElementCarnetAdresse e1 = new Enterprise("Fabio", "ooooo");
        ElementCarnetAdresse e2 = new Enterprise("Yasmine", "eeeee");
        ElementCarnetAdresse e3 = new Enterprise("Florent", "ttttt");

        ElementCarnetAdresse ad1 = new AdressePostale("rue de fabio", ((ElementSimple) m1));
        ElementCarnetAdresse tf1 = new TelephoneFixe("0505050501", ((ElementSimple) ad1));
        ElementCarnetAdresse tm1 = new TelephoneMobile("0606060601", ((ElementSimple) tf1));
        ElementCarnetAdresse em1 = new Email("fabio@fabio.com", ((ElementSimple) tm1));
        ElementCarnetAdresse em2 = new Email("fabio@fabio.com1", ((ElementSimple) em1));

        System.out.println(em2.afficherStr());

         System.out.println(toJSon(em2));
         System.out.println(toJSon(em2));
         System.out.println(toJSon(em2));
         System.out.println(toJSon(em2));
         
         System.out.println(fromJSon(toJSon(em2)).afficherStr());
         
        ElementCarnetAdresse lecture = (ElementCarnetAdresse) fromJSon(toJSon(em2));
        
        lecture.afficher();
        
        System.out.println(lecture.afficherStr());
    }

    public static String toJSon(ElementCarnetAdresse el) {
        //librarie de google!
        Gson gson = new Gson();
        String strJson = gson.toJson(el);
        return strJson;
    }
    
    public static ElementCarnetAdresse fromJSon(String json) {
        //librarie de google! ElementCarnetAdresse.class
        Gson gson = new Gson();
        ElementCarnetAdresse obj = gson.fromJson(json, ElementCarnetAdresse.class);
        return obj;
      
    }
     public static ElementSimple fromJSon1(String json) {
        //librarie de google! ElementCarnetAdresse.class
        Gson gson = new Gson();
        ElementSimple obj = gson.fromJson(json, ElementSimple.class);
        return obj;
      
    }
      public static ElementDecorateur fromJSon2(String json) {
          System.out.println(json);
        //librarie de google! ElementCarnetAdresse.class
        Gson gson = new Gson();
        ElementDecorateur obj = gson.fromJson(json, ElementDecorateur.class);
        return obj;
      
    }
    
    
    

    public static void main(String[] args) {
        TestModel.test();

    }

}
