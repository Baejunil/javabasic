package tast;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class T033 {

    public static void main(String[] args) {
    
        // 뉴욕 (2025년 2월 27일 00:00)
        ZonedDateTime northAmerica = ZonedDateTime.of(
                LocalDateTime.of(2025, 2, 27, 0, 0),  
                ZoneId.of("America/New_York"));  
        System.out.println("북미 출시일 (뉴욕 기준): " + northAmerica);

        // 한국 시간
        ZonedDateTime korea = northAmerica.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        System.out.println("한국 출시일 (서울 기준): " + korea);

        // 시차 계산 
        Duration diff = Duration.between(northAmerica, korea);
        System.out.println("서울과 뉴욕의 시차: " + diff.toHours() + "시간");
    }
}