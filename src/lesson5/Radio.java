/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author User
 */

public class Radio extends ElectronicDevice{
    
    @Override
    public void turnOn() {
        System.out.println("Radio On");
        changeStation(2000);
        initializeScreen();
    }
    
    @Override
     public void turnOff() {
        System.out.println("Radio Off");
    }
    
    public void changeStation(int station) {
        System.out.println("Changing to station: " + station);
    }
    
    public void initializeScreen() {
        System.out.println("Retrieving signal...");
    }
    
    
}
