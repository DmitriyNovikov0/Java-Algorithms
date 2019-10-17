package lesson5;


import java.util.ArrayList;

public class Backpack {
    //в <> указыуваем тип объектов из каких будет состоять ArrayList
    private ArrayList<Item> bestItems = new ArrayList();
    private int MAX_W;
    private double bestPrice;

    public Backpack(int max_w){
        MAX_W = max_w;
    }

    //вычисляет общий вес набора предметов
    private double CalcWeigth(ArrayList<Item> items)
    {
        double sumW = 0;
        for(Item i : items){
            sumW += i.weigth;
        }
        return sumW;
    }

    //вычисляет общую стоимость набора предметов
    private double CalcPrice(ArrayList<Item> items)
    {
        double sumPrice = 0;
        for(Item i : items){
            sumPrice += i.price;
        }

        return sumPrice;
    }

    //проверка, является ли данный набор лучшим решением задачи
    private void CheckSet(ArrayList<Item> items)
    {
        if (bestItems == null)
        {
            if (CalcWeigth(items) <= MAX_W)
            {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
        else
        {
            if(CalcWeigth(items) <= MAX_W && CalcPrice(items) > bestPrice)
            {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
    }

    //создание всех наборов перестановок значений
    public void MakeAllSets(ArrayList<Item> items)
    {
        if (items.size() > 0)
            CheckSet(items);

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Item> newSet = new ArrayList(items);
            newSet.remove(i);
            MakeAllSets(newSet);
        }
    }

    //возвращает решение задачи (набор предметов)
    public ArrayList<Item> GetBestSet()
    {
        return bestItems;
    }
}
