package c13;

//클래스 내에 열거형 정의 가능
public class Customer {
	enum Grade{
		BRONZE,SILVER,GOLD
	}
	
	private String name;
	private Grade grade;
	
	public Customer(String name,String grade) {
		this.name=name;
		if(grade.equals("bronze")) {
			this.grade=Grade.BRONZE;
		}
	}

}