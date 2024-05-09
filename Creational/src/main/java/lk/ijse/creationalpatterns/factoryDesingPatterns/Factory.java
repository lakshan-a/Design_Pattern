package lk.ijse.creationalpatterns.factoryDesingPatterns;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */


public abstract class Factory {

    public abstract String getA();
    public abstract String getB();
    public abstract String getC();

    @Override
    public String toString(){
        return "RAM= "+this.getA()+", HDD="+this.getB()+", CPU="+this.getC();
    }

}
