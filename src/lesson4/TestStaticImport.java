package lesson4;
import static java.lang.Math.*;

public class TestStaticImport {
    public static void main(String[] args) {
        System.out.println("Random = " + random() * 15);
        System.out.println("Round = " + round(random() * 20));
        System.out.println("Absolute = " + abs(-20));
        System.out.println("Square root = " + sqrt(500));
    }
}
