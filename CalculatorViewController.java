/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

/**
 * FXML Controller class
 *
 * @author tiffanyvaiz
 */
public class CalculatorViewController implements Initializable {

    @FXML
    Button but_0,but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9,but_POINT,but_00;
    
    @FXML
    Button but_ADD,but_SUB,but_MUL,but_DIV,but_DEL,but_CLEAR,but_MODE;
    
    @FXML
    Label lab_result;
    
    @FXML
    TextField lab_enter;
    
    Expression parser = new Expression();
    AdvancedExp advParser = new AdvancedExp();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /* Number */
        if (but_0 != null) {
            but_0.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "0");
                    parseByExpression();
                }
            });
        }
        if (but_1 != null) {
            but_1.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "1");
                    parseByExpression();
                }
            });
        }
        if (but_2 != null) {
            but_2.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "2");
                    parseByExpression();
                }
            });
        }
        if (but_3 != null) {
            but_3.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "3");
                    parseByExpression();
                }
            });
        }
        if (but_4 != null) {
            but_4.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "4");
                    parseByExpression();
                }
            });
        }
        if (but_5 != null) {
            but_5.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "5");
                    parseByExpression();
                }
            });
        }
        if (but_6 != null) {
            but_6.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "6");
                    parseByExpression();
                }
            });
        }
        if (but_7 != null) {
            but_7.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "7");
                    parseByExpression();
                }
            });
        }
        if (but_8 != null) {
            but_8.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "8");
                    parseByExpression();
                }
            });
        }
        if (but_9 != null) {
            but_9.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "9");
                    parseByExpression();
                }
            });
        }
        if (but_00 != null) {
            but_00.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "00");
                    parseByExpression();
                }
            });
        }
        
        /* Operator */
        if (but_ADD != null) {
            but_ADD.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "+");
                    parseByExpression();
                }
            });
        }
        if (but_DIV != null) {
            but_DIV.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "÷");
                    parseByExpression();
                }
            });
        }
        if (but_SUB != null) {
            but_SUB.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "-");
                    parseByExpression();
                }
            });
        }
        if (but_MUL != null) {
            but_MUL.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + "x");
                    parseByExpression();
                }
            });
        }
        if (but_POINT != null) {
            but_POINT.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    lab_enter.setText(pre + ".");
                    parseByExpression();
                }
            });
        }
        
        /* Tool */
        if (but_DEL != null) {
            but_DEL.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    String pre = lab_enter.getText(); 
                    pre = pre.substring(0,pre.length() - 1);
                    lab_enter.setText(pre);
                    parseByExpression();
                }
            });
        }
        if (but_CLEAR != null) {
            but_CLEAR.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    lab_enter.setText("");
                    
                    lab_result.setText(String.valueOf(0));
                }
            });
        }
        if (but_MODE != null) {
            but_MODE.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    if(but_MODE.getText().equals("Advanced"))
                    {
                        but_MODE.setText("Basic");
                    }
                    else if(but_MODE.getText().equals("Basic"))
                    {
                        but_MODE.setText("Advanced");
                    }
                    parseByExpression();
                    
                }
            });
        }
        
        
        
       
    }
    
    private ArrayList<Key> stringToKey(String input)
    {
        ArrayList<Key>  keyArray = new ArrayList();
        for(int i=0;i<input.length();i++)
        {
            Key newKey = new Key();
            newKey.ch = input.substring(i, i+1);
            keyArray.add(newKey);
            
        }
        
        return keyArray;
    }
    private void basicExpression()
    {
        parser.parse(stringToKey(lab_enter.getText()));
        lab_result.setText(String.valueOf(parser.value));
    }
    private void advExpression()
    {
        advParser.parse(stringToKey(lab_enter.getText()));
        lab_result.setText(String.valueOf(advParser.value));
    }
    private void parseByExpression()
    {
        if(but_MODE.getText().equals("Basic"))
        {
            basicExpression();
        }
        else if(but_MODE.getText().equals("Advanced"))
        {
            advExpression();
        }
        
    }
    
}
