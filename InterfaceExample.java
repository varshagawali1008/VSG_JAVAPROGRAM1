interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

