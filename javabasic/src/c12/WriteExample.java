package c12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

//입출력 스트림
//프로그램은 데이터를 읽고 출력하는 작업을 빈번히 수행합니다. 
//데이터는 키보드를 통해 입력될 수도 있고, 
//파일 또는 네트워크로부터 입력될 수도 있습니다.
//반대로 모니터로 출력될 수도 있고, 파일 또는 네트워크로 출력될 수도 있습니다.

//자바에서 데이터는 스트림(Stream)을 통해 입출력됩니다.
//스트림은 단일 방향으로 연속적으로 흘러가는 것을 말하는데,
//물이 높은 곳에서 낮은 곳으로 흐르듯이 데이터는 출발지에서 도착지로 흘러갑니다.

//프로그램이 도착지이면 흘러온 데이터를 입력받아야 하므로 입력 스트림을 사용합니다.
//반대로 프로그램이 출발지면 데이터를 출력해야 하므로 출력 스트림을 사용합니다.

//입출력 스트림의 종류
//java.io 패키지에는 여러 가지 종류의 스트림 클래스를 제공하고 있습니다.
//크게 두 종류로 구분
//바이트 기반 스트림: 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용
//문자 기반 스트림: 문자 데이터를 읽고 출력할 때 사용
public class WriteExample {
	public static void main(String[] args) {
		//바이트 출력 스트림:OutputStream
		//OutputStream은 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스입니다.
		//모든 바이트 기반 출력 스트림 클래스는 OutputStream클래스를 상속받아서
		//만들어집니다.
		//OutputStream클래스를 상속하는 클래스들
		//FileOutputStream,PrintStream, BufferedOutputStream,
		//DataOutputStream
		
		//OutputStream 클래스의 주요 메소드
		//메소드 | 설명
		//void write(int b) | 1byte를 출력합니다
		//void write(byte[] b) | 매개값으로 주어진 배열 b의 모든 바이트를
		//출력합니다.
		//void write(byte[] b, int off,int len) | 매개값으로 주어진 배열
		//b[off]부터 len개까지의 바이트를 출력합니다.
		//void flush() | 출력 버퍼에 잔류하는 모든 바이트를 출력합니다.
		//void close() | 출력 스트림을 닫습니다.
		byte a=10;
		byte b=20;
		byte c=30;
		try {
			OutputStream os=new FileOutputStream("C:/Temp/test1.db");
			os.write(a);
			os.write(b);
			os.write(c);
			//출력 버퍼에 잔류하는 모든 바이트를 출력
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//write(byte[] b)메소드
		try {
			OutputStream os1
				=new FileOutputStream("C:/Temp/test2.db");
			byte[] array= {10,20,30};
			os1.write(array);
			os1.flush();
			os1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//write(byte[] b,int off,int len)메소드
		try {
			OutputStream os=
					new FileOutputStream("C:/Temp/test3.db");
			byte[] array= {10,20,30,40,50};
			//배열 일부를 출력하기
			//배열 1번 인덱스부터 3개를 출력
			os.write(array,1,3);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}