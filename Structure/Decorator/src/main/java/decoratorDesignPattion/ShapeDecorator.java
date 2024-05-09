package decoratorDesignPattion;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */


public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;


    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }

    @Override
    public void draw(){
        decoratorShape.draw();
    }

}
