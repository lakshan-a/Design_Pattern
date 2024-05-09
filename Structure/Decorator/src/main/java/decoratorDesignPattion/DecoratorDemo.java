package decoratorDesignPattion;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new  RedShapeDecorator(new  Rectangle());

        System.out.println("Circle :normal border");
        redCircle.draw();
        System.out.println("\n Circle :red border");
        redCircle.draw();
        System.out.println("\n Rectangle :normal border");
        redRectangle.draw();
    }
}
