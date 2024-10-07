package shopinglist;

public class ShoppingListRepository {
	private ShoppingList[] SLs=new ShoppingList[100];
	private int cnt=0;
	
	//물품 생성해서 배열에 저장
	public void createSL(ShoppingList sl) {
		SLs[cnt++]=sl;
	}
	
	//배열 목록 출력
	public void printSLs() {
		for(int i=0;i<cnt;i++) {
			System.out.println(SLs[i].toString());
		}
	}
}
