package tast;

public class T022_1 {
private T022_0[] videoArr=new T022_0[100];
private int cnt=0;

//video 생성하고 목록에 저장
public void createVideo(T022_0 t022_0) {
videoArr[cnt++]=t022_0;	
}
//video 목록 보여주기
public void printVideos() {
	for(int i=0; i<cnt;i++) {
	//System.out.println(video.toString());
	//toString()은 생략해도 된다
	System.out.println(videoArr[i]);		
	
	}
}
public static void main(String[] args) {
T022_1 vc=new T022_1();

vc.createVideo(new T022_0("흑백요리사"));
vc.createVideo(new T022_0("오징어 게임"));
vc.createVideo(new T022_0("신입생"));
vc.createVideo(new T022_0("경성크리처"));

vc.createVideo(new T022_2("랩:리퍼블릭"));
vc.createVideo(new T022_2("삼시세끼 라이트"));

vc.printVideos();
}
}
