package c10.stringlibrary;

import java.io.UnsupportedEncodingException;

//String클래스
//어떤 프로그램이건 문자열은 데이터로서 아주 맣이 사용됩니다
//문자열을 생성하는 방법과 추출,비교,찾기,분리,변환 등을 제공하는
//메소드를 알아 두자
public class StringMethods {
	public static void main(String[] args) {
		//String 생성자
		//자바의 문자열은 java.lang 패키지의 String클래스의 인스턴스로 관리됩니다
		//소스상에서 문자열 리터럴은 String객체로 자동 생성되지만
		//String 클래스의 다양한 생성자를 이용해서 직접 String객체를
		//생성할수도 있다
		
		//바이트 배열을 문자열로 변환
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		String str1=new String(bytes);
		System.out.println(str1);
		String str2=new String(bytes,6,4);
		System.out.println(str2);
		
		//String 메소드
		//문자 추출(chatAt())
		//charAt()메소드는 매개값으로 주어진 인뎃스의 문자를 리턴합니다
		String subject="자바 프로그래밍";
		char chatValue=subject.charAt(3);
		System.out.println(chatValue);
		
		//주민등록번호에서 남자와 여자를 구분하는 방법
		String ssn="01624-1230123";
		char gender=ssn.charAt(7);
		if(gender=='1'||gender=='3') {
			System.out.println("남자 입니다");
		}else {
			System.out.println("여자 입니다");
		}
		
		//문자열 비교(equals())
		//기본 타입 변수의 값을 비교할 때에는 ==연사자
		//그러나 문자열을 비교할 때에는 ==연산자 사용하면 원하지 않는결과가 
		//나올수도
		String s1="java";
		String s2="java";
		String s3=new String("java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//자바는 문자열 리터열이 동일하다면 동일한 String 객체를 참조하도록
		//되어 있습니다.
		//그래서 s1과 s2는 동일한 String객체를 참조합니다.
		//그리고 s3는 new 연산자로 생성된 다른 String객체를 참조합니다.
		//==연산자는 각 변수에 저장된 번지를 비교하기 때문에 이러한 결과가 나옵니다.
		//만약 두 String객체의 문자열만을 비교하고 싶다면 ==연산자 대신에
		//equals()메소드를 사용해야합니다
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		//바이트 배열로 변환(getByres())
		//네트워크로 문자열 전송하거나,문자열을 암호화할 때 바이트 배열로 변환하는
		//경우가 있습니다.
		//문자열을 바이트 배열로 변환하는 메소드는 다음 두가지가 있ㅅ브니다
		//getBytes();
		//getBytes(Charset charset);
		//charset 특정 문자셋으로 인코딩된 바이트 배열을 얻으려면 인토딩을
		//매개변수에 넣어주면 됩니다.
		try {
			byte[] bytes1="문자열".getBytes("EUC-KR");
			byte[] bytes2="문자열".getBytes("UTF-8");
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		//어떤 문자셋으로 인코딩하느냐에 따라 바이트 배열의 크기가 달라지는데,
		//EUC-KR은 알벳은 1바이트, 한글은 2바이트로 변환하고,
		//UTF-8은 알파벳은 1바이트, 한글은 3바이트로 변환합니다.
		
		//바이트 배열로 변환
		String str="안녕하세요";
		byte[] bytes1=str.getBytes();
		System.out.println(bytes1);
		String st1 = new String(bytes1);
		System.out.println(st1);
	}
}
