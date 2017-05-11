/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author tiffanyvaiz
 */
public class Main extends Application {
    
    public static void main(String args[])
    {
        launch();
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        try {
            // 載入FXML內容並轉換為Parent
            Parent fxmlRoot = FXMLLoader.load(
            getClass().getResource("CalculatorView.fxml"));

            Scene scene = new Scene(fxmlRoot);

            primaryStage.setTitle("410321148_Calculator");

            primaryStage.setScene(scene);

            // Show Stage
            primaryStage.show();
        } 
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
    }
    
}
