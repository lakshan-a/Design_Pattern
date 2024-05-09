package factoryDesingPatterns;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */


public class FactoryDesignPatterns {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
    }


}
