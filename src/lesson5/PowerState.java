/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author User
 */
//A typesafe created using a variation of a java class
//Provides compile-time range check
public enum PowerState {
    //Below: the only powerstate objects that can exist
    OFF,
    ON,
    SUSPEND;

    public void setState(PowerState state) {
        switch (state) {
            case OFF:
                System.out.println("Off");
            case ON:
                System.out.println("On");
            case SUSPEND:
                System.out.println("Suspended");
            default:
                System.out.println("No state specified");
        }
    }
}
