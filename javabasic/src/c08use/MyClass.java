package c08use;

import c08.RemoteControl;
import c08.Television;
//인터페이스 사용
//인터페이스 필드, 생성자 또는 메소드의 매개 변수 생성자 또는 메소드이 로컬변수로
//선언될 수 있습니다

public class MyClass {
	private RemoteControl rc;
	private RemoteControl rc1= new Television();
	public MyClass() {
		
	}
	public MyClass(RemoteControl rc) {
		this.rc=rc;
	}
	public void methodA() {
		RemoteControl rc=new Television();
		//로컬 변수로 선언된 인터페이스
		rc.turnOn();
		rc.turnOff();
	}	
	public void methodB(RemoteControl rc) {
		//메소드의 매개 변수 타입으로 선언된 인터페이스
		rc.turnOn();
		rc.turnOff();
		
	}
	/**
	 * @return the rc
	 */
	public RemoteControl getRc() {
		return rc;
	}
	/**
	 * @param rc the rc to set
	 */
	public void setRc(RemoteControl rc) {
		this.rc = rc;
	}
	/**
	 * @return the rc1
	 */
	public RemoteControl getRc1() {
		return rc1;
	}
	/**
	 * @param rc1 the rc1 to set
	 */
	public void setRc1(RemoteControl rc1) {
		this.rc1 = rc1;
	}
	public static void main(String[] args) {
		//필드로 선언된 rc1
		MyClass myClass=new MyClass();
		myClass.getRc1().turnOn();
		myClass.getRc1().setVolume(33);
		
		//생성자의 매개 변수 타입으로 선언된 rc
		MyClass mClass1=new MyClass(new Television());
		myClass.getRc().turnOn();
		myClass.getRc().turnOff();
	}
	
}
