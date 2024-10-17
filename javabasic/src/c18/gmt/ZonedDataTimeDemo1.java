package c18.gmt;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDataTimeDemo1 {
	public static void main(String[] args) {
	//시간대를 반영한 ZonedDateTime 클ㄹ래수
	//이곳의 현재 날짜 시간
		ZonedDateTime here=ZonedDateTime.now();
		System.out.println(here);
	//동일한 날짜와 시각의 파리
	//of(날짜와 시각 정보만, ZonedID)
	ZonedDateTime paris=ZonedDateTime.of(here.toLocalDateTime(),ZoneId.of("Europe/Paris") );
	System.out.println(paris);
	}
}
