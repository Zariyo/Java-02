package stack;

public class Stack {
    private int[] elements;
    private int stackTop;

    public Stack(int size) {
        elements = new int[size];
        stackTop = -1;
    }

    public boolean isEmpty(){
        return stackTop<0;
    }

    public void push(int element) {
        if (stackTop == elements.length-1) {
            int[] newElements = new int[elements.length + 1];
            for (int i=0; i<elements.length; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[++stackTop] = element;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return elements[stackTop--];
        }
    public int peek(){
        if (this.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return elements[stackTop];
    }
    }

