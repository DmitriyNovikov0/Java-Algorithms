package lesson3;

public class Stack {
//    private char[] stack;
    private int[] stack;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
//        this.stack = new char[size];
        this.stack = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

/*
    public void push(char element) {
        stack[++top] = element;
    }
*/

    public void push(int element) {
        stack[++top] = element;
    }

/*
    public char pop() {
        return stack[top--];
    }
*/

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public void printStack(){
        for(int i = 0; i < size; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println("");
    }
}
