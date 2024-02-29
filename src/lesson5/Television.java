package lesson5;

public  class Television extends ElectronicDevice {

    //Overrding parent method "turnOn" with specialized implementation
    @Override
    public void turnOn() {
        System.out.println("TV On");
        changeChannel(1);
        initializeScreen();
    }
    
    @Override
    public void turnOff() {
        System.out.println("TV Off");
    }
    
    public void changeChannel(int channel) {
        System.out.println("Changing to channel: " + channel);
    }
    
    public void initializeScreen() {
        System.out.println("Initializing screen...");
    }
}