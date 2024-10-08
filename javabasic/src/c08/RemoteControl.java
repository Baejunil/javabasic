package c08;

public interface RemoteControl {
	
	void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//public 접근 제한
	//인터페이스의 모든 메소드는 기본적으로 public 접근 제한을 갖기 때문에
	//public보다 더 낮은 접근 제한으로 작성할 수 없다.

}