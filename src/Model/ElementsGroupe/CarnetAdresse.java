/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ElementsGroupe;

import Model.ElementGroupe;
import Model.ElementsDecorateur.Finale;

/**
 *
 * @author pom
 */
public class CarnetAdresse extends ElementGroupe {
@Override
  public void afficher(){
      for(Object obj:this.getGroupe()){
            ((Finale)(obj)).afficher();
        }
  }
  
  @Override
  public String afficherStr(){
      String app="";
      for(Object obj:this.getGroupe()){
            app+=((Finale)(obj)).afficherStr();
        }
      return app;
  }
    
}
