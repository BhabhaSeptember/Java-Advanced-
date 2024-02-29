package lesson5;

//Abstract classes are extended by child classes and may be used as a reference type
public abstract class ElectronicDevice {
    
   //Abstract methods cannot have method bodies...
    //...Overridden by subclasses
    public abstract void turnOn();
    
    public abstract void turnOff();
    
}
