package lesson7;

public class Vertex {

    public char label;
    public boolean wasVisit;
    public int parent = -1;
    public boolean isAvailable = true;

    public Vertex(char label) {
        this.label = label;
        this.wasVisit = false;
    }
}
