package c18;

import java.time.Duration;
import java.time.Instant;

//시각과 날짜의 처리
//시각과 날짜 관련 코드의 작성
public class InstantDemo {
	public static void main(String[] args) {
		//시간이 얼마나 걸렸지? : Instant 클래스
		//시간 : 어떤 시각에서 어떤 시각까지의 사이
		//시각 : 시간의 어느 한 지점
		//현재 시각 정보를 담음
		Instant start = Instant.now();
		System.out.println(start);
		//반환 값은 1970-01-01 00:00:00을 기준으로 지나온 시간을
		//초 단위로 계산한 결과
		System.out.println("시작: "+start.getEpochSecond());
		System.out.println("Time files like an arrow");
		//현재 시각 정보를 담음
		Instant end = Instant.now();
		System.out.println("끝: "+end.getEpochSecond());
		//두 시각의 차 계산 메소드
		Duration between=Duration.between(start,end);
		System.out.println("밀리 초 단위 차: "+between.toMillis());
		
	}
}