interface Divider {
    int divide(int a, int b) throws ArithmeticException;
}

class MathOperation implements Divider {
    public int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

class InterfaceExample16 {
    public static void main(String[] args) {
        Divider divider = new MathOperation();
        try {
            System.out.println("Result: " + divider.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

