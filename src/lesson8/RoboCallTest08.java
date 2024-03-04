/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author User
 */
public class RoboCallTest08 {
    
    public static void main(String[] args) {
        List<Person> p1 = Person.createShortList();
    RoboCall05 robo = new RoboCall05();
    
    
    //Predicates
    Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;
    
        System.out.println("\n=====Calling all Pilots Variable");
        
        p1.stream().filter(allPilots).forEach(p -> robo.roboCall(p));
    }
    
   
       
    
}
