package c04;

public class C04_01_05 {

	public static void main(String[] args) {
		// 주사위를 굴려서 나올 수 있는 1,2,3,4,5,6 중에서
		//하나의 수를 무작위로 뽑아서 출력하는 프로그램을 작성
		
		//정수 난수를 얻는다
		double d1=Math.random();
		System.out.println(d1);
		//Math.random()메소드는 0.0과 1.0사이에 속한느 double 타입의
		//난수 하나를 리턴합니다
		//0.0은 범위에 포함되고 1.0은 포함되지 않습니다
		//0.0<= Math.random()<1.0
		
		//1~10 사이의 정수중에서 하나의 정수를 얻기 위해 각 변에 10을 곱한다
		//0.0*10<= Math.random()<1.0*10
		
		//각 변을 int타입으로 강제 타입 변환하면 하나의 정수값을 얻는다
		//(int)0.0*10<= (int)Math.random()<(int)1.0*10
		//0~9사이의 수를 가져 온다
		
		//각 변에 1을 더하면 1~10사이의 정수 중에서 하나의 정수를 얻는다
		//0+1<= (int)(Math.random()*10)+1<10+1
		int n=10, start=1;
		int num=(int)(Math.random()*n)+start;
		//start부터 시작하는 n개의 정수 중에서 임의의 정수를 얻는 실행문
		
		//주사위 번호 하나를 뽑기 위해서는 1부터 시작하는 6개의 정수
		int dice=(int)(Math.random()*6)+1;
		
		if(dice==1) {
			System.out.println("1번이 나왔습니다");
		}else if(dice==2) {
			System.out.println("2번이 나왔습니다");
		}else if(dice==3) {
			System.out.println("3번이 나왔습니다");
		}else if(dice==4) {
			System.out.println("4번이 나왔습니다");
		}else if(dice==5) {
			System.out.println("5번이 나왔습니다");
		}else if(dice==6) {
			System.out.println("6번이 나왔습니다");
		}
		System.out.println(dice+"번이 나왔습니다.");
	 		}
}
