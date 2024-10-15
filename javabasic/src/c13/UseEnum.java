package c13;

public class UseEnum {
	
	public static void main(String[] args) {
		System.out.println(Scales.DO);
		System.out.println(Scales.RE);
		//case문에서는 표현의 간결함을 위해 DO와 같이
		//열겨형 값의 이름만 명시하기로 약속되어 있다.
		Scales scs=Scales.DO;
		switch(scs) {
		case DO:
			System.out.println("도~");
			break;
		case RE:
			System.out.println("레~");
			break;
		}
	}

}