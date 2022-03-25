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

    public int sum(){
        for (int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)=='+'){
                return 2+3;
            }
        }

    }
}
