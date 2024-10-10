package c10;

public class SmatrPhone {
String company;
String os;
	public SmatrPhone(String company, String os) {
		super();
		this.company =company;
		this.os =os;
	}
	@Override
	public String toString() {
		return "SmatrPhone [company=" + company + ", os=" + os + "]";
	}
	public static void main(String[] args) {
		SmatrPhone sp=new SmatrPhone("샘송", "안드로이드15");
		System.out.println(sp);
	}
}
