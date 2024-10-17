package c18;

import java.time.LocalTime;
import java.util.Random;

//locaiTime 클래스
//시각 정보를 나타내는 클랫
public class localTimeDemo1 {
	public static void main(String[] args) {
		//현재식
		LocalTime now=LocalTime.now();
		System.out.println("지금 시각:"+ now);
		
		//랜덤 숫자 뽑기:1~10까지의 숫자 중 하나만뽁기
		//밀리초를 기반으로 적당한 연산을 통해 랜덤만숫자처럼 연산 결과를 반환
		Random r=new Random();
		int poped=r.nextInt(10)+1;
		System.out.println(poped);
		//랜덤한 숫자를 뽑기 위한 최초의 숫자값을 Seed라 한다.
		Random r1=new Random(1235245);
		int poped1=r.nextInt(10)+1;
		System.out.println(poped1);
		
		//2시간 10분뒤 화상 미팅 에정
		LocalTime mt=now.plusHours(2);
		mt=mt.plusMinutes(10);
		//화상미팅 시각
		System.out.println("화상미팅시각:"+mt);
	}
}
