package c16;

//Optional 클래스
//NullPointerException 예외가 발생할 수 있는 상황에서 유용하게 쓰입니다.
//가장 좋은 것은 null로 초기화 할 인스턴스 변수가 없는 것입니다.
//일반적으로 데이터베이스와 연동해서 사용하다 보면 null값이 발생할 상황이
//많이 생깁니다.
public class OptionalClass {
	public void showCompAddr(Friend f) {
		String addr=null;
		//인자로 전달된 것이 null일 수도 있으니
		if(f!=null) {
			Company com=f.getCmp();
			//회사 정보가 없을 수도 있으니
			if(com!=null) {
				ContInfo info=com.getcInfo();
				//회사의 연락처 정보가 없을 수도 있으니
				if(info!=null) {
					addr=info.getAdrs();
				}
			}
		}
		//회사 주소 정보가 없을 수도 있으니
		if(addr!=null)
			System.out.println(addr);
		else
			System.out.println("회사 주소 정보가 없습니다.");
		
		//null 가능성에 대비하는 코드의 작성은 번거롭고
		//그 코드 스타일도 만족스러운 편은 아니다.
		//이를 해결하기 위해 등장한 것이 Optional 클래스
	}

}