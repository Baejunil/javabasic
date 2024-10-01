package c06;

//자기 자신의 생성자 호출:this()
//생성자에서 다른 생성자를 호출할 때에는 this()코드를 사용합니다
//this()는 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫  줄에서만 호용
public class ThisCar {
	String model;
	String color;
	int maxSpeed;
	
	ThisCar(String model){
		//생성자 내용이 비슷하므로 앞에 1개의 생성자에서
		//this()를 사용해서 마지막 생성를 호출하도록 수정하면
		//중복 코드를 최소화할 수 있다.
		this(model, "은색", 250);
		/*this.model=model;
		this.color="은색";
		this.maxSpeed=250;
		*/  
		 
		
	}
	ThisCar(String model,String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
	}

	public static void main(String[] args) {
		ThisCar thisCar1=new ThisCar("그랜져");
		ThisCar thisCar2=new ThisCar("그랜져","흰색",280);
	}

}
