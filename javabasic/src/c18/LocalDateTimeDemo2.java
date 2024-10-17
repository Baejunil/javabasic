package c18;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {
	public static void main(String[] args) {
		//두 LocalDateTime 인스턴스간의 시각과 날짜의 차
		//빠른 항공편을 선택하는 코드
		LocalDateTime today=LocalDateTime.of(2024, 10,17,15,18);
		LocalDateTime flight1=LocalDateTime.of(2024, 12,14,11,15);
		LocalDateTime flight2=LocalDateTime.of(2024, 12,13,17,30);
		
		//isBefore() 매개변수의 시각이 이전인지 불린 값으로 리턴
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2)) {
			myFlight=flight1;
		}else {
			myFlight=flight2;
		}
		
		//빠른 항공편의 비행 탑승까지 남은 날짜 계산
		Period day=Period.between(
				today.toLocalDate(), myFlight.toLocalDate());
		//toLocalDate() - 날짜에 대한 정보를 LocalDate 인스턴스에 담아서 반환
		//빠른 항공편의 비행 탑승까지 남은 시간 계산
		//toLocalTime() - 시각에 대한 정보를 LocalTime 인스턴에서 담아서 반환
		Duration time=Duration.between(
				today.toLocalTime(), myFlight.toLocalTime());
		
		//비행 탑승까지 남은 날짜와 시간 출력
		System.out.println(day);
		System.out.println(time);
	}
}