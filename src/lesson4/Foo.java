package lesson4;

public class Foo {

    protected int result = 20; //accessible to subclasses incl those outside of this package
    int num = 25;


 //Good Practice
 private int result2 = 20;
 protected int getResult() {
     return this.result2;
 }
}
