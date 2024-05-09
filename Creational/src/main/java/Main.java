import lk.ijse.desingPatten.Singlton.Singlton;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class Main  {

    public static void main(String[] args) {
        Singlton singlton = Singlton.getInstance();
        System.out.println(singlton);
        }
}
