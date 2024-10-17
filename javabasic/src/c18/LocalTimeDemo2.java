package c18;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {
	public static void main(String[] args) {
		//PC방의 PC 이용 시작 시각
		LocalTime start =LocalTime.of(14, 24,35);
		System.out.println("PC 이용 시작 시각 :"+start);
		
		//PC방의 PC  이용 종료 시각
		LocalTime end=LocalTime.of(17, 31,19);
		System.out.println("PC 이용 종료 시각 :"+end);
		
		//시각 차 계산에서도 Duration클래스가 사용된다.
		Duration between=Duration.between(start, end);
		System.out.println("총 PC 이용 시간: "+between);
	}

}