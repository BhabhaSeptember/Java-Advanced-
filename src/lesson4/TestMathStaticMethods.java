package lesson4;

public class TestMathStaticMethods {
    public static void main(String[] args) {
        System.out.println("Random = " + Math.random() * 15);
        System.out.println("Round = " + Math.round(Math.random() * 20));
        System.out.println("Absolute = " + Math.abs(-20));
        System.out.println("Square root = " + Math.sqrt(500));
    }
}
