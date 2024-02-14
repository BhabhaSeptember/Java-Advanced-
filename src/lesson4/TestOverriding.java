package lesson4;

public class TestOverriding {
    public static void main(String[] args) {
Employee emp1 =  new Employee(1, "John Wayne", "555_321_678", 59.000);
        System.out.println("Employee 1: " + emp1.getDetails());
        System.out.println("Employee 1: " + emp1.getAllDetails());

        Manager mgr = new Manager (2, "Bill Johnson", "123_456_789", 109.000, "Finance");
        System.out.println("Manager 1: " + mgr.getAllDetails());

    }
}
