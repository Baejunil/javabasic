package c06;

import java.util.Scanner; 
public class ThatCar {
	ThisCar thisCar;
	String model;
	Scanner scanner;
	Scanner sc=new Scanner(System.in);
	
	ThatCar(){
		Scanner sc=new Scanner(System.in);
	}
	ThatCar(String model){
		this();
		this.model=model;
	}
}
