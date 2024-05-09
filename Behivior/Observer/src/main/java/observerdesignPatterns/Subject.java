package observerdesignPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state=state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObserver(){
        for (Observer observer:observers){
            observer.updated();
        }
    }

}
