class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
