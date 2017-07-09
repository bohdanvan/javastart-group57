/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        int x = 10;
        System.out.println(x < 20); // T
        System.out.println(x <= 5); // F
        System.out.println(x > 30); // F
        System.out.println(x >= 10); // T
        System.out.println(x == 4); // F
        System.out.println(x != 4); // T
    }
}
