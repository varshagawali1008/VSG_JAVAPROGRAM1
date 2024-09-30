interface Device {
    void powerOn();
    void powerOff();
}

abstract class Computer implements Device {
    public abstract void boot();
}

class Laptop extends Computer {
    public void powerOn() {
        System.out.println("Laptop powered on.");
    }

    public void powerOff() {
        System.out.println("Laptop powered off.");
    }

    public void boot() {
        System.out.println("Laptop booting up.");
    }
}

class InterfaceExample18 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.boot();
        laptop.powerOff();

