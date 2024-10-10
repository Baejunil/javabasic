package tast;

public class T025 {

	public static void main(String[] args) {
		//확인문제1번
		// try-catch-finally 블록에 대한 설명중 틀린것은 무엇입니까? 3번
		//1 try{}블록에는 예외가 발생할수있는 코드를 작성한다(0)
		//2 catch{}블록은try{}블록에서 발생한 예외를 처리하는 블록이다(0)
		//3 try{}블록에서 retum문을 사용하면finally{}블록은 실행되지 않는다(x)
		//4 catch{}블록은 예외의 종류별로 여러 개를 작성할 수 있다.(0)
		
		//확인문제2번
		//throws에 대한 설명으로 틀린 것은 무엇입니까?2,4
		//1 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.(0)
		//2 throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.(x)
		//3 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성할 수 있다.(0)
		//4 새로운 예외를 발생시키기 위해 사용된다.(x)
		
		//확인문제 3번
		//3. 다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?
		/*
		 * public void method1() throws NumberFormatException, ClassNotFoundException { " }
				try {
				method1();
				} catch(Exception e) {
				}
				void method2( ) throws Exception {
				method1();
				try {
				method1();
				} catch(Exception e) {
				} catch(ClassNotFoundException e) {
				 try {
				method1();
				} catch(ClassNotFoundException e) {
				} catch(NumberFormatException e) {
			 Exception은 모든 예외의 상위에 있기 때문에, Exception 아래 있는 catch문이 실행되지 않는다.
			//확인문제 4번
			*/	//4. 다음 코드가 실행되었을 때 출력 결과는 무엇입니까
				String[] strArray = { "10", "2a" };
				int value = 0;
				for(int i=0; i <= 2; i++) {
				try {
				value = Integer. parseInt(strArray[i]);
				} catch(ArrayIndexOutOfBoundsException e) {
				System. out.println("인덱스를 초과했음");
				} catch(NumberFormatException e) {
				System. out.println("숫자로 변환할 수 없음");
				} finally {
				System.out.println(value);	}
				}}
			/*
			 * 10
			   숫자로 변환할 수 없음
			   10
			   인덱스를 초과했음
			   10
			 */
			
			/*확인문제 5번
			 * 인터페이스 타입 변환에 대한 설명입니다 맞는것에 0표 틀린 것에 x표하세요
			 * 구현객체는 인터케이스 타입으로 자동변환된다(0)
			 * 부모클래스가 인터페이스를 구현하면 자식 클래스로 부터 생성된 객체는 인터베이스 타입으로 자동변환할수 없다(x)
			 * 	인터페이스 변수에 대입된 객체를 원래 구현 클래스 타입으로 변환 하는 것을 강제 타입변환이라고 한다(0)
			 * 메소드의 매개변수타입이 인터페이스이면 매개값으로 모든 구현 객체를 대입하면 자동 타입변환이 된다(0)
			 */
			
			/*확인문제 6번
			 * 다형성에 대한 설명입니다 맞는것은 0표 틀린것은x표하세요.
			 * 다형성을 구현하기 위한 조건은 메소드 재정의와 타입변환이다()
			 * 클래스 상속과 인터페이스는 모두 메소드 재정의와 타입 변호나 기능이 제공
			 * 되므로 어떤 방법을 사용하든 다형성 구현이 가능하다()
			 * 매개변수의 타입이 클래스라면 해당 클래스로 생성된 객체만 대입가능하다(x)
			 * 매개변수의 타입이 인터페이스라면 모든 구현 객체가 대입가능하다()
			 */
	//확인문제 7번
		/*public class DaoExample {
		public static void dbWork(DataAccessObject dao) {
			dao.select();	
			dao. insert ();
			dao. update();
			dao.delete();
		public static void main(String[] args) {
			dbWork(new OracleDao());		
			dbWork(new MySqlDao());
				}
			}
			*/	
	/*OracleDao 클래스
	 * 
	 * 	public class OracleDao implements DataAccessObject {
    	@Override
    	public void select() {
        	System.out.println("Oracle DB에서 검색");
    }
    	@Override
    	public void insert() {
        	System.out.println("Oracle DB에 삽입");
    }
    	@Override
    	public void update() {
        	System.out.println("Oracle DB를 수정");
    }
    	@Override
    	public void delete() {
        	System.out.println("Oracle DB에서 삭제");
    }
}
	 */ 
		/* MySqlDao 클래스
		 * 		
		 * 
		 * public class MySqlDao implements DataAccessObject {
    	@Override
    	public void select() {
        	System.out.println("MySql DB에서 검색");
    	}
    	@Override
    	public void insert() {
        	System.out.println("MySql DB에 삽입");
    }
    	@Override
    	public void update() {
        	System.out.println("MySql DB를 수정");
    }
    	@Override
    	public void delete() {
        	System.out.println("MySql DB에서 삭제");
    }
}

		 */
	/* 확인문제8번
	 * 인터페이스에 대한 설명입니다 맞는것에 0표 틀린것에 x표하세요
	 * 인터페이스는 객체 사용방법을 정의해놓은 타입이다(0)
	 * new연산자를 이용해서 인터페이스 객체를 만들수 있다(x)
	 * 인터페이스는 상수 필드와 추상메소드를갖는다(0)
	 * 구현클래스는implements키워드로 인터페이스를 기술해야한다(0)
	 */
	
	/*확인문제9번
	 * 인터페이스 사용에 대한 설명입니다 맞는것에 0표 틀린것에 x표하세요
	 * 클래스를 선언할때 인터페이스 타입의 필드를 선언할수있다()
	 * 생성자의 매개타입이 인터페이스일경우 매개값으로 구현 객체를 대입한다()
	 * 인터페이스 타입의 로컬변수는 선언할수 없다()
	 * 메소드의 매개타입이 인터페이스일 경우 매개값으로 구현 객체를 대입한다()
	 */
	
	/*확인문제 10번
	 * public interface Soundable {
		String sound();
		public class SoundableExample {
			private static void printSound(Soundable soundable) {
				System.out.println(soundable.sound());
				}
				public static void main(String[] args) {
				printSound(new Cat());
				printSound(new Dog());			
				}
		}
	}*/
	/* 고양이 클래스
	 * public class Cat implements Soundable {
    	@Override
    	public String sound() {
        	return "야옹";
    }
}  */
	
	/* 댕댕이 멍멍이 개 클래스
	 * public class Dog implements Soundable {
    	@Override
    	public String sound() {
        	return "멍멍";
    }
} */
	}
