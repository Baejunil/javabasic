package tast;

public class T024_Computer {
    private T024_keyboard keyboard1;
    private T024_keyboard keyboard2;

    public T024_Computer(T024_keyboard keyboard1, T024_keyboard keyboard2) {
        this.keyboard1 = keyboard1;
        this.keyboard2 = keyboard2;
    }

    public void useKeyboards() {
        keyboard1.type();
        keyboard2.type();
    }
}

