/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ElementsDecorateur.Finale;
import com.google.gson.annotations.Expose;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author pom
 */
public abstract class ElementGroupe extends ElementCarnetAdresse{
    @Expose
    Set<ElementCarnetAdresse> elementCarnetAdress = new HashSet<>();
  
  /**
   * 
   * @param element 
   */
  public void add(ElementCarnetAdresse element){
      this.elementCarnetAdress.add(element);
      
  }
  
  /**
   * 
   * @param element 
   */
  public void retirer(ElementCarnetAdresse element){
      this.elementCarnetAdress.remove(element);
  }
  
  /**
   * 
   */
  public Set getGroupe(){
      return this.elementCarnetAdress;
  }
  
  /**
   * 
   */
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
  }
}
