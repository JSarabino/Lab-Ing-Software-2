package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String key) {
        Shape shape = shapes.get(key);

        if (shape == null) {
            shape = new Rectangle();
            shapes.put(key, shape);
        }

        return shape;
    }
}
