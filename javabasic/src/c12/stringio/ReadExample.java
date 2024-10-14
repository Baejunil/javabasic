package c12.stringio;

//문자 입력 스트림:Reader
//Reader는 문자 기반 입력 스트림의 최상위 클래스로 추상 클래스입니다.
//모든 문자 기반 입력 스트림은 Reader클래스를 상속받아서 만들어 집니다.
//FileReader,BufferedReader, InputStreamReader클래스는
//모두 Reader클래스를 상속하고 있습니다.

//Reader클래스의 주요 메소드
//리턴 타입 | 메소드 | 설명
//int | read() | 1개의 문자를 읽고 리턴합니다.
//int | read(char[] cbuf) | 읽은 문자들을 매개값으로 주어진 문자
//배열에 저장하고 읽은 문자수를 리턴합니다.
//int | read(char[] cbuf, int off, int len) | len개의 문자를 읽고
//매개값으로 주어진 문자 배열에서 cbuf[off]부터 len개까지 저장합니다.
//그리고 읽은 문자 수를 리턴합니다.
//void | close() | 입력스트림을 닫습니다.
public class ReadExample {

}