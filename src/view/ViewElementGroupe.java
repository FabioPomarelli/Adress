/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Viewelementgroupe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author pom
 */
public class ViewElementGroupe implements Initializable {
    
    @FXML
    private Label label;
    
   /* @FXML
    private ListView ListViewContacts ;*/
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
       
       /* ObservableList<String> items =FXCollections.observableArrayList ("Single", "Double", "Suite", "Family App");
ListViewContacts.setItems(items);*/
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    
    
}
