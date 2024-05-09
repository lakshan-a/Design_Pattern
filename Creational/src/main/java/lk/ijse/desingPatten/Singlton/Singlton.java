package lk.ijse.desingPatten.Singlton;

import java.io.Serializable;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class Singlton implements Serializable {

    private Singlton(){}

    private static Singlton singlton = new Singlton();

    public static Singlton getInstance(){
        return singlton;
    }




}
