package lesson6;

import java.util.Random;

public class App {
    static int MAX_LEVEL = 6;
    private static Tree[] tree;
    private static final Random random = new Random();


    private static int getRnd(){
        return random.nextInt(200) - 100;
    }

    private static Tree getFillTree(int maxLevel){
        Tree tree = new Tree();
        while(tree.leftLevel < 7 && tree.rightLevel < 7){
            tree.insert(new Person("", getRnd(), 0));
        }
        return tree;
    }


    public static void main(String[] args) {
        tree = new Tree[20];
        int a = 0;
        for(int i = 0; i < 20; i++){
            tree[i] = getFillTree(MAX_LEVEL);
            if(Math.abs(tree[i].leftLevel - tree[i].rightLevel) > 1){
                //дерево не сбалансированное т.к. уровни различаются более чем на 1
                a++;
            }
        }

        System.out.println(String.format("Несбалансированных деревьев %d из 20, процент созданных деревьев являются несбалансированными %d", a, (a*100/20)));

    }




}
