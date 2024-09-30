package c05;

public class C05_01_03 {
	int number=0;
	public static void main(String[] args) {
		//배열 길이
		//배열 길이란 배열에 저장할 수 있는 전체 항목의 개수를 말합니다.
		//코드에서 배열의 길이를 얻으려면 배열 객체의 필드(field)
		//클래스 변수, attribute(속성)인 length를 읽습니다.
		//배열의 length 필드를 읽기 위해서는 배열 변수에 dot(도트)(.)연산자를
		//붙이고 length를 적어 주면 됩니다.
		//배열변수.lengrh;
		int[] intArray= {10,20,30};
		//배열의 길이를 구한다
		System.out.println(intArray.length);
		//length 필드는 값을 바꿀수가 없습니다.
		//intArray.length=4;
		
		int[] scores= {83,90,87,80,100};
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("총합:"+sum);
		
	}
}
