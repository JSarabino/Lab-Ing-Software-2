package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
