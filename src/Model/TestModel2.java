/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ElementsDecorateur.AdressePostale;
import Model.ElementsDecorateur.Email;
import Model.ElementsDecorateur.IElementDecorateur;
import Model.ElementsGroupe.GroupeContact;
import Model.ElementsSimple.SimpleContact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.IOException;

/**
 *
 * @author pom
 */
public class TestModel2 {

    public static void main(String[] args) {
        GroupeContact m1 = TestModel2.CreaOggetto();

        try {
            String json = TestModel2.CreaJsonDaOggetto(m1);
            System.out.println(json);
            GroupeContact agenda = lettura(json);
            System.out.println(((SimpleContact)agenda.getGroupe().get(0)).getNom());
           
            
            System.out.println(agenda.getGroupe().get(0).getClass());
        } catch (Exception e) {
            System.out.println("Errore     33 " + e.getMessage());
        }

    }

    public static GroupeContact CreaOggetto() {

        SimpleContact m1 = new SimpleContact("Fabio", "POMARELLI");

        IElementDecorateur ad1 = new AdressePostale("rue de fabio");

        // System.out.println(((AdressePostale)ad1).toJson());
        IElementDecorateur ad2 = new Email("fabio.pomarelli@gmail.com");
        IElementDecorateur ad3 = new Email("fabio.pomarelli@gmail.com1");
        IElementDecorateur ad4 = new Email("fabio.pomarelli@gmail.com1");

        SimpleContact m2 = new SimpleContact("florent", "ooooo");

        IElementDecorateur ad12 = new AdressePostale("rue de florent");
        IElementDecorateur ad22 = new Email("florent.florent@gmail.com");
        IElementDecorateur ad32 = new Email("florent.florent@gmail.com1");
        IElementDecorateur ad42 = new Email("florent.florent@gmail.com1");

        m1.add(ad1);
        m1.add(ad2);
        m1.add(ad3);
        m1.add(ad4);

        GroupeContact agenda = new GroupeContact();
        agenda.add(m1);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        //10 contact
        
        agenda.add(m1);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        
        agenda.add(m1);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        agenda.add(m2);
        
        
        return agenda;

    }

    public static String CreaJsonDaOggetto(GroupeContact m1) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        //    objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(m1);
        //System.out.println(json);
        return json;

    }


    public static GroupeContact lettura(String json) throws IOException {

        SimpleModule module
                = new SimpleModule("Deserializer", new Version(3, 1, 8, null, null, null));
        module.addDeserializer(GroupeContact.class, new Deserializer(GroupeContact.class));

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);

        GroupeContact obj = mapper.readValue(json, GroupeContact.class);

        /*System.out.println(car.getMerd().size());
        System.out.println(car.getMerd().get(0).getClass());
        System.out.println(car.getMerd().get(1).getClass());*/
        return obj;

    }

}
