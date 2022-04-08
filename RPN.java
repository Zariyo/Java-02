import java.util.Objects;
import stack.Stack;
import Operations.Operations;
import Operations.Sum;

public class RPN {
    private String sentence;
    private Operations[] operations;

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public RPN(String sent, Operations[] ops){
        this.sentence = sent;
        this.operations = ops;
    }

    public String show(){
        return this.sentence;
    }

    public double calculate(){
        Stack numbers = new Stack(sentence.length());
        String[] sentenceArr = sentence.split(" ", -1);
        for (int i=0;i<sentence.length();i++) {
            if (isNumeric(sentenceArr[i])) {
                numbers.push(Integer.parseInt(sentenceArr[i]));
            }
            else{
                Operations compute = new Sum();
                if(compute.compute(sentenceArr[i], numbers)){
                    break;
                }
            }
        }
        return numbers.pop();
    }
}