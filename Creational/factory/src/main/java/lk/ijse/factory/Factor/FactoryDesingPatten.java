package lk.ijse.factory.Factor;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 5/9/2024
 */
public class FactoryDesingPatten {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getshape("Circle");
        shape.Circle();
    }
}
