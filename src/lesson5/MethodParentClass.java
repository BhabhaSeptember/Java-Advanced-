package lesson5;

public class MethodParentClass {
    
    //Final methods cannot be overridden
    public final void printMessage() {
        System.out.println("This is a final method");
    }
}