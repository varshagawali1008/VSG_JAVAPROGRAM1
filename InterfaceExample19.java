interface EventListener {
    void onEvent();
}

class Button {
    private EventListener listener;

    public void setOnClickListener(EventListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onEvent();
        }
    }
}

class InterfaceExample19 {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(() -> System.out.println("Button clicked!"));
        button.click();
    }
}

