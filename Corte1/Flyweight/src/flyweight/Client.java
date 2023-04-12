package flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class Client {
    private static final String[] colors = {"Red", "Green", "Blue"};
    private static final int CANVAS_SIZE = 500;
    
    public static void main(String[] args) {
        Random random = new Random();
        JFrame frame = new JFrame("Flyweight Pattern Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(CANVAS_SIZE, CANVAS_SIZE);
        frame.setVisible(true);

        Graphics g = frame.getGraphics();

        for (int i = 0; i < 1000; i++) {
            Shape shape = ShapeFactory.getShape(getRandomColor());
            shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), Color.black);
        }
    }
    
    
    private static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random() * CANVAS_SIZE);
    }

    private static int getRandomY() {
        return (int)(Math.random() * CANVAS_SIZE);
    }

    private static int getRandomWidth() {
        return (int)(Math.random() * 100);
    }

    private static int getRandomHeight() {
        return (int)(Math.random() * 100);
    }
    
}
