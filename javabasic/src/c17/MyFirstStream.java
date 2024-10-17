package c17;

import java.util.Arrays;
import java.util.stream.IntStream;

//스트림 Streams
//자바 8에서 추가한 스트림(Streams)은 람다를 활용할 수 있는 기술 중 하나입니다.
//자바 8 이전에는 배열 또는 컬렉션 인스턴스를 다루는 방법은 for 또는 foreach문을
//돌면서 요소 하나씩을 꺼내서 다루는 방법이었습니다.
//간단한 경우라면 상관없지만 로직이 복잡해질수록 코드의 양이 많아져 여러 로직이
//섞이게 되고, 메소드를 나눌 경우 루프를 여러 번 도는 경우가 발생합니다.
//배열 또는 컬렉션 인스턴스에 메소드 여러 개를 조합해서 원하는 결과를 필터링하고
//가공된 결과를 얻을 수 있습니다. 또한 람다를 이용해서 코드의 양을 줄이고
//간결하게 표현할 수 있습니다.
//즉, 배열과 컬렉션을 함수형으로 처리할 수 있습니다.
public class MyFirstStream {
	public static void main(String[] args) {
		//스트림 사용
		int[] ar= {1,2,3,4,5};
		//배열 ar로부터 스트림 생성
		IntStream stm1=Arrays.stream(ar);
		//중간 연산 진행
		//홀수인 경우만 스트림으로 리턴
		IntStream stm2=stm1.filter(n->n%2==1);
		int[] ar1=new int[5];
		int idx=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==1) {
				ar1[idx++]=ar[i];
			}
		}
		for(int i:ar1) {
			System.out.println(i);
		}
		//최종 연산 진행
		//최종 연산 생략하면 아무 결과도 얻지 못한다.
		int sum=stm2.sum();
		System.out.println(sum);
		
		//메소드 체이닝
		int sum1=Arrays.stream(ar).filter(n->n%2==1)
				.sum();
		System.out.println(sum1);
	}

}