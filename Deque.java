package lesson3;


public class Deque {
    private int maxSize;
    private int size;
    private int[] queue;
    public int head;
    public int end;

    public Deque(int maxSize)
    {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        head = 0;
        end = 0;
        size = 0;
    }

    public void push_front(int e)
    {
        if (size == maxSize)
        {
            System.out.println("Массив заполнен.");
            return;
        }
        else if (size==0)
        {
            end = head;
            queue[head] = e;
            size++;
        }
        else
        {
            head++;
            if (head>=maxSize)
                head = 0;
            queue[head] = e;
            size++;
        }
    }

    public void push_back(int e)
    {
        if (size == maxSize)
        {
            System.out.println("Массив заполнен.");
            return;
        }
        else if (size==0)
        {
            head = end;
            queue[end] = e;
            size++;
        }
        else
        {
            end--;
            if (end<0)
                end = maxSize-1;
            queue[end] = e;
            size++;
        }
    }

    public int size()
    {
        return size;
    }

    public int back()
    {
        if (size != 0)
            return queue[end];
        else
            return -1;
    }

    public int front()
    {
        if (size != 0)
            return queue[head];
        else
            return -1;
    }

    public int pop_back()
    {
        if (size != 0)
        {
            int tmp = queue[end];
            end++;
            if (end >= maxSize)
                end = 0;
            size--;
            return tmp;
        }
        else
            return -1;
    }

    public int pop_front()
    {
        if (size != 0)
        {
            int tmp = queue[head];
            head--;
            if (head<0)
                head = maxSize - 1;
            size--;
            return tmp;
        }
        else
            return -1;
    }

    public void printDeque(){
        if(size == 0){
            System.out.println("очередь пуста");
            return;
        }
        for (int i = 0; i < size; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("");
    }

}
