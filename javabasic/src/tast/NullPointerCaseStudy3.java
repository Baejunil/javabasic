package tast;

import java.util.Optional;

public class NullPointerCaseStudy3 {
    public static void showCompAddr(Optional<Friend> f) {
        String addr = f.flatMap(Friend::getscl)
                .flatMap(School::getCInfo)
                .flatMap(ContInfo::getAdrs)
                .orElse("주소정보가 없습니다.");

        System.out.println(addr);
        String name = f.map(Friend::getName)
                .orElse("친구 정보강없습니다.");

        System.out.println("친구이름: " + name);
    }

    public static void main(String[] args) {
        Optional<ContInfo> ci = Optional.of(
                new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea 양캠 양산시 주남로 288"
                		+ "해캠 부산시반송순환로 142"))
        );
        Optional<School> sc = Optional.of(new School("영산대학교", ci));
        Optional<Friend> frn = Optional.of(new Friend("이씨", sc));

        // 둘다 나오기
        showCompAddr(frn);
      
    }
}
