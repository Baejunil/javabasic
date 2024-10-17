package tast;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class T032 {
    public static void main(String[] args) {
        // 출발 시간 설정 (서울 시간대)
        ZonedDateTime go = ZonedDateTime.of(
            LocalDateTime.of(2025, 3, 3, 10, 0), ZoneId.of("Asia/Seoul"));
        System.out.println("한국 출발 시각: " + go);

        // 도착 시간 설정 (일본 시간대)
        ZonedDateTime jp = ZonedDateTime.of(
            LocalDateTime.of(2025, 3, 3, 11, 0), ZoneId.of("Asia/Tokyo"));
        System.out.println("일본 도착 시각: " + jp);

        // 비행 시간 
        Duration flightDuration = Duration.between(go, jp);
       
        System.out.println(Duration.between(go, jp));
       
    }
}
