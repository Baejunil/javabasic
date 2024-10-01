package tast;

public class T019Member {
    String name1;  // 이름
    String id1;    // 아이디

    // 생성자
    public T019Member(String name, String id) {
        this.name1 = name;
        this.id1 = id;
    }

    // 필드값을 출력하는 메소드 (선택 사항)
    public void printInfo() {
        System.out.println("이름: " + name1 + ", 아이디: " + id1);
    }
}