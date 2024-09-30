package c06;

public class MyCarapp {
	
	public static void main(String[] args) {
		MyCar mc1=new MyCar();
		System.out.println("mc1.company"+mc1.company);
		
		MyCar mc2=new MyCar("자가용");
		System.out.println("mc2.company"+mc2.company);
		System.out.println("mc2.model"+mc2.model);
		
		MyCar mc3=new MyCar("자가용","빨강");
		System.out.println("mc3.company"+mc3.company);
		System.out.println("mc3.model:"+mc3.model);
		System.out.println("mc3.color:"+mc3.color);
	}
}
