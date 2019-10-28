package lesson7;

public class App {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('K');
/*
        A   B   C   D   E   F   G   H   I   K
    A   0   1   1   1   0   0   0   0   0   0
    B   1   0   0   0   1   0   0   0   0   0
    C   1   0   0   0   0   0   1   0   0   0
    D   1   0   0   0   0   1   0   0   0   0
    E   0   1   0   0   0   0   1   0   0   0
    F   0   0   0   1   0   0   0   1   0   0
    G   0   0   1   0   1   0   0   0   1   0
    H   0   0   0   0   0   1   0   0   1   0
    I   0   0   0   0   0   0   1   1   0   1
    K   0   0   0   0   0   0   0   0   1   0
 */
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(2,6);
        graph.addEdge(3,5);
        graph.addEdge(4,6);
        graph.addEdge(7,8);
        graph.addEdge(6,8);
        graph.addEdge(8,9);

        graph.bfs();
        System.out.println();
        System.out.println("Кратчайший путь от узла K к узлу A:");
        graph.print_way(9);
    }
}
