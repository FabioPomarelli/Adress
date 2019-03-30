/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author pom
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("ViewElementGroupe.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        */
        
        
        
       // FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ViewElementGroupe.fxml"));
        
         
        System.out.println("/view/ViewElementGroupe.fxml"); 
       System.out.println(getClass().getResource("/view/ViewElementGroupe.fxml"));
        
        System.exit(0);
        
       // Parent root = loader.load();

        //ricevo il View Controller
       /* String start_value = "";
        ModelEvalJava myModelEval = new ModelEvalJava();

        Controller myController = new Controller();
        myController.addModel(myModelEval);
        View ViewCtrl = (View) loader.getController();
        ViewCtrl.addController(myController);

        myModelEval.addObserver(ViewCtrl);

        EvalResolve eval = EvalNoeud.getInstance();
        myModelEval.setEvalResolve(eval);
        myModelEval.setTypeEval("NOEUD");

        myController.initModel(start_value);*/

        //Scene scene = new Scene(root);

      //  Image image = new Image("/icons/Calculator.png");

        //stage.getIcons().add(image);
//        stage.setTitle("Calculatrice");
//        stage.setScene(scene);
//        stage.show();
//        stage.setResizable(false);
//        stage.setScene(scene);
//        stage.show();
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       launch(args);
         
    }
     
    
}
