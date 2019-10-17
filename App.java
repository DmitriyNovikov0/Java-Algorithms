package lesson5;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
//задание 1
        System.out.println(pow(25, -2));
//задание 2
        ArrayList<Item> items = new ArrayList();
        items.add(new Item("Книга", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));

        Backpack bp = new Backpack(5);
        bp.MakeAllSets(items);
        ArrayList<Item> solve = bp.GetBestSet();
        if(solve == null){
            System.out.println("Нет решения!");
        }
        else{
            System.out.print("Лучше взять в рюкзак: ");
            for(Item i : solve){
                System.out.print(i.name + ", ");
            }
        }

    }

    public static double pow(double basis, int exp){
        if(exp == 0){
            return 1;
        }
        if(exp > 0) {
            return basis * pow(basis, exp - 1);
        }
        else{
            return basis / pow(basis, exp + 1);
        }
    }
}
