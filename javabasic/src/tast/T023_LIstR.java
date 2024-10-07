package tast;

public class T023_LIstR {
	private T023_List[] GLs=new T023_List[100];
	private int cnt=0;
	//물품 생성해서 배열에 저장
	public void createGL(T023_List gl) {
		GLs[cnt++]=gl;
	}
	//배열 목록 출력
	public void pringGLs() {
		for(int i=0;i<cnt;i++) {
			System.out.println(GLs[i].toString());
		}
	}
}
