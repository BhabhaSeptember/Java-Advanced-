/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class StreamOf {

    public static void main(String[] args) {
        System.out.println("===Tennis practice: ===");
        
        Stream.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
                .filter(s -> s.startsWith("T") || s.startsWith("W"))
                  .forEach(s -> System.out.println( s));
        
        
        
    }

}
