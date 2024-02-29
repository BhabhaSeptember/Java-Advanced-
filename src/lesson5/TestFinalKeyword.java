/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author User
 */
public class TestFinalKeyword {
    public static void main(String[] args) {
        System.out.println("Method Parent Class: ");
        MethodParentClass x = new MethodParentClass();
        x.printMessage();
        
        System.out.println("\nMethod Child Class: ");
        MethodChildClass y = new MethodChildClass();
        y.printMessage();
        
    }
    
}
