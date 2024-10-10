package c10;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Date date= new Date();
		System.out.println(date.toString());
		//Object의 toString() 메소드의 리턴값은 자바 애플리케이션에서는
		//별 값어치가 없는 정보이므로 Object 하위 클래스 toString()메소드를
		//재정의(오버라이딩)하여 간결하고 유익한 정보를 리턴하도록 되어 있습니다.
		//java.util 패키지의 Date클래스는 toString()메소드를 재정의하여
		//현재 시스템의 날짜와 시간 정보를 리턴합니다.
		String str="문자열";
		System.out.println(str.toString());
		//String 클래스는 toString()메소드를 재정의해서 저장하고 있는 문자열을
		//리턴합니다.
	}

}
