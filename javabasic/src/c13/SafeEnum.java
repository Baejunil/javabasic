package c13;

public class SafeEnum {
	public void who(Persons man) {
		switch(man) {
		case MAN:
			System.out.println("남성 손님입니다.");
			break;
		case WOMAN:
			System.out.println("여성 손닙입니다.");
			break;
		}
	}
	public static void main(String[] args) {
		SafeEnum se=new SafeEnum();
		//정상적인 메소드 호출
		se.who(Persons.MAN);
		//비정상적 메소드 호출
		//컴파일 과정에서 자료형 불일치로 인한 오류 발생
//		se.who(Animals.DOG);
//		se.who(3);
	}

}