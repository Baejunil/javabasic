package c14;

public class OneOaramAndReturn {
	public static void main(String[] args) {
		//매개변수가 있고 반환하는 람다식
		HowLong hl=s->{return s.length();};
		HowLong hl1=s->{
			int len=s.length();
			return len;
		};
		//return 키워드가 있으면 중괄호 생략 불가
		//return문만 중괄호에 있을 경우 return 키워드와 중괄호 생략 가능합니다.
		HowLong hl2=s-> s.length();
	}

}