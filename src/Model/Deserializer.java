package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//And here is how the CarDeserializer class looks:
import Model.ElementsDecorateur.AdressePostale;
import Model.ElementsDecorateur.Email;
import Model.ElementsDecorateur.IElementDecorateur;
import Model.ElementsDecorateur.TelephoneFixe;
import Model.ElementsDecorateur.TelephoneMobile;
import Model.ElementsGroupe.GroupeContact;
import Model.ElementsSimple.SimpleContact;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.Arrays;

public class Deserializer extends StdDeserializer<GroupeContact> {

    public Deserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public GroupeContact deserialize(JsonParser parser, DeserializationContext deserializer) throws IOException {
        GroupeContact agenda = new GroupeContact();

        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();

           // System.out.println("jsonToken " + jsonToken.toString());

            if (JsonToken.START_ARRAY.equals(jsonToken)) {
                leggiArrayDeSimpleContact(parser, agenda);

            }

        }
       System.out.println("TRIK "+ agenda.getGroupe().size()) ;
        return agenda;
    }

    public void leggiArrayDeSimpleContact(JsonParser parser,GroupeContact agenda) throws IOException {
        System.out.println("LETTURA ARRAY");
        int cont = 0;
        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();

            if (JsonToken.START_OBJECT.equals(jsonToken)) {
                cont += 1;
                leggiOggettoSimpleContact(parser, agenda);

            }
            if (JsonToken.END_ARRAY.equals(jsonToken)) {
                System.out.println("END ARRAY");
                return;

            }

        }
        System.out.println("READ NOMBRE ELEMENTS " + cont);
    }

    public void leggiOggettoSimpleContact(JsonParser parser, GroupeContact agenda) throws IOException {
        SimpleContact obj = new SimpleContact();
        System.out.println("\tLETTURA OGGETTO SimpleContact");
        int cont = 1;
        String parametres[] = null;
        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();

            String elem = parser.getValueAsString();
            if (JsonToken.START_OBJECT.equals(jsonToken)) {  //lecture decoratuer
                leggiOggettoDecorateur(parser, obj);
            }

            if (JsonToken.END_OBJECT.equals(jsonToken)) {
                System.out.println("\tEND OGGETTO SimpleContact");

                obj.setParametres(parametres);
                agenda.add(obj);
                return;
            }
            if (elem != null && elem != "OCLASS" && !elem.equals("groupe")) {
                //System.out.println(elem);
                //if () {
                if (cont == 1) {
                    parametres = push(parametres, parser.getValueAsString());
                    System.out.println("\t\t\t\t\t" + parser.getValueAsString());
                    cont = 2;
                } else {
                    //  System.out.println("\t\t\t\t\tnon " + parser.getValueAsString());
                    cont = 1;
                }
                // }

            }
        }

        JsonToken jsonToken = parser.nextToken();
        //System.out.println("jsonToken Met " + jsonToken.toString());

    }

    public void leggiOggettoDecorateur(JsonParser parser, SimpleContact obj) throws IOException {
        System.out.println("\t\tLETTURA DECORATEUR");
        IElementDecorateur objdec = null;
        String parametres[] = null;
        String elemObj = null;
        int cont = 1;
        boolean stop = false;
        while (!parser.isClosed() && stop != true) {
            JsonToken jsonToken = parser.nextToken();

            String elem = parser.getValueAsString();
            if (elem != null) {

                if (elem.equals(AdressePostale.SCLASS) || elem.equals(Email.SCLASS) || elem.equals(TelephoneFixe.SCLASS) || elem.equals(TelephoneMobile.SCLASS)) {
                    elemObj = elem;
                    parser.nextToken();
                }

                if (elem != "OCLASS") {
                    if (cont == 2) {
                        parametres = push(parametres, parser.getValueAsString());
                        System.out.println("\t\t\t\t\t" + parser.getValueAsString());
                        cont = 1;
                    } else {
                        //  System.out.println("\t\t\t\t\tnon " + parser.getValueAsString());
                        cont = 2;
                    }
                }

            }

            if (JsonToken.END_OBJECT.equals(jsonToken)) {

                System.out.println("\t\tEND OGGETTO DECORATUER");
//parser.nextToken();
                stop = true;
            }

        }

        if (elemObj != null) {
            switch (elemObj) {
                case (AdressePostale.SCLASS):
                    objdec = new AdressePostale(parametres);
                    System.out.println("\t\tJ'ai trouve un adresse");
                    //parser.nextToken();
                    break;
                case (Email.SCLASS):
                    objdec = new Email(parametres);
                    System.out.println("\t\tJ'ai trouve un mail");
                    //parser.nextToken();
                    break;
                case (TelephoneFixe.SCLASS):
                    objdec = new TelephoneFixe(parametres);
                    System.out.println("\t\tJ'ai trouve un adresse");
                    //parser.nextToken();
                    break;
                case (TelephoneMobile.SCLASS):
                    objdec = new TelephoneMobile(parametres);
                    System.out.println("\t\tJ'ai trouve un adresse");
                    //parser.nextToken();
                    break;
                default:
            }
        }

        obj.add(objdec);

    }

    private static String[] push(String array[], String elem) {
        if (array != null) {
            String[] tmp = Arrays.copyOf(array, array.length + 1);
            tmp[tmp.length - 1] = elem;
            array = tmp;
        } else {
            array = new String[1];
            array[0] = elem;
        }
        return array;
    }

}
