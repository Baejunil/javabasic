package c07video;

public class VideoController {
private Video[] videoArr=new Video[100];
private int cnt=0;

//video 생성하고 목록에 저장
public void createVideo(Video video) {
videoArr[cnt++]=video;
}

//video 목록 보여주기
public void printVideos() {
for(int i=0;i<cnt;i++) {
//System.out.println(video.toString());
//toString()은 생략해도 된다
System.out.println(videoArr[i]);
}
}

public static void main(String[] args) {
VideoController vc=new VideoController();

vc.createVideo(new Video("흑백요리사"));
vc.createVideo(new Video("오징어 게임"));
vc.createVideo(new Video("신입생"));
vc.createVideo(new Video("경성크리처"));

vc.createVideo(new Tving("랩:리퍼블릭"));
vc.createVideo(new Tving("삼시세끼 라이트"));

vc.printVideos();
}


}