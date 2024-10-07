package c07.poly2;

public class HankookTire extends Tire{

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		//누적 회전수 1 증가
		setAccumulatedRotation(getAccumulatedRotation()+1);
		if(getAccumulatedRotation()<getMaxRotation()) {
			//정상 회전(누적<최대)일 경우 실행
			System.out.println(getLocation()+" HankookTire수명: "+
				(getMaxRotation()-getAccumulatedRotation())+"회");
			return true;
		}else {
			//누적>=최대일 경우 실행
			System.out.println(getLocation()+
					"HankookTire 펑크 또는 수명이 다함");
			return false;
		}
	}

}