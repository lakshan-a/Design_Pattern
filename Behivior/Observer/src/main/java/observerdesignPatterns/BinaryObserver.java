package observerdesignPatterns;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class BinaryObserver extends Observer{

    public  BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void updated() {
        System.out.println("BINARY : " + subject.getState());
    }
}
