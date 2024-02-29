package lesson5;

import java.util.Date;

public class FinalVariableExample {

    private final int field;
    
    //Final keyword prevents it from being garbage collected
//    private final int forgottenField;
    private final Date date = new Date();
    //Below is constant field consisting of underscore and uppercase letters
    public static final int JAVA_CONSTANT = 10; //Always avail, never changing field

    public FinalVariableExample() {
        field = 100;
    }

    public void changeValues(final int param) {
//        field = 10; //Error: Cannot assign value to final var field
//        param = 1; // compile time error



        date.setTime(0); // allowed
//       date = new Date(); // compile time error




        final int localVar;
        localVar = 42;
        
// Error: LocalVar has already been assigned above therefore compile time error
//        localVar = 43; 
    }
}
