package tast;

import java.util.ArrayList;
import java.util.List;

public class T028_0 {
	   private String name; 

	    public String getName() {
	        return name; 
	    }

	    public void setName(String name) {
	        this.name = name; 
	    }

	    @Override
	    public String toString() {
	        return name; 
	    }

	    public static void main(String[] args) {
	        List<T028_0> wlist = new ArrayList<>(); 
	        // CRUD 기능 - 생성
	        T028_0 item1 = new T028_0();
	        item1.setName("");
	        T028_0 item2 = new T028_0();
	        item2.setName("스마트폰");
	        T028_0 item3 = new T028_0();
	        item3.setName("헤드폰");
	        wlist.add(item1);
	        wlist.add(item2);
	        wlist.add(item3);

	        // 읽어오기
	        System.out.println("찜 목록:");
	        for (T028_0 item : wlist) {
	            System.out.println(item);
	        }

	        // 수정하기
	        wlist.get(1).setName("태블릿"); 
	        System.out.println("수정된 인덱스 1: " + wlist.get(1));

	        // 삭제하기
	        wlist.remove(2); 
	        System.out.println("삭제 후 찜 목록:");
	        for (T028_0 item : wlist) {
	            System.out.println(item);
	        }
	    }
	}