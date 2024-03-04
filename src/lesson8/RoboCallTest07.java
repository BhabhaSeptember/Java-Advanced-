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
public class RoboCallTest07 {
    public static void main(String[] args) {
        
        List<Person> p1 = Person.createShortList();
        RoboCall05 robo = new RoboCall05();
        
        System.out.println("\n===== Calling all Commercial Pilots Lambda =====");
        
        p1.stream()
                .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
                .forEach(p -> robo.roboCall(p));
    }
    
}
