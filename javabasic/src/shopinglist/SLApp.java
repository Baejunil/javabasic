package shopinglist;

public class SLApp {
    public static void main(String[] args) {
        SLRepo sRepo = new SLRepo(); // SLRepo 객체 생성
        sRepo.addSL("샴푸"); // 쇼핑 리스트에 아이템 추가
        sRepo.addSL("바디워시");

        // Consumer 사용하여 리스트 출력
        sRepo.printSLs(sls -> System.out.println(sls));

        // 또 다른 방식으로 리스트 출력
        sRepo.printSLs(sls -> {
            System.out.println("내일까지 꼭 사야 되는 물품");
            if (sls.size() > 0) {
                System.out.println("물품: " + sls.get(0).getName());
            }
            if (sls.size() > 1) {
                System.out.println("급하지 않은 물품");
                System.out.println("물품: " + sls.get(1).getName());
            }
        });
    }
}
