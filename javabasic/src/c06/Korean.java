package c06;

//필드 초기화
public class Korean {
	String nation="대한민국";
	String hairColor="black";
	String name;
	int age;
	
	public Korean(String name,int age) {
		hairColor="black";
		this.name=name;
		this.age=age;
	
	}
	
	
	public static void main(String[] args) {
		Korean k1=new Korean("박자바",25);
		Korean k2=new Korean("김자바",27);
		System.out.println(k1.nation);
		System.out.println(k2.nation);
		System.out.println(k1.hairColor);
		System.out.println(k2.hairColor);
		System.out.println(k1.name);
		System.out.println(k2.name);
		
	}
}
