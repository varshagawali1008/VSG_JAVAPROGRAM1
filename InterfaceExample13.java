interface OuterInterface {
    void outerMethod();

    interface InnerInterface {
        void innerMethod();
    }
}

class Example implements OuterInterface, OuterInterface.InnerInterface {
    public void outerMethod() {
        System.out.println("Outer Method");
    }

    public void innerMethod() {
        System.out.println("Inner Method");
    }
}

class InterfaceExample13 {
    public static void main(String[] args) {
        Example example = new Example();
        example.outerMethod();
        example.innerMethod();
    }
}

