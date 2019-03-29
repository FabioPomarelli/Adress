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
import Model.ElementsSimple.Extraterrestre;
import Model.ElementsSimple.Extraterrestres.Marsien;
import Model.ElementsSimple.Personne;
import Model.ElementsSimple.Personnes.Enterprise;
import Model.ElementsSimple.Personnes.Morale;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.json.simple.JSONObject;

/**
 *
 * @author pom
 */
public class TestModel1 {

    private static void test()  {

        ElementCarnetAdresse m1 = new Morale("Fabio", "ooooo");
        ElementCarnetAdresse m2 = new Morale("Florent", "ttttt");
        ElementCarnetAdresse m3 = new Morale("Yasmine", "eeeeee");
        ElementCarnetAdresse m4 = new Morale("FINIT", "eeeeee");
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
        ElementCarnetAdresse f3 = new Finale(((ElementSimple) em32));

        ElementCarnetAdresse ad4 = new AdressePostale("rue de fabio", ((ElementSimple) m4));
        ElementCarnetAdresse tf4 = new TelephoneFixe("0505050501", ((ElementSimple) m4));
        ElementCarnetAdresse tm4 = new TelephoneMobile("0606060601", ((ElementSimple) m4));
        ElementCarnetAdresse em41 = new Email("fabio@fabio.com", ((ElementSimple) m4));
        ElementCarnetAdresse em42 = new AdressePostale("rue de fabio1", ((ElementSimple) m4));

        ElementCarnetAdresse f4 = new Finale(((ElementSimple) m4));

        System.out.println(((ElementSimple) m4).getGroupe().size());

        ((ElementSimple) m4).afficher();

        JSONObject json = new JSONObject();
        json.put("set", ((ElementSimple) m4).getGroupe());
        Set deco = ((ElementSimple) m4).getGroupe();

        for (Object ind : deco) {
            System.out.println(((ElementDecorateur) ind).toJson().toString());
        }
        // json.put("set", ((ElementSimple) m4).getGroupe());

        String jsonString = json.toString();

        System.out.println(jsonString);

        ObjectMapper mapper = new ObjectMapper(); // create once, reuse
        Car a = new Car();
        a.name="Fiat";
// value = mapper.readValue(new File("data.json"), MyValue.class);
// or:
//value = mapper.readValue(new URL("http://some.com/api/entry.json"), MyValue.class);
// or:
//value = mapper.readValue("{\"name\":\"Bob\", \"age\":13}", MyValue.class);
//And if we want to write JSON, we do the reverse:
        
    //mapper.writeValue(new File("result.json"), a);
// or:
    //    byte[] jsonBytes = mapper.writeValueAsBytes(a);
// or:
        String jsonString1 = mapper.writeValueAsString(a);
        
        
        System.out.println(jsonString1);
    }

    public static void main(String[] args) {
        TestModel1.test();

    }

}
