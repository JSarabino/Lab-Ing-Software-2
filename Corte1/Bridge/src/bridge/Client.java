package bridge;

public class Client {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(1, 2, 3, new DrawingAPI1());
        shapes[1] = new Circle(5, 7, 11, new DrawingAPI2());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
    
}