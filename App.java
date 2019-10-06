package leson3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
// 1 - задание
        System.out.println("работа стека");
        Stack s = new Stack(5);
        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        s.push('e');
        s.printStack();
        //последний зашел первый вышел
        while (!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }

        System.out.println("");
        System.out.println("работа очереди");
        Queue q = new Queue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.printQueue();
        //первый зашел первый вышел
        while (!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }

        System.out.println("");
        System.out.println("работа приоритетной очереди");
        PriorityQueue pq = new PriorityQueue(5);
        pq.insert(11);
        pq.insert(15);
        pq.insert(1);
        pq.insert(7);
        pq.insert(50);
        pq.printQueue();
        while (!pq.isEmpty()){
            System.out.print(pq.remove() + " ");
        }
//2 задание
        System.out.println("");
        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String tmpStr = in.nextLine();
        char [] myCharArray = tmpStr.toCharArray ();
//тут интересный вопрос, стоит ли создовать переменную или же можно вызвать 2 раза myCharArray.length, тут либо мы выиграем в производительности но потратим больше памяти
//либо затратим меньше памяти но проиграем в производительности, что правильнее выбрать? в данном примере потери ничтьожны а бывают случаии когда теряются мегабайты
        int length = myCharArray.length;
        Stack s1 = new Stack(myCharArray.length);
        for(int i = 0; i < length; i++){
            s1.push(myCharArray[i]);
        }
        //выводим перевернутую введеную строку
        while (!s1.isEmpty()){
            System.out.print(s1.pop());
        }
// 3 задание
//честно скопипастил код в интернете, код не до конца рабочий, буду разбираться завтра, сейчас не успеваю
        System.out.println("");
        Deque d = new Deque(5);
        d.push_front(5);
        d.push_back(3);
        d.push_front(14);
        d.push_back(8);
        d.push_front(7);
        d.printDeque();


    }
}
