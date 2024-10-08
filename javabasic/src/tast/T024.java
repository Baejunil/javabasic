package tast;

public class T024 {
	public static void main(String[] args) {
        // 키보드 객체 생성
		T024_keyboard mechanicalKeyboard = new T024_MechanicalKeyboard();
		T024_keyboard membraneKeyboard = new MembraneKeyboard();

        // 필드로 조립된 컴퓨터 객체 사용
        T024_Computer computer = new T024_Computer(mechanicalKeyboard, membraneKeyboard);
        computer.useKeyboards();

        // 매개변수로 조립된 컴퓨터 객체 사용
        T024_Compute1 computerWithParams = new T024_Compute1();
        computerWithParams.useKeyboards(mechanicalKeyboard, membraneKeyboard);
    }
}
