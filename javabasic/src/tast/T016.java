package tast;
import java.util.Scanner;
public class T016 {
	public static void main(String[] args) {
		
		//1번문제
		int[]array = {1,2,3};
		//int[]array:array= {1,2,3}; :는 java에서 사용하지 않는다
		int[]array2= new int[3];
		int[][]array3 =new int[3][2];
		
		//2번문제 3번
		//베열의 기본 초기값에 대한 설명으로 틀린 것은 무엇입니까? 
		//1 정수 타입 배열 항목의 기본 초기값은 0이다.
		//2 실수 타입 배열 항목의 기본 초기값은0.0F또는 0.0이다
		//3 boolean타입 배열 항목의 기본 초기값은 true이다. (틀림)false이다
		//4 참조 타입 배열 항목의 기본 초기값은 null이다
		
		//3번 문제 
		 {
		 int[] array4 = { 1, 5, 3, 8, 2 };
		 int max = array4[0]; // 배열의 첫 번째 요소로 초기화

		// 배열을 순회하며 최대값 찾기
		 for (int i = 1; i < array4.length; i++) {
		 if (array4[i] > max) {
		      max = array4[i]; // 새로운 최대값 발견 시 갱신
		            }
		 }
		        // 최대값 출력
		     System.out.println("max: " + max);
		  
		  //4번문제     
		   boolean run = true;
		   int studentNum =0;
		   int[] scores = null;
		   Scanner scanner = new Scanner(System.in);
		   
		   while (run) {
	            System.out.println("---------------------------------------------------");
	            System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료 ");
	            System.out.println("---------------------------------------------------");
	            System.out.print("선택> ");
	            
	            int selectNo = Integer.parseInt(scanner.nextLine());

	            if (selectNo == 1) {
	                System.out.print("학생수> ");
	                studentNum = Integer.parseInt(scanner.nextLine());
	                scores = new int[studentNum]; // 학생 수 배열 생성
	            } else if (selectNo == 2) {
	                for (int i = 0; i < scores.length; i++) {
	                    System.out.print("scores[" + i + "]> ");
	                    scores[i] = Integer.parseInt(scanner.nextLine());
	                }
	            } else if (selectNo == 3) {
	                System.out.println("점수 리스트:");
	                for (int i = 0; i < scores.length; i++) {
	                    System.out.println("scores[" + i + "]> " + scores[i]);
	                }
	            } else if (selectNo == 4) {
	                int max1 = scores[0];
	                int sum = 0;
	                for (int score : scores) {
	                    if (score > max1) {
	                        max1 = score;
	                    }
	                    sum += score;
	                }
	                double average = (double) sum / scores.length;
	                System.out.println("최고 점수: " + max1);
	                System.out.println("평균 점수: " + average);
	            } else if (selectNo == 5) {
	                run = false;  
	            }
	        }
	        
	        System.out.println("프로그램 종료");
	        scanner.close();
       // 확인 문제 1
       // 객체와 클래스에 대한 설명으로 맞는 것은 O표 틀린것은 X표하세요
       //1 클래스는 객체를 생성하기 위한 설계도와 같은것이다(0)
       //2 new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성된다.(0)
       //3 하나의 클래스로 하나의 객체만 생성할 수 있다(x) 하나의 클래스로 여러 객체 생성가능
       //4 객체는 클래스의 인스턴스이다(0)
	   
       // 확인 문제 2
       //1 메소드 -> 객체의 동작 부분으로 실행 코드를 가지고 있는 블록이다
       // 필드 ->객체의 데이터를 저장한다
       //3 생성자 ->객체의 초기화를 담당한다.
		 
       // 확인 문제 3
       /*public class Member{
        * String name; -> 필드
        * 
        * Member(String name){....} -> 메소드
        * 
        * void setName(String name){....} -> 생성자
        * }
        */
       //확인 문제 1
	   // 필드에 대한 설명으로 맞는것에 O표틀린것에 x표하세요
	   //1 필드는 메소드에서 사용할수 있다 (0)
	   //2 필드는 클래스 블록 어디서든 선언할수있다(생성자,메소드 내부제외).(0)
	   //3 필드는 객체 외부에서 접근할 수 없다. (x) pubilc으로 선언된 필드는 가능하다
	   //4 필드는 초기값을 주지 않더라고 기본값으로 자동 초기화 된다(0)
	   
	   //확인 문제2
	   /*
	    * public class Member{ 
	    * 		String name; ->	이름
	    * 		String id; 	->	아이디
	    * 		String password; ->패스워드
	    * 		int age; 	->	나이
	    * 	}
	    */
	    	
	   //확인 문제3
	   /*
	    *public class MembeExample{ 
	    * 		public static void main(String args) { 
	    * 			Member member = new Member(); 
	    * 			member.name = "최하얀"; //name 필드값 변경 
	    * 			member.age = 23;	 //age 필드값 변경 
	    * 	} 
	    * }
	    */
		}

	}
}
