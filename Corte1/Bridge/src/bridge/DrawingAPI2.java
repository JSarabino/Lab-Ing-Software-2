package bridge;

public class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2.circle at (%.2f, %.2f) radius %.2f\n", x, y, radius);
    }
}
