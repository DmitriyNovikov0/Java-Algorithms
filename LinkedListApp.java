package leson4.list;

public class LinkedListApp {

    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        ArrayList arrayList;
        LinkedListImpl customList = new LinkedListImpl();
        customList.insertFirst("Ivan", 23);
        customList.insertFirst("Kate", 17);
        customList.insertFirst("John", 33);

        customList.display();
        System.out.println();

        if (!customList.isEmpty()) {
//            customList.delete();
            customList.delete("Kate");
        }

        customList.display();

//        System.out.println(customList.find("Ivan"));

    }
}
