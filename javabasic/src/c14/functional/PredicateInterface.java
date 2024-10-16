package c14.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//정의되어 있는 함수형 인터페이스
//람다식을 사용할 때 - 함수형 인터페이스가 필요
//미리 정의되어 있는 함수형 인터페이스를 제공 한다.
public class PredicateInterface {
	//Preadicate<T> -> boolean test(T t)
	//전달 인자를 근거로 참 또는 거짓을 반환
	//매개변수로 정수형 리스트를 받아서 리스트안에 있는 모든 수를 더해서 리턴
	public int sum(List<Integer> lst) {
		int s=0;
		for(int n:lst) {
			s+=n;
		}
		return s;
	}
	public int sum1(Predicate<Integer> p,List<Integer> lst) {
		int s=0;
		for(int n:lst) {
		if(p.test(n))	s+=n;
		}
		return s;
	}
	public static void main(String[] args) {
		PredicateInterface pi= new PredicateInterface();
		List<Integer> list=Arrays.asList(1,5,7,9,11,12);
		int s;
		s=pi.sum(list);
		System.out.println("다더한수합"+s);
	
		//짝수 합
		s=pi.sum1(n->n%2==0,list);
		System.out.println("짝수 합:"+ s);
	
		//홀수 합
		s=pi.sum1(n->n%2!=0,list);
		System.out.println("홀수 합:"+ s);
		//10최소 공배수의 합쪽의 2개만 합
		
		//Predicate<T>를 구체화하고 다양한 한 인터페이스
		//Intpreadicate boolean test(int value)
		//LongPredicate boolean test(long value)
		//DoublcPredicate boolean test(double value)
		//BiPredicate<T,U> boolean test(T t,U,u )
	}
	
}
