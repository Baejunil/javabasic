package c05;

public class C05_01_05 {
	public static void main(String[] args) {
		//배열 복사
		//배열은 한 번 생성하면 크기를 변경할 수 없기 때문에
		//더 많은 저장 공간이 필요하다면 더 큰 배열을 새로 만들고
		//이전 배열로부터 항목 값들을 복사해야 합니다.
		
		//1 for문으로 배열 복사
		int[] oldIntArray= {1,2,3};
		int[] newIntArray=new int[5];
		
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		
		for(int i=0;i<newIntArray.length;i++) {
			System.out.println(newIntArray[i]+", ");
		}
		
		//System.arraycopy()로 배열 복사
		//System.arraycopy(Object src, int srcPos, 
		//Object dest, int destPos, int length);
		//src 매개값은 원본 배열이고
		//srcPos는 원본 배열에서 복사할 항목의 시작 인덱스입니다
		//dest 매개값은 새 배열이고
		//destPos는 새 배열에서 붙여 넣을 시작 인덱스입니다
		//마지막으로 length는 복사 할 개수입니다.
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray=new String[5];
		
		System.arraycopy(
				oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0;i<newStrArray.length;i++) {
			System.out.println(newStrArray[i]+", ");
		}
		
		//향상된 for문 (foreach문)
		//배열이나 컬렉션을 좀 더 쉽게 처리하기 위해 향상된 for문을 제공한다.
		//컬렉션은 배열의 업그레이드 버전
		//시퀀스형 자료형(data type)
		/* for(타입 변수:배열){
		 * 	실행문
		 * }
		 */
		//배열에서 가져 올 값이 존재하면 변수에 저장합니다.
		//실행문을 실행합니다.
		//다시 루프를 돌아 배열에서 가져올 다음 값이 존재하면
		//또 변수에 저장하고 실행문을 실행합니다.
		//가져올 다음 항목이 없으면 for문을 종료합니다.
		int[] scores= {95,71,84,93,87};
		for(int score:scores) {
			System.out.println(score);
		}
		
		//점수 총합을 저장할 변수
		int sum=0;
		for(int s:scores) {
			sum=sum+s;
		}
		System.out.println("점수 총합 = "+sum);
		
		double avg=(double)sum/scores.length;
		System.out.println("점수 평균 = "+avg);
		
		//다차원 배열
	}

}