package leson3;

public class Queue {

    private int front;
    private int rear;

    private int[] queue;
    private int items;
    private int maxSize;

    public Queue(int size) {
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
        this.maxSize = size;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public int size() {
        return items;
    }

    public void insert(int i) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = i;
        items++;
    }

    public int remove() {
        int template = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        items--;
        return template;
    }

    public int peek() {
        return queue[front];
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("очередь пуста");
            return;
        }
        for (int i = 0; i < rear + 1; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("");
    }

}
