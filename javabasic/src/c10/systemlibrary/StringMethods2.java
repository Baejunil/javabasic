package c10.systemlibrary;

public class StringMethods2 {

	public static void main(String[] args) {
		// String 클래스 2
		//문자열 찾기(indexOf())
		//indexOf() 메소드는 매개값으로 주어진 문자열이 시작되는 인덱스를
		//리턴합니다
		//만약 주어진 문자열이 포함되어 있지 않으면 -1을 리턴합니다.
		String subject="자바 프로그래밍";
		int index=subject.indexOf("프로그래밍");
		System.out.println(index);
		
		//indexOf() 메소드는 if문 조건식에서
		//여부에 따라 실행 코드를 달라할 때 자주 사용됩니다.
		//-1 값을 리턴하면 특정 문자열이 포함되어 있지 않다는 뜻입니다.
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련없는 책이군요.");
		}
		//문자열 길이(length())
		//length() 메소드는 문자열의 길이(문자의 수)를 리턴합니다.
		subject ="자바 프로그래밍";
		int length=subject.length();
		System.out.println(length);
		//문자열의 길이는 공백을 포함한다
		String ssn="7306241230123";
		int l=ssn.length();
		if(l==13) {
			System.out.println("주민번호 자리수가 맞습니다");
		}else {
			System.out.println("주민 번호 자리수가 틀립니다");
		}
		//문자열 대치(replace())
		//replace() 메소드는 첫 번째 매개값인 문자열을 찾아 두 번째 매개 ㄱ밧인
		//문자열로 대치한 새로운 문자열을 생성하고 리턴합니다.
		String oldStr="What the hell";
		String newStr=oldStr.replace("hell","heaven");
		System.out.println(newStr);
		
		//문자열 잘라내기(substring())
		//substring()메소드는 주어진 인덱스에서 문자열을 추출합니다.
		//substring()메소드는 매개값의 수에 두 가지 형태로 사용됩니다.
		//(메소드 오버로딩)
		//substring(int beginIndex,int endIndex)는 주어진 시작과
		//끝 인덱스 사이의 문자열을 추출하고,
		//substring(int behinIndex)는 주어진 인덱스부터 끝까지 문자열을 추출
		ssn="880815-1234567";
		String firstNum=ssn.substring(0,6);
		System.out.println(firstNum);
		String secondNum=ssn.substring(7);
		System.out.println(secondNum);
	
		//알파벳은 소,대문자 변경(toLowerCase(),toUpperCase())
		//toLowerCase()메소드는 문자열을 모두 소문자로 바꾼 새로운 문자열을
		//생성한 후 리턴합니다
		//반대로  toUpperCase()메소드는 문자열을 모두 대문자로 바꾼 문자열을
		//생성한 후 리턴합니다
		String original="Java Programing";
		String loweCase=original.toLowerCase();
		System.out.println(loweCase);
		String upperCase=original.toLowerCase();
		System.out.println(upperCase);
		
		//이 메소드는 영어로 된 두 문자열을 대소문자와 관계없이
		//비교할 때 주로 이용됩니다.
		String str1="Java programming";
		String str2="JAVA PROGRAMMING";
		System.out.println(str1.equals(str2));
		
		String lowerStr1=str1.toLowerCase();
		String lowerStr2=str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		//equalsIgnoreCase() 대소문자를 제외하고 비교를 해주는 메소드
		System.out.println(str1.equalsIgnoreCase(str2));
				
		//문자열 앞뒤 공백 잘라내기(trim())
		//trim()메소드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고
		//리턴합니다.
		String spaceStr="	자바 프로그래밍	  ";
		String nStr=oldStr.trim();
		System.out.println(nStr);
		
		String tel1="	02";
		String tel2="123   ";
		String tel3="	1234		";
		String tel=tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
		
		String spaceAll="			";
		//메소드 체이닝
		//메소드들을 온점(.)으로 연결하여 연속으로 사용 가능 하다
		if(spaceAll.trim().length()<0) {
			System.out.println("다시 입력해 주세요.");		
		}
		
		//문자열 변화(valueOf())
		//valudOf()메소드는 기본 타입의 값을 문자열로 변환하는 기능을
		//가지고 있습니다.
		//String클래스에는 매개 변수의 타입별로 valueOf()메소드가 오버로딩
		//되어있ㅅ븐디ㅏ
		String trans1=String.valueOf(10);
		String trans2=String.valueOf(10.5);
		String trans3=String.valueOf(true);
		
		System.out.println(trans1);
		System.out.println(trans2);
		System.out.println(trans3);
		//빈문자열""
		String s1=10+"";
		String s2=10.5+"";
		String s3=true+"";
		
		
	}

}
