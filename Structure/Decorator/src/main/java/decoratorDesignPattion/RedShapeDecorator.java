package decoratorDesignPattion;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public  void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape){
        System.out.println("Border colour : Red");
    }
}
