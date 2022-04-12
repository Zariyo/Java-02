package Operations;


import stack.Stack;

public class PowerTwo implements Operations {
    @Override
    public boolean compute(String sign, Stack stack){
        if(sign.equals("^2")){
            stack.push((stack.peek() * stack.pop()));
            return true;
        }
        return false;
    }
}