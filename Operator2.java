package calculator;

import java.util.ArrayList;

public class Operator2 extends Token {
    
    final int MUL = 3;
    final int DIV = 4;
    final int NEG = 0;
    String validSym;
    int opcode;
    
    public Operator2(String ops) {
        validSym = ops;
    }
    
    public double eval(double o1, double o2) {
        double r = 0;
        switch (opcode) {
        
        case MUL:
            r = o1 * o2;
            break;
        case DIV:
            return o1 / o2;
        }
        return r;
    }

    @Override
    public boolean parse(ArrayList<Key> cmd) {
        // TODO Auto-generated method stub
        String ops;
        if (cmd.size() > 0)
            ops = cmd.get(0).ch;
        else
            return false;
        if (validSym.indexOf(ops)<0) // check if the incoming token is an expected operator
            return false;
        
        else if (ops.equals("x")) {
            opcode = MUL;
            cmd.remove(0); // remove the parsed key from the cmd for the terminal token
        }
        
        else if (ops.equals("÷")) {
            opcode = DIV;
            cmd.remove(0); // remove the parsed key from the cmd for the terminal token
        }
        
        else {
            return false;
        }
        
        return true;
    }
}