package c12.objio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//클래스 변수가 참조형 변수가 있을 경우 인스턴스를 직렬화 해야 한다
//인스턴스 직렬화
//객체 인스턴스의 데이터를 I/O스트림에 적합한 일련의 데이터로 변환하는 과정
//인스턴스를 직렬화하기 위해서는 Serializable 인터페이스를 구현한다.
public class StrBox implements Serializable{
	
	private String s;
	//참조 변수 s가 참조하는 인스턴스가 Serializable을 구현하는
	//클래스의 인스턴스이면 함께 직렬화 된다.
//	private SBox sBox;
//	private Scanner sc;
//	private int i;

	public StrBox(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}
	
	public static void main(String[] args) {
		StrBox box1=new StrBox("Robot");
		StrBox box2=new StrBox("Strawberry");
		List<StrBox> boxs=new ArrayList<>();
		boxs.add(box1);
		boxs.add(box2);
		
		try {
			ObjectOutputStream oo=
				new ObjectOutputStream(
					new FileOutputStream("C:/Temp/Object.bin"));
			oo.writeObject(box1);
			oo.writeObject(box2);
			oo.writeObject(boxs);
			System.out.println("저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream oi=
				new ObjectInputStream(
					new FileInputStream("C:/Temp/Object.bin"));
			StrBox box3=(StrBox) oi.readObject();
			System.out.println(box3.getS());
			StrBox box4=(StrBox) oi.readObject();
			System.out.println(box4.getS());
			List<StrBox> boxs1=(List<StrBox>) oi.readObject();
			for(StrBox sb:boxs1) {
				System.out.println(sb.getS());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}