package lesson10;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A01MapTest {
    
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
                            
        System.out.println("\n== CO Bonuses ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE)) //intermediate operation
            .filter(e -> e.getState().equals("CO")) //intermediate operation
            //map used to extract data from field & perform calculation
                .map(e -> e.getSalary() * Bonus.byRole(e.getRole())) //intermediate operation
            .forEach( s -> System.out.printf("Bonus paid: $%,6.2f %n", s)); //terminal operation
        
      
        System.out.println("\n== Eng Manager Bonus ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.MANAGER))
            .filter(e -> e.getDept().equals("Eng"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( 
                s -> System.out.printf("Bonus paid: $%,6.2f %n", s)
            );

    }
    
}