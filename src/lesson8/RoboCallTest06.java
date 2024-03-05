/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

import java.util.List;

/**
 *
 * @author User
 */
public class RoboCallTest06 {
    
    public static void main(String[] args) {
        
        List<Person> p1 = Person.createShortList();
        
        System.out.println("\n===== Print List =====");
        //Collection interface extends Iterable interface which defines the forEach method used below
        p1.forEach(p -> System.out.println(p)); //Outputs overriden toString()
    }
}
