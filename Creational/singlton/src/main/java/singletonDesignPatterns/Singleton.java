package singletonDesignPatterns;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 5/9/2024
 */

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }


}
