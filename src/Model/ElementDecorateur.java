/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import org.json.simple.JSONObject;

/**
 *
 * @author pom
 */
public abstract class ElementDecorateur extends ElementSimple {

    @Expose
    private ElementSimple element;




    public void setElement(ElementSimple element) {
        this.element = element;

    }

    public ElementSimple getElement() {
        return this.element;

    }
    
    public String toJson() {
          Gson gson = new Gson();
        String strJson = gson.toJson(this);
        return strJson;
    }

}
