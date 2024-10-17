package c17.lastop;

import java.util.stream.IntStream;

//스트림의 최종 연산
//sum() - 전체를 더합니다
//count() - 전체의 갯수 셉니다
//average() - 전체의 평균을 구합니다
//min() -가장작은 쇼소를 반환
//max()- 가장 큰 요소를 반환
//average(),min(),max() 리턴 타입이 Optional
public class OpSteam {
	public static void main(String[] args) {
		int sum=IntStream.of(1,3,4,7,9).sum();
		//합
		System.out.println(sum);
		//max 값
	IntStream.of(1,3,4,7,9).max()
		.ifPresent(mx->System.out.println("max=" +mx));;
		
		//forEach - 매개변수에 스트림 요소들을 순차적으로 대입 시켜 주면서
		//반복 실행해주는 메소드
		IntStream.of(1,3,4,7,9).forEach(n->System.out.println(n));
	}
}
