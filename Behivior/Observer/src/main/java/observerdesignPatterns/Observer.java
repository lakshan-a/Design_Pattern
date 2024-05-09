package observerdesignPatterns;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void updated();
}
