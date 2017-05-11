package calculator;

import java.util.ArrayList;

public class Term extends Token  {
    @Override
    public boolean parse(ArrayList<Key> cmd) {
        
        Number n = new Number();
        Operator2 op = new Operator2("x÷");
        
        
        
        if (!n.parse(cmd)) // parse as a digit
            return false;
        else {
            value = n.value; // convert the parsed digit as a number value
        }
        
        while(op.parse(cmd) && n.parse(cmd))
        {
            value = op.eval(value,n.value);
        }
                    
        
        return true;
        
    }
    
}
