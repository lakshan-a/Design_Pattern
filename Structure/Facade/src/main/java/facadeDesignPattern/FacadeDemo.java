package facadeDesignPattern;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 5/9/2024
 */
public class FacadeDemo {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

        /*Complexity Code*/

         /* facadeDesignPattern.Shape shape = new facadeDesignPattern.Circle();

          shape.draw();
          facadeDesignPattern.Shape shape1 = new facadeDesignPattern.Circle();
          shape1.draw();*/
    }
}
