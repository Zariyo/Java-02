import Operations.Operations;

public class RPNBuilder {
    private String sentence;
    private Operations[] operations;
    private int top;

    public RPNBuilder(){
        this.operations = new Operations[1];
        this.top = 0;
    }

    public void setExpression(String expression) {
        this.sentence = expression;
    }

    public void resetOperations(int a) {
        this.operations = new Operations[a];
    }

    public void addOperation(Operations operation) {
        int len = operations.length;

        if(len == this.top){
            Operations[] newArray = new Operations[len + 1];
            System.arraycopy(this.operations, 0, newArray, 0, len);
            this.operations = newArray;
        }
        this.operations[this.top] = operation;
        this.top ++;
    }
    public RPN getRPN() {
        return new RPN(sentence, operations);
    }
}
