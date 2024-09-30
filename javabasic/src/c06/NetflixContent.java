package c06;

public class NetflixContent {
	String name;
	int releaseYear;
	String sort;
	
	public NetflixContent(
			String name,int releaseYear,String sort) {
		this.name=name;
		this.releaseYear=releaseYear;
		this.sort=sort;
	}
	
	public static void main(String[] args) {
		NetflixContent nc1=
				new NetflixContent("흑백요리사", 2024, "리얼리티 시리즈");
		NetflixContent nc2=
				new NetflixContent("살인자O난감", 2024, "스릴러");
		NetflixContent nc3=
				new NetflixContent("오징어 게임", 2021, "스릴러");
		NetflixContent[] ncArray=new NetflixContent[3];
		ncArray[0]=nc1;
		ncArray[1]=nc2;
		ncArray[2]=nc3;
		for(NetflixContent nc:ncArray) {
			System.out.println("내가 봤던 넷플릭스");
			System.out.println("제목: "+nc.name);
			System.out.println("출시 연도: "+nc.releaseYear);
			System.out.println("장르: "+nc.sort);
		}
	}
}