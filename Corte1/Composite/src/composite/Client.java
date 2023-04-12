package composite;

public class Client {

    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");

        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite composite2 = new Composite();
        composite2.add(leaf3);

        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);

        composite3.display();
    }
    
}
