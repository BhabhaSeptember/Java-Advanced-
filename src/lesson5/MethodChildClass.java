package lesson5;

public class MethodChildClass extends MethodParentClass {    
    // below results in compile time error because you cannot override Final methods
//    @Override
//    public void printMessage() {
//        System.out.println("Cannot override method");
//    }
    
    //Below is an alternative that will work
    public void pringMessage() {}
}