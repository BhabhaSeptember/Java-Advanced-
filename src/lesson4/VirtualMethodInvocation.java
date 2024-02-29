package lesson4;

public class VirtualMethodInvocation {
    public static void main(String[] args) {
        Employee e = new Manager(111, "Palesa Ntsoane", "111-111-1111", 100_000, "Security");

        System.out.println(e.getAllDetails());
    }
}
