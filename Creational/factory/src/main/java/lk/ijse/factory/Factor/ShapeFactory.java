package lk.ijse.factory.Factor;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class ShapeFactory {

    public Shape getshape(String shapeType){
          if (shapeType.equalsIgnoreCase("CIRCLE")){
               return new Circle();
          }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
              return new Rectangle();
          }
        return null;
    }
}
