package tast;

public class T024_MechanicalKeyboard implements T024_keyboard {
    @Override
    public void type() {
        System.out.println("기계식 키보드 타이핑...");
    }
}

class MembraneKeyboard implements T024_keyboard{
    @Override
    public void type() {
        System.out.println("멤브레인 키보드 타이핑...");
    }
}
