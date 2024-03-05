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
    RoboCall08 robo = new RoboCall08();
    
    
    //Predicates
    Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;
    Predicate<Person> allDrivers = p -> p.getAge() >= 16;
    Predicate<Person> allDraftees = p -> p.getAge() >=18 && p.getAge() <=25 && p.getGender() == Gender.MALE;
    
    
    
        System.out.println("\n=====Calling all Pilots Variable=====");
        p1.stream().filter(allPilots).forEach(p -> robo.roboCall(p));
        
        System.out.println("\n=====Calling all Drivers Variable=====");
        p1.stream().filter(allDrivers).forEach(p -> robo.roboEmail(p));
        
        System.out.println("\n=====Calling all Draftees Variable=====");
        p1.stream().filter(allDraftees).forEach(p -> robo.roboMail(p));
        
        
    }
    
   
       
    
}
