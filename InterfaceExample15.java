interface Container<T> {
    T get();
    void set(T value);
}

class Box<T> implements Container<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

class InterfaceExample15 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Hello");
        System.out.println("Box contains: " + box.get());
    }
}

