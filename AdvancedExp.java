/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;

/**
 *
 * @author tiffanyvaiz
 */
public class AdvancedExp extends Token  {
    @Override
    public boolean parse(ArrayList<Key> cmd) {
        Minus m = new Minus();
        Term t = new Term();
        
        Operator1 op = new Operator1("+-");
        
        m.parse(cmd);
        
        if (!t.parse(cmd)) // parse as a digit
            return false;
        else {
            value = t.value * m.value; // convert the parsed digit as a number value
        }
        
        while(op.parse(cmd) && t.parse(cmd))
        {
            value = op.eval(value,t.value);
        }
                    
        
        return true;
        
    }
    
}