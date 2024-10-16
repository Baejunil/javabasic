package c14.functional;

import java.util.function.Consumer;

//Consumer<T> -> void accept(T t)
public class ConsumerInter {
	
	public void printStr(Consumer<String> c,String s) {
		c.accept(s);
	}
	
	public static void main(String[] args) {
		ConsumerInter ci=new ConsumerInter();
		ci.printStr(s->System.out.println(s),"Pineapple");
		ci.printStr(s->System.out.println(s),"Strawberry");
	}
	//Consumer<T>를 구체화하고 다양화 한 인터페이스들이 있다
}