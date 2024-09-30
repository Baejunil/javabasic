package tast;

public class T017 {
	String name;
	String frequency;     // 얼마나 자주 하는지 (예: 매일, 주간 등)
	int duration;         // 한 번 할 때 얼마나 하는지 (시간)
	String withFriends;  // 친구와 함께 하는지 여부
	String isIndoor;     // 실내/실외 또는 장소
	
	String name1;
	String home;
	String platform;
	String contents;
	int age;
	
	public T017(String name,String frequency,int duration,
			String withFriends,String isIndoor){
		this.name=name;
		this.frequency=frequency;
		this.duration=duration;
		this.withFriends=withFriends;
		this.isIndoor=isIndoor;
	}
	public T017(String name1,String home,String platform,String contents,int age) {
		this.name1=name1;
		this.home=home;
		this.platform=platform;
		this.contents=contents;
		this.age=age;
	}
	
    public static void main(String[] args) {
        // 첫 번째 배열
        T017 nc1 = new T017("게임", "주2회", 3, "친구들과 함께", "각자 집");
        T017 nc2 = new T017("운동", "주3회", 1, "혼자", "러닝트랙");
        T017 nc3 = new T017("해외축구 시청", "주2회 새벽타임", 4, "혼자", "집");
        T017 nc4 = new T017("일본어 공부", "주3회", 1, "혼자", "집");
        T017 nc5 = new T017("술", "주2회~3회", 2, "친구들과 함께", "술집");

        T017[] ncArray = {nc1, nc2, nc3, nc4, nc5};

        // 첫 번째 배열 정보 출력
        for (T017 nc : ncArray) {
        	System.out.println("취미: " + nc.name);
            System.out.println("주 몇 회: " + nc.frequency);
            System.out.println("한 번 할 때 시간: " + nc.duration);
            System.out.println("친구와 함께하는지: " + nc.withFriends);
            System.out.println("장소: " + nc.isIndoor);
            System.out.println(); // 줄 바꿈
        }

        // 두 번째 배열
        T017 nc6 = new T017("김민교", "산본", "soop,유튜브", "리그오브레전드", 28);
        T017 nc7 = new T017("이상호", "영등포","soop,유튜브", "리그오브레전드", 31);
        T017 nc8 = new T017("아이자와유우키", "미야기현 센다이시", "유튜브", "브이로그", 33);
        T017 nc9 = new T017("파오캐쩜신", "경기도추정", "유튜브", "파이트오브캐릭터즈", 29);
        T017 nc10 = new T017("linq","후쿠오카현 ","유튜브,showrom", "아이돌 그룹채널",17);

        T017[] ncArray1 = {nc6, nc7, nc8, nc9, nc10};

        // 두 번째 배열 정보 출력
        for (T017 nc : ncArray1) {
        	System.out.println("이름: " + nc.name1);
            System.out.println("사는곳: " + nc.home);
            System.out.println("플랫폼: " + nc.platform);
            System.out.println("주로하는컨텐츠: " + nc.contents);
            System.out.println("나이: " + nc.age);
            System.out.println(); // 줄 바꿈
        }
    }
}