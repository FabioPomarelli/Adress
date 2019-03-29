/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ElementsDecorateur.AdressePostale;
import Model.ElementsDecorateur.Email;
import Model.ElementsDecorateur.Finale;
import Model.ElementsDecorateur.TelephoneFixe;
import Model.ElementsDecorateur.TelephoneMobile;
import Model.ElementsGroupe.CarnetAdresse;
import Model.ElementsSimple.Personnes.Enterprise;
import Model.ElementsSimple.Personnes.Morale;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

/**
 *
 * @author pom
 */
public class TestModel {

    private static void test() {

        ElementCarnetAdresse m1 = new Morale("Fabio", "ooooo");
        ElementCarnetAdresse m2 = new Morale("Florent", "ttttt");
        ElementCarnetAdresse m3 = new Morale("Yasmine", "eeeeee");
        /*
        ElementCarnetAdresse e1 = new Enterprise("Fabio", "ooooo");
        ElementCarnetAdresse e2 = new Enterprise("Yasmine", "eeeee");
        ElementCarnetAdresse e3 = new Enterprise("Florent", "ttttt");*/

        ElementCarnetAdresse ad1 = new AdressePostale("rue de fabio", ((ElementSimple) m1));
        ElementCarnetAdresse tf1 = new TelephoneFixe("0505050501", ((ElementSimple) ad1));
        ElementCarnetAdresse tm1 = new TelephoneMobile("0606060601", ((ElementSimple) tf1));
        ElementCarnetAdresse em11 = new Email("fabio@fabio.com", ((ElementSimple) tm1));
        ElementCarnetAdresse em12 = new AdressePostale("rue de fabio1", ((ElementSimple) em11));
        ElementCarnetAdresse f1 = new Finale(((ElementSimple) em12));
        
        
        ElementCarnetAdresse ad2 = new AdressePostale("rue de Florent", ((ElementSimple) m2));
        ElementCarnetAdresse tf2 = new TelephoneFixe("0505050502", ((ElementSimple) ad2));
        ElementCarnetAdresse tm2 = new TelephoneMobile("0606060602", ((ElementSimple) tf2));
        ElementCarnetAdresse em21 = new Email("florent@florent.com", ((ElementSimple) tm2));
        ElementCarnetAdresse em22 = new AdressePostale("rue de Florent1", ((ElementSimple) em21));
        ElementCarnetAdresse f2 = new Finale(((ElementSimple) em22));
        
        ElementCarnetAdresse ad3 = new AdressePostale("rue de Yasmine", ((ElementSimple) m3));
        ElementCarnetAdresse tf3 = new TelephoneFixe("0505050503", ((ElementSimple) ad3));
        ElementCarnetAdresse tm3 = new TelephoneMobile("0606060603", ((ElementSimple) tf3));
        ElementCarnetAdresse em31 = new Email("Yasmine@Yasmine.com", ((ElementSimple) tm3));
        ElementCarnetAdresse em32 = new AdressePostale("rue de Yasmine1", ((ElementSimple) em31));
        ElementCarnetAdresse f3 = new Finale( ((ElementSimple) em32));
        

        ElementCarnetAdresse groupe  =new CarnetAdresse();
        
        ((CarnetAdresse)groupe).add(f1);
        ((CarnetAdresse)groupe).add(f2);
        ((CarnetAdresse)groupe).add(f3);
        
        
        System.out.println(((CarnetAdresse)groupe).afficherStr()   );
        
        
        
        RuntimeTypeAdapterFactory<ElementCarnetAdresse> elementCarnetAdresseFactory = RuntimeTypeAdapterFactory.of(ElementCarnetAdresse.class, "type")
                .registerSubtype(AdressePostale.class, "AdressePostale")
                .registerSubtype(Email.class, "Email")
                .registerSubtype(TelephoneFixe.class, "TelephoneFixe")
                .registerSubtype(TelephoneMobile.class, "TelephoneMobile")
                .registerSubtype(Finale.class,"Finale")
                .registerSubtype(Morale.class, "Morale")
                .registerSubtype(Enterprise.class,"Enterprise")
                .registerSubtype(CarnetAdresse.class, "CarnetAdresse")
                
                ;
        
        
       

        RuntimeTypeAdapterFactory<ElementSimple> elementSimpleFactory = RuntimeTypeAdapterFactory.of(ElementSimple.class, "type")
                .registerSubtype(AdressePostale.class, "AdressePostale")
                .registerSubtype(Email.class, "Email")
                .registerSubtype(TelephoneFixe.class, "TelephoneFixe")
                .registerSubtype(TelephoneMobile.class, "TelephoneMobile")
                .registerSubtype(Finale.class,"Finale")
                .registerSubtype(Morale.class, "Morale")
                .registerSubtype(Enterprise.class,"Enterprise")

                ;


        Gson gson1 = new GsonBuilder().registerTypeAdapterFactory(elementCarnetAdresseFactory).create();
        

        String gJson = gson1.toJson(groupe);
        System.out.println(gJson);
        
        final CarnetAdresse em2lecture1 = gson1.fromJson(gJson, CarnetAdresse.class);
        System.out.println( "\n\n\n"+em2lecture1.afficherStr());
        
   
    }

    public static void main(String[] args) {
        TestModel.test();

    }

}
