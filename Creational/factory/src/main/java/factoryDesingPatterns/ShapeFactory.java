package factoryDesingPatterns;

import java.awt.*;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return  new Rectangle();
        }
        return null;
    }
}
