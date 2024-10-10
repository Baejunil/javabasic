package c10.systemlibrary;

//System 클래스
//자바 프로그램은 운영체제에서 바로 실행되는 것이 아니라 JVM위에서 실행됩니다.
//따라서 운영체제의 모든 기능을 직접 이용하기는 어렵습니다.
//하지만 java.lang 패키지에 속하는 System클래스를 이용하면 운영체제의 일부 기능을
//이용할 수 있습니다.
//즉, 프로그램 종료, 키보드로부터 입력, 모니터로 출력, 현재 시간 읽기등이 가능합니다.
//System클래스의 모든 필드와 메소드는 정적(static)필드와 정적(static)메소드로
//구성되어 있습니다.
public class ExitExample {
	public static void main(String[] args) {
		//프로그램 종료(exit())
		//exit()메소드는 현재 실행하고 있는 프로세스를 강제 종료시키는 역활을
		//합니다
		//exit()메소드는 int 매개값을 지정하도록 되어 있는데, 일반적으로
		//정상 종료일 경우 0값을 줍니다
		for(int i=0;i<10;i++) {
			if(i==5) {
//				break;
			//	System.exit(0);
			}
		}
		System.out.println("마무리 코드");
		
		//현재 시각 읽기(currentTiemMillis(),nanoTime())
		//System 클래스의 currentTimeMillis()메소드와 nanoTime()메소드는
		//컴퓨터의 시계로부터 현재 시간을 읽어서 밀리세컨드(1/1000초)단위와
		//나노세컨드(1/10^9)단위의 long값을 리턴합니다.
		//주로 프로그램 실행 소요 시간 측정에 사용됩니다.
		//프로그램 시작 시 시각을 읽고, 프로그램이 끝날 때 시각을 읽어서
		//차이를 구하면 프로그램 실행 소요 시간이 나옵니다.
		
		//for문을 사용해서 1부터 1000000까지의 합을 구하는데 걸린시간을 출력합니다
		long time1=System.nanoTime();
		
		int sum=0;
		for(int i=1; i<=1000000; i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();
		 System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다");
	     System.out.println("1~1000000까지의 합: " + sum);
		
		
		
	}

}