package leson4.double_link_list;

import leson4.list.LinkedList;

public interface DoubleLinkedList extends LinkedList {

    void insertLast(String name, int age);

    boolean isFind(String name);

}
