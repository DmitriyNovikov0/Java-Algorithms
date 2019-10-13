package leson4.iterator;

import leson4.list.LinkedListImpl;

public class IteratorApp {

    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        ListIterator iterator = new ListIterator(list);
        iterator.insertAfter("Anton", 33);
        iterator.insertAfter("Garik", 21);
        iterator.insertBefore("Petr", 7);
        iterator.insertBefore("Anna", 12);
        list.display();

        System.out.println(String.format("удален %s", iterator.deleteCurrent()));
        list.display();
        iterator.nextLink();
        System.out.println(String.format("удален %s", iterator.deleteCurrent()));
        list.display();


    }

    // Anton Anna Petr Garik

}
