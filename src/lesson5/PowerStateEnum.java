/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lesson5;

/**
 *
 * @author User
 */
public enum PowerStateEnum {
    //References to the only powerstates that can exist
    OFF("The power is off"),
    ON("The power usage is high"),
    SUSPEND("The power usage is low");

    private String description;

    private PowerStateEnum(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }

    public void setState(PowerStateEnum state) {
        switch (state) {
            case OFF:
                System.out.println("Off...");
            case ON:
                System.out.println("On...");
            case SUSPEND:
                System.out.println("Suspended...");
        }
    }

}
