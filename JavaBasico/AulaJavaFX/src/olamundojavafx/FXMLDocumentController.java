/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 *
 * @author matheus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblSoma;
    private Label lblResultado;
    private Button btnSoma;
    private TextField txtN1;
    private TextField txtN2;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int soma = n1 + n2;
        lblResultado.setText(Integer.toString(soma));
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
