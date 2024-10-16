package c16.use;

import java.util.Optional;

import c16.Company;
import c16.ContInfo;
import c16.Friend;

public class OptionalClassUse {
	//null일 가능성이 있는 처리를 해야 하는 메소드의 옵션날을 사용하므로써
	//개선된 결과
	public void showCompAddr(Optional<Friend> f) {
		String addr=f.map(Friend::getCmp)
				.map(Company::getcInfo)
				.map(ContInfo::getAdrs)
				.orElse("Thre's no...");
		System.out.println(addr);
	}
	
	public static void main(String[] args) {
		ContInfo ci=
				new ContInfo("321-444-577","Republic of Korea");
//				new ContInfo("321-444-577",null);
		Company cp=new Company("YaHo Co., Ltd.",ci);
		Friend frn=new Friend("LEE JAVA",cp);
		OptionalClassUse ocu=new OptionalClassUse();
		ocu.showCompAddr(Optional.of(frn));
	}

}