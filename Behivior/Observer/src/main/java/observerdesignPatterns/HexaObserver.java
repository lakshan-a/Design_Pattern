package observerdesignPatterns;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }


    @Override
    public void updated() {
        System.out.println("HEXA :" + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
