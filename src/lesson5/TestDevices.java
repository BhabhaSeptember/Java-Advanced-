package lesson5;

public class TestDevices {

    public static void main(String[] args) {

        //Abstract class cannot be instantiated. Below line returns an error
        // ElectronicDevice dev = new ElectronicDevice(); //Compile-time error
        ElectronicDevice dev = new Television();
        dev.turnOn(); // all ElectronicDevices can be turned on
        System.out.println();
        ElectronicDevice dev2 = new Radio();
        dev2.turnOn();
        
//        Radio radio = new Radio();
//        radio.setState(PowerState.ON);

    }
}
