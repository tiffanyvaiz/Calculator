package calculator;


import java.util.ArrayList;


public class Minus extends Token  {
    @Override
    public boolean parse(ArrayList<Key> cmd) {
        value = 1;
        
        if(cmd.isEmpty())
            return false;
        
        if(cmd.get(0).ch.equals("-"))
        {
            value = -1;
            return true;
        }
          
        
        else
            return false;
    }
    
}
