package c06;

public class SingletonAPP {
	//private으로 설정한 생성자는 
	//외부에서 호출이 발가하다
	//Singleton singleton=new singelton
	
	
	public static void main(String[] args) {
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
