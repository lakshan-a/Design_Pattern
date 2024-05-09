package facedeDesignPatterns;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class ShapeMaker {

    private Shape circle;

    private Shape rectangle;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public  void drawRectangle(){
        rectangle.draw();
    }
}
