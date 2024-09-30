package c06;

public class MyCar {
	//필드
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	MyCar(){
	}
	
	MyCar(String model){		
		this.model=model;
	}
	MyCar(String model,String color){
		this.model=model;
		this.color=color;
	}
	MyCar(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
