package Operations;


import stack.Stack;

public class Division implements Operations {
    @Override
    public boolean compute(String sign, Stack stack){
        if(sign.equals("/")){
            stack.push((1/stack.pop() * stack.pop()));
            return true;
        }
        return false;
    }
}