package leson2;

public class App {
    public static void main(String[] args) {
        MyArray arr = new MyArray(10000);

// ------------  2 упражнение
        for(int i = 1; i <= 10; i++){
//            arr.insertElement(i); //Для проверки поиска
              arr.insertElement((int)(Math.random() * 10)); //приведем тип double к int, можно былы использовать и класс обертку
        }
        System.out.println("В массиве " + arr.getSize() + " элеменетов");
        arr.printArr();
        System.out.println();
        //можно было запрашивать номер элемента для удаления у пользователя... немного тораплюсь
        System.out.println("Удаляем 7 элемент");
        arr.deleteElement(7);
        System.out.println("В массиве " + arr.getSize() + " элеменетов");
        arr.printArr();
        System.out.println();
        System.out.println("поиск в массиве числа 9");
        int fnd = 9;
        int res = arr.findeElement(fnd);
        if(res == 0){
            System.out.println("В массиве нет числа " + fnd);
        }
        else {
            System.out.println("В массиве " + fnd + " находится на " + res + " позиции");
        }
//----------------- 3 упражнение
        for(int i = 1; i <= 1000; i++){
//            arr.insertElement(i); //Для проверки поиска
            arr.insertElement((int)(Math.random() * 100)); //приведем тип double к int, можно былы использовать и класс обертку
        }
//------------------- 4 упражнение (признаюсь честно код класса скопипастил у Вас, немного не успиваю а д/з сдать нужно)\
        long start = System.nanoTime();
        Sort.sortBubble(arr.getArray());
        long finish = System.nanoTime();
        System.out.println("На сортировку пузырьковым методом ушло " + (finish - start) + " нано секунд");
        start = System.nanoTime();
        Sort.sortInsert(arr.getArray());
        finish = System.nanoTime();
        System.out.println("На сортировку методом вставки " + (finish - start) + " нано секунд");
        start = System.nanoTime();
        Sort.sortSelect(arr.getArray());
        finish = System.nanoTime();
        System.out.println("На сортировку методом выбора ушло " + (finish - start) + " нано секунд");
    }
}
