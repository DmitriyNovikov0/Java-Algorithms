package leson2;

public class MyArray {
    private int size;
    private int[] myArray;

    public MyArray(int arrSize){
        myArray = new int[arrSize];
        size = 0; //массив сейчас пустой поэтому size = 0, size показывает скуолько элементов заполнино в массиве
    }

    private static void change(int a, int b, int[] mass){
        int temp = mass[a];
        mass[a] = mass[b];
        mass[b] = temp;
    }

    public void printArr(){
        for(int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    //добавляем эллемент в массив
    public void insertElement(int Element){
        myArray[size] = Element;
        size++;
    }

    //удалить эллемент из массива
    public void deleteElement(int nmbElement){
        if (nmbElement > size) return; //проверка если удаляемый эллемент больше чем элементов в массиве просто выходим
        for(int i = nmbElement - 1; i < size; i++){ //nmbElement - 1  потому что нумерация элементов в массиве начинается с 0
            myArray[i] = myArray[i + 1];
        }
        size--;
    }

    //поиск эллемента в массиве
    public int findeElement(int inVal){
        //если не найдем вернем 0, а так вернем номер элемента
        for(int i = 0; i < size - 1; i++){
            if(myArray[i] == inVal) return ++i; //нумерация в массиве начинается с 0
        }
        return 0;
    }

    public int getSize() {
        return size;
    }

    public int[] getArray() {
        return myArray;
    }

}
