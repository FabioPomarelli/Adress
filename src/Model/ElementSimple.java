/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ElementsDecorateur.Finale;
import com.google.gson.annotations.Expose;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pom
 */
public  class ElementSimple extends ElementCarnetAdresse {
    
    
     @Expose
    Set<ElementDecorateur> elementDecoratuer = new HashSet<>();
  
  /**
   * 
   * @param element 
   */
  public void add(ElementDecorateur element){

      this.elementDecoratuer.add(element);
      
  }
  
  /**
   * 
   * @param element 
   */
  public void retirer(ElementDecorateur element){
      this.elementDecoratuer.remove(element);
  }
  
  /**
   * 
   */
  public Set getGroupe(){
      return this.elementDecoratuer;
  }
  
  /**
   * 
   */
  
  /*
  @Override
  public void afficher(){
      for(Object obj:this.elementCarnetAdress){
            ((Finale)(obj)).afficher();
        }
  }
  
  @Override
  public String afficherStr(){
      String app="";
      for(Object obj:this.elementCarnetAdress){
            app+=((Finale)(obj)).afficherStr();
        }
      return app;
  }*/

    /**
     * 
     */
  
    
}
