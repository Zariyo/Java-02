import java.util.Objects;

public class RPN {

    public interface Operation {
        private Stack compute(Stack numbers) {
            return null;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }


    public class Sum implements Operation {
        private Stack compute(Stack numbers){
            return numbers;
        }
    }

    private class Substraction implements Operation {

    }

    private class Division implements Operation {

    }

    private class Multiplication implements Operation {

    }

    private String sentence;

    public RPN(String sent){
        sentence = sent;
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
                Operation compute = new Sum();
                compute.compute(numbers)
            }
        }
        return -1;
//            else if(sentence.charAt(i)=='-'){
//                return 2-3;
//            }
//            else {
//                numbers.push(sentence.charAt(i)-39);
//            }
//
//        }
//        return 0;
    }
}