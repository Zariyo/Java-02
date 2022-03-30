public class RPN {

    private final String sentence;

    public RPN(String sent){
        sentence = sent;
    }

    public String show(){
        return this.sentence;
    }

    public char showElems(){
        for (int i=0;i<sentence.length();i++){
            return sentence.charAt(i);
        }
        return sentence.charAt(0);
    }

    public String[] sum(){
        Stack numbers = new Stack(sentence.length());
        String[] sentenceArr = sentence.split(" ", -1);
        return sentenceArr;
//        for (int i=0;i<sentence.length();i++){
//            if(sentence.charAt(i)=='+'){
//                return (numbers.pop() + numbers.pop()); // Stack[i] + Stack [i-1]
//            }
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
