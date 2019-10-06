package leson3;

public class PriorityQueue {
    private int[] queue;
    private int items;
    private int maxSize;

    public PriorityQueue(int size) {
        this.maxSize = size;
        this.queue = new int[maxSize];
        this.items = 0;
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

    public void insert(int item) {
        int i;
        if (items == 0) {
            queue[items++] = item;
        } else {
            for (i = items - 1; i >= 0; i--) {
                if (item > queue[i]) {
                    queue[i + 1] = queue[i];
                } else {
                    break;
                }
            }
            queue[i + 1] = item;
            items++;
        }
    }

    public int remove() {
        return queue[--items];
    }

    public int peek() {
        return queue[items - 1];
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("очередь пуста");
            return;
        }
        for (int i = 0; i < items; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("");
    }


}
