package lesson4;

public class Foo2 extends Foo {
    private int sum = 10;
    public void reportSum() {

        sum += num; //default modified 'num' from Foo class is accessible to subclasses in same package
    }
}
