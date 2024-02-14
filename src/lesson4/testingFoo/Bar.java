package lesson4.testingFoo;


import lesson4.Foo;

public class Bar extends Foo {

//    private int sum = 10; //only accessible in this class of the package
//
//    public void reportSum() {
//        sum += result; //'result' from Foo class. 'Protected' access extends to subclass of different package
////        sum += num //compiler error! 'sum' from Foo class had 'default' modifier which does not extend to subclasses
//}


//Good Practice
private int sum = 10;
public void reportSum() {
    sum += getResult();
}
}
