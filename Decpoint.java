package calculator;

import java.util.ArrayList;

public class Decpoint extends Token  {
    
    @Override
    public boolean parse(ArrayList<Key> cmd) {
        
        if(cmd.isEmpty())
            return false;
        
        if(cmd.get(0).ch.equals("-"))
            return true;
        
        else
            return false;
    }
    
}
