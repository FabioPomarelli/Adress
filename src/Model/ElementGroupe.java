/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pom
 */
public abstract class ElementGroupe extends ElementCarnetAdresse{
    
    Set<ElementCarnetAdresse> elementCarnetAdress = new HashSet<>();
  
  /**
   * 
   * @param element 
   */
  public void add(ElementCarnetAdresse element){
      
  }
  
  /**
   * 
   * @param element 
   */
  public void retirer(ElementCarnetAdresse element){
      
  }
  
  /**
   * 
   */
  public void getGroupe(){
      
  }
  
  /**
   * 
   */
  @Override
  public void afficher(){
      
  }
}
