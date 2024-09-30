package c05;

public class C05_01_01 {
	public static void main(String[] args) {
		//학생 30명의 성적을 저장하고, 평균값을 구한다
		int score1=83;
		int score2=90; 
		int score3=87;
		int sum=score1+score2+score3;
		//하드코딩(hard coding)
		//반복되는 코드가 너무 많고 조건문이나 반복문으로 간결해 질수 있는 코드를
		//그래도 코드양으로 해결하는 방식
		
		//배열이란?
		//배열은 같은 타입의 데이터를 연속된 공간에 나열하고.
		//각 데이터에 인텍스(index)를 부여해놓은 자료구조입니다..
		int[] scoreArr = {83,90,87};
		//인텍스는 순서대로 0부터 1씩 증가하는 정수로 부여 된다.
		System.out.println(scoreArr[0]);
		//배열의 인덱스는 각 항목의 데이터를 읽거나 저장하는데 사용되며
		//배열 이름 옆에 대괄호[]에 기입된니다.
		//인덱스 0부터 시작합니다.
		
		//성적의 평균값 구하기
		int sum1=0;
		for(int i=0;i<3;i++) {
			System.out.println(scoreArr[i]);
		}
		int avg=sum/3;
		
		//배열의 특징
		//1.배열은 같은 타입의 데이터만 저장할 수 있습니다.
		//2.한 번 생성된 배열의 길이를 늘리거나 줄일 수 없습니다.
		
		//배열선언
		//형식 1
		//타입[] 변수이름;
		//형식 2
		//타입 변수이름[];
		
		//형식1로 선언
		int[] intArray;
		double[] doubleArray;
		String[] strArry;
		
		//형식 2로 선언
		int intArray1[];
		double doubleArray1[];
		String strArry1[];
		
		//배열 생성
		//값 목록으로 배열 생성
		//타입[] 변수{값0,값1,값2,값3,값4......};
		//배열에 저장되어 있는 값을 요소(element)
		String[] names = {"이클립","김자바","김코딩"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		names[2]="김개발";
		System.out.println(names[2]);
		
		int[] scores = {83,90,87};
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[1]:"+scores[1]);
		System.out.println("scores[2]:"+scores[2]);
		
		int total=0;
		for(int i=0;i<3;i++) {
			total+=scores[i];
		}
		System.out.println("총합:"+total);
		double average=(double)total/3;
		System.out.println("평균:"+average);
		
		//new 연산자로 배열 생성
		//배열은 객체다, class는 객체다
		//타입[] 변수=new 타입[길이];
		//길이는 배열이 저장할 수 있는 값의 개수를 말합니다.
		
		//길이가 5인 int[]배열을 생성
		int[] intArr=new int[5];
		//배열 길이를 벗어 나서 접근할려면 에러(예외)가 발생됩니다.
		System.out.println(intArr[0]);
		System.out.println(intArr[4]);
		//System.out.println(intArr[5]);
		//out of bounds 에러발생
		//System.out.println(intArr[-1]);
		//out of bounds 에러발생
		//숫자형 기본 자료형은 모두 기본값 0으로 초기화됩니다.
		for(int i=0;i<5;i++) {
			System.out.println(intArr[i]);
			
		}
		
		//객체형 - String, Array, Scanner, System
		//String 빈 배열을 생성하여 초기화 값을 확인
		String[] strArr=new String[10];
		for(int i=0;i<10;i++) {
			System.out.println(strArr[i]);
			}
		//객체형 배열은 초기화 값이 null값으로 초기화 된다.
		//null -비어 있다
		String s1=null;
		s1="문자열";
		int[] intArrl=null;
		intArrl=new int[10];
		int[] intArr2;
		//값의 목록으로 배열 객체를 생성할때 주의할 점이 있는데,
		//배열 변수를 이미 선언한 후에는 다른 실행문에서 중괄호를
		//사용한 배열 생성이 허용되지 않습니다.
		//	intArr2= {1,2,3};
		//배열 변수를 미리 선언한 후 값 목록들이 나중에 결정되는 상황이라면
		//new 연산자를 사용해서 값 목록을 지정해주면 됩니다.
		intArr2=new int[] {1,2,3};
		
		//타입별로 배렬의 초기값
		//분류 | 타입 | 초기값
		//기본 타입(정수)|int[]|0
		//기본 타입(실수)|double[]|0
		//기본 타입(논리)|boolean|false
		//객체형(창조 타입)|클래스[]|null
		
		int[] point=new int[3];
		point[0]=83;
		point[1]=90;
		point[0]=75;
	
	}
}
