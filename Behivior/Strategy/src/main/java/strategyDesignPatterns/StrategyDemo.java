package strategyDesignPatterns;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/9/2024
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(20,10));
        context=new Context(new OperationSubcirber());
        System.out.println(context.executeStrategy(20,10));
    }
}
