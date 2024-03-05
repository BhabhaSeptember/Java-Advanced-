/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author User
 */
public class RoboCall07 {
    
    public void roboCall(Person p) {
        System.out.println("Calling " + p.getGivenName() + ", " + p.getSurName() + " age " + p.getAge() + " at: " + p.getPhone());
    }

    public void roboEmail(Person p) {
        System.out.println("EMailing " + p.getGivenName() + ", " + p.getSurName() + " age " + p.getAge() + " at: " + p.getEmail());
    }

    public void roboMail(Person p) {
        System.out.println("Mailing " + p.getGivenName() + ", " + p.getSurName() + " age " + p.getAge() + " at: " + p.getAddress() + ", " + p.getCity() + ", " + p.getState() + " " + p.getCode());
    }
}
