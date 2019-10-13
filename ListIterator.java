package leson4.iterator;

import leson4.list.Link;
import leson4.list.LinkedListImpl;

public class ListIterator {

    private Link current;

    private Link prev;
    private LinkedListImpl list;

    public ListIterator(LinkedListImpl list) {
        this.list = list;
        reset();
    }

    private void reset() {
        current = list.getFirst();
        prev = null;
    }

    public void nextLink() {
        prev = current;
        current = current.next;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Link link = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(link);
            current = link;
        } else {
            link.next = current.next;
            current.next = link;
            nextLink();
        }
    }

    public void insertBefore(String name, int age) {
        Link link = new Link(name, age);
        if (prev == null) {
            link.next = list.getFirst();
            list.setFirst(link);
            reset();
        } else {
            link.next = prev.next;
            prev.next = current = link;
        }
    }

    /**
     * NOOP
     */
    public String deleteCurrent() {
        // TODO: 10.10.2019 to do
        if (list.isEmpty()) {
            return null;
        }
        else{
            String sTmp = current.name;
            list.delete(sTmp);
            return sTmp;
        }
    }
}
