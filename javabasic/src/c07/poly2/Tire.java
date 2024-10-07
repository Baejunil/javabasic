package c07.poly2;

//필드의 다형성
//객체는 부품인데 부품은 언제든지 교체할수 있게 객체 지향 프로그래밍에서는
//다형성을 지원합니다.
//프로그램은 수많은 객체들이 서로 연결되고 각자의 역활을 하게 되는데
//이 객체들은 다른 객체로 교체될 수 있어야 합니다.
//부모 클래스를 상속하는 자식 클래스는 부모가 가지고 있는 필드와 메소드를
//가지고 있으니 사용 방법이 동일할 것입니다.
//자식 클래스는 부모의 메소드를 재정의해서 메소드의 실행 내용을 변경함으로써
//다른 실행결과가 나오게 할 수도 있습니다.
public class Tire {
	//최대 회전수(타이어 수명)
	private int maxRotation;
	//누적 회전수
//	protected int accumulatedRotation;
	private int accumulatedRotation;
	//타이어의  위치
	private String location;
	
	public int getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}

	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		//누적 회전수 1 증가
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			//정상 회전(누적<최대)일 경우 실행
			System.out.println(location+" Tire수명: "+
				(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			//누적>=최대일 경우 실행
			System.out.println(location+"Tire 펑크 또는 수명이 다함");
			return false;
		}
		
	}
	
	

}