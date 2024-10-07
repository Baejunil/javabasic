package c07.poly;

public class Cat extends Animal {
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
	public static void main(String[]args) {
		Cat cat1=new Cat();
		Animal a1=new Cat();
		Animal a2=cat1;
		//자식은 부모의 특징과 기능을 상속받기 때문에 부모와
		//동일하게 취급될 수 있다는 것입니다
		//Cat 클래스로부터 Cat인스턴스를 생성하고 이것을 Animal 변수에
		//대입하면 자동 타입 변환이 일어납니다.
		
		//부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와
		//메소드만 접근이 가능합니다.
		Animal a3=new Cat();
		a3.method1();
		a3.method2();
		//a3.method3();//(x)
		//메소드가 자식 클래스에서 재정의되었다면 자식 클래스의 메소드가
		//대신 호출됩니다.
		a3.method2();
		
				
	}
}
