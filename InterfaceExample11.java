   
interface Calculator {
    int add(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class InterfaceExample11 {
    public static void main(String[] args) {
        Calculator calc = new SimpleCalculator();
        System.out.println("Sum: " + calc.add(5, 3));
    }
}
