package calculator;

import java.util.ArrayList;

public class Expression extends Token  {
    @Override
    public boolean parse(ArrayList<Key> cmd) {
        Minus m = new Minus();
        Number n = new Number();
        Operator op = new Operator("+-x÷");
        
        m.parse(cmd);
        
        if (!n.parse(cmd)) // parse as a digit
            return false;
        else {
            value = n.value * m.value; // convert the parsed digit as a number value
        }
        
        while(op.parse(cmd) && n.parse(cmd))
        {
            value = op.eval(value,n.value);
        }
                    
        
        return true;
        
    }
    
}
