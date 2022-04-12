package stack;

public class Stack {
    private double[] elements;
    private int stackTop;

    public Stack(int size) {
        elements = new double[size];
        stackTop = -1;
    }

    public boolean isEmpty(){
        return stackTop<0;
    }

    public void push(double element) {
        if (stackTop == elements.length-1) {
            double[] newElements = new double[elements.length + 1];
            for (int i=0; i<elements.length; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[++stackTop] = element;
    }

    public double pop() {
        if (this.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return elements[stackTop--];
        }
    public double peek(){
        if (this.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return elements[stackTop];
    }
    }

