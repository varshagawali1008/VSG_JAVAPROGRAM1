
class OuterClass {
    interface InnerInterface {
        void print();
    }
}

class Example implements OuterClass.InnerInterface {
    public void print() {
        System.out.println("Inner Interface Method");
    }
}

class InterfaceExample12 {
    public static void main(String[] args) {
        OuterClass.InnerInterface obj = new Example();
        obj.print();
    }
}
