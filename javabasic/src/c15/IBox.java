package c15;

//3. 클래스 이름을 통한 인스턴스 메소드 참조
public class IBox {
	private int n;
	public IBox(int i) {
		n=i;
	}
	public int larger(IBox b) {
		if(n>b.n)
			return n;
		else
			return b.n;
	}
	public static void main(String[] args) {
		
	}
}
