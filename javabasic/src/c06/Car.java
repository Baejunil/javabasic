package c06;

//필드
//필드는 객체의 고유데이터, 부품 객체, 상태 정보를 저장하는 곳입니다.
public class Car {
	//자동차 객체를 예로 들면
	//고유 데이터 - 제작회사, 모델, 색깔, 최고 속도
	String company;
	String model;
	String color;
	String maxSpeed;
	
	//상태 데이터 - 현재 속도, 엔진 회전 수
	int speed;
	int rpm;
	
	//부품 - 차체, 엔진, 타이어
	//Body, Engine, TireWheel 클래스 생성
	Body body;
	Engine engine;
	TireWheel tireWheel;

}