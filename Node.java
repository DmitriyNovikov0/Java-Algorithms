package lesson6;

public class Node {

    Person person;
    Node leftChild;
    Node rightChild;

//    void display() {
//        System.out.println(String.format("Name %s age %d", person.name, person.age));
//    }

    void display() {
        System.out.println(String.format("%d ", person.id));
    }

}
