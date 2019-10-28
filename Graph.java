package lesson7;

import lesson3.Queue;
import lesson3.Stack;

public class Graph {

    private final int VERTS = 10;
    private Vertex[] vertexList;
    private int[][] matrix;
    private int size;

    Stack stack;
    Queue queue;

    public Graph() {
        stack = new Stack(VERTS);
        queue = new Queue(VERTS);

        vertexList = new Vertex[VERTS];
        matrix = new int[VERTS][VERTS];
        size = 0;
    }

    public void addVertex(char label) {
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        matrix[start][end] = 1;
        matrix[end][start] = 1;
    }

    public void display(int vertex) {
        System.out.println(vertexList[vertex].label);
    }

    private int getUnvisitVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if (matrix[ver][i] == 1 && !vertexList[i].wasVisit) {
                return i;
            }
        }
        return -1;
    }

    //depth-first search
    public void dfs() {
        vertexList[0].wasVisit = true;
        display(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].wasVisit = true;
                display(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisit = false;
        }
    }

    //breadth-first search
    public void bfs() {
        vertexList[0].wasVisit = true;
        display(0);
        queue.insert(0);
        int w;
        while(!queue.isEmpty()){
            int v = queue.remove();
            while((w = getUnvisitVertex(v)) != -1){
                vertexList[w].wasVisit = true;
                vertexList[w].parent = v;
                display(w);
                queue.insert(w);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisit = false;
        }
    }


    private void printWay(int vertex){
        int v = vertexList[vertex].parent;
        if(v == -1){
            System.out.println();
            return;
        }
        System.out.println(vertexList[v].label);
        printWay(v);
    }

    public void print_way(int vertex) {
        System.out.println(vertexList[vertex].label);
        //рекурсивный обход с конца в начало
        printWay(vertex);

    }

}
