class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Inheritance11 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}

