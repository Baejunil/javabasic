package c18.gmt;

import java.time.ZoneId;

public class ZoneIdDemo1 {
	public static void main(String[] args) {
		//시간대 고려한 코드 작성을 위해서는 ZoneId 인스턴스 생성
		ZoneId paris=ZoneId.of("Europe/Paris");
		System.out.println(paris);
		//시간대별 문자열 정보 전체 출력 방법
		ZoneId.getAvailableZoneIds().stream()
			.sorted()
			.forEach(s->System.out.println(s));
		//일부 정보만 선밸해서 출력하는 방법
		ZoneId.getAvailableZoneIds()
			.stream()
			.filter(s->s.startsWith("Asia"))
			.sorted()
			.forEach(s->System.out.println(s));
	}

}