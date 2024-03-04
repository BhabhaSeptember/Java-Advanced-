package lesson7;

public class AutoBox {
    public static void main(String[] args){
        Integer intObject = new Integer(1);
        int intPrimitive = 2;
        
        Integer tempInteger;
        int tempPrimitive;
        
//        tempInteger = new Integer(intPrimitive);
//        System.out.println("Temp integer = " + tempInteger) ;
//        
//        tempPrimitive = (int) intObject.intValue();
//        System.out.println("Temp primitive = " + tempPrimitive);
// 
//
//
//      Below is same as above without using formal casting syntax
        tempInteger = intPrimitive; // Auto unbox (converts Integer to int)
        tempPrimitive = intObject;  // Autobox (converts int to Integer)    
        System.out.println("Integer: " + tempInteger + " int: " + tempPrimitive);
    }
}
