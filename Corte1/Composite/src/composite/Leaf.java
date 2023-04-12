package composite;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }
}
