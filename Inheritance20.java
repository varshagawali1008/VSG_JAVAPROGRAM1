final class FinalClass {
    void display() {
        System.out.println("This is a final class");
    }
}

// class SubClass extends FinalClass {} // This will cause a compilation error

public class Inheritance20 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
