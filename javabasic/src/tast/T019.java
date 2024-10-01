package tast;
public class T019 {
	 //확인 문제 9번
	// 로그인 메소드
    public boolean login(String id, String password) {
        if ("hong".equals(id) && "12345".equals(password)) {
            return true; // 로그인 성공
        }
        return false; // 로그인 실패
    }

    // 로그아웃 메소드
    public void logout(String id) {
        System.out.println("로그아웃 되었습니다."); // 로그아웃 메시지 출력

    }
	//확인문제 6
	//클래스의 생성자가 다음과 같이 오버로딩되어있습니다 생성자마다 중복코딩된 부분이있습니다
	//this()를 활용해서 중복코드를 제거해보세요
	String title;
    String content;
    String writer;
    String date;
    int hitcount;

    // 기본 생성자
    public T019(String title, String content) {
        this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
    }

    // writer를 포함한 생성자
    public T019(String title, String content, String writer) {
        this(title, content, writer, "현재 컴퓨터 날짜", 0);
    }

    // date를 포함한 생성자
    public T019(String title, String content, String writer, String date) {
        this(title, content, writer, date, 0);
    }

    // 모든 필드를 포함한 생성자
    public T019(String title, String content, String writer, String date, int hitcount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }
  //확인문제 7
  		//Board 클래스가 위와 같이 선언되어 있을 경우 Board객체를 생성하는 네가지 방법을 모두 기술해보세요
  		//Board board1 = new Board("제목1", "내용1");
  		//Board board2 = new Board("제목2", "내용2", "로그인1");
  		//Board board3 = new Board("제목3", "내용3", "로그인2", "2024-10-01");
  		//Board board4 = new Board("제목4", "내용4", "로그인3", "2024-10-01", 10);
    public void print(int value) {
        System.out.println("정수: " + value);
    }

    public void print(boolean value) {
        System.out.println("불리언: " + value);
    }

    public void print(double value) {
        System.out.println("실수: " + value);
    }

    public void print(String value) {
        System.out.println("문자열: " + value);
    }


    public static void main(String[] args) {
    	
    
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
		//확인 문제 4
		//생성자에 대한 설명으로 맞는 것에 0표,틀린것에 X표하세요
		/*
		 *1객체를 생성하려면 생성자 호출이반드시 필요한것은 아니다(x) 항상생성자를 호출해야한다
		 *2생성자는 다른 생성자를 호출하기 위해this()를 사용할수있다(0)
		 *3생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다(0)
		 *4매개변수의수,타입,순서가,다른생성자를 여러개선언할수있다(0)
		 */
		//5번 문제
//		
		T019Member user1 = new T019Member("홍길동","hong");
          // 객체의 정보를 출력 (선택 사항)
		//확인문제 8
		/*메소드 오버로딩에 대한 설명으로 마즌ㄴ것에 0표,틀린것에 X표하세요
		 * 1동일한 이름의 메소드를 여러 개 선언하는것을 말한다(0)
		 * 반드시 리턴 타입이 달라야한다(X) 리턴 타입은 오버로딩의 조건이 아니다
		 * 메소드를 리턴 타입이 같더라도 매겨변수의 타입이나 개수 순서가 다르면가능하다
		 * 매개변수의 타입,개수 순서를 다르게 선언해야한다(0)
		 * 매개값의 타입 및 개수에 따라 호출될 메소드가 선택된다(0)
		 */
		//확인무제 9번 연속
		// MemberService 객체 생성 및 로그인 테스트
        T019 memberService = new T019("제목", "내용"); // 임시로 T019 객체 생성
        boolean result = memberService.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
        T019 printer = new T019("제목","내용"); // Printer 객체 생성

        // 다양한 타입의 값 출력
        printer.print(10);       // int 값 출력
        printer.print(true);     // boolean 값 출력
        printer.print(5.7);      // double 값 출력
        printer.print("홍길동");  // String 값 출력
/* 문제10
 * final 필드와 상수(static final)에 대한 설명으로 틀린 것은 무엇입니까?
 1final 필드와 상수는 초기값이 저장되면 값을 변경할 수 없다. 0
 2final 필드와 상수는 생성자에서 초기화될 수 있다. 0
 3상수의 이름은 대문자로 작성하는 것이 관례이다.0
 4 상수는 객체 생성 없이 클래스를 통해 사용할 수 있다.ㅌ
 */
        //11번문제
//		public class ShopService{
//			private static ShopService shopservice=new ShopService();
//		private ShopService() {
			
//		}
//			static ShopService getInstance() {
//				return shopService;
//			}
//		public class ShopServiceExample{
//			public static void main(String[] args) {
//				ShopService obj1 = ShopService.getInstance();
//				ShopService obj2 = ShopService.getInstance();
				
//				if(obj1==obj2) {
//					System.out.println("같은 ShopService 객체입니다.");
//				}else {
//					System.out.println("다른 ShopService 객체입니다.");
//				}
				
//			}
//	}      
		
    }

	
}
