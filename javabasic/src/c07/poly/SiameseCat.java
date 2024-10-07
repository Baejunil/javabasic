package c07.poly;

public class SiameseCat extends Cat{
	
	public static void main(String[] args) {
		Animal a1=new SiameseCat();
		//바로 위의 부모가 아니더라도 상속 계층에서
		//상위 타입이라면 자동 타입 변환이 일어날 수 있습니다.
		Object o1=new SiameseCat();
	}

}