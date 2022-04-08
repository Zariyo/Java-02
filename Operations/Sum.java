package Operations;


import stack.Stack;

public class Sum implements Operations {
    @Override
    public boolean compute(String sign, Stack stack){
        if(sign.equals("+")){
            stack.push((stack.pop() + stack.pop()));
            return true;
        }
        return false;
    }
}
