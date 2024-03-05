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
        RoboCall07 robo = new RoboCall07();
        
        System.out.println("\n===== Calling all Commercial Pilots Lambda =====");
        //Selection & output of elements are now handled in one statement
        p1.stream()
                .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
                .forEach(p -> robo.roboCall(p));
       
        
        System.out.println("\n===== Calling all Drivers Lambda =====");
        p1.stream()
                .filter(p -> p.getAge() >= 16)
                .forEach(p -> robo.roboMail(p));
        
        
        System.out.println("\n===== Calling all Draftees Lambda =====");
        p1.stream()
                .filter(p -> p.getAge() >=18 && p.getAge()<=25 && p.getGender() == Gender.MALE)
                .forEach(p -> robo.roboEmail(p));
    }
    
}
