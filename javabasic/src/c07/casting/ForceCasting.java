package c07.casting;

//강제 타입 변환(casting)
//강제 타입 변환은 부모 타입을 자식 타입으로 변환하는 것을 말합니다.
//자식 타입이 부모 타입으로 자동 타입 변환한 후 다시 자식 타입으로 변환 할때
//강제 타입 변환을 사용할 수 있습니다.
//자식타입 변수=(자식타입)부모타입;
public class ForceCasting extends ForceCatingParents {
	public static void main(String[] args) {
		ForceCatingParents fcp=new ForceCasting();
		ForceCasting fc=(ForceCasting)fcp;
		//자식 타입이 부모 타입으로 자동 타입 변환하면
		//부모에 선언된 필드와 메소드만 사용 가능하는
		//제약 사항이 따릅니다.
		//만약 자식에 선언된 필드와 메소드를 꼭 사용해야 한다면
		//강제 타입 변환을 해서 다시 자식 타입으로 변환한 다음
		//자식의 필드와 메소드를 사용하면 됩니다.
		
		//객체 타입 확인
		ForceCatingParents fcp1=new ForceCatingParents();
		//ForceCasting fc1=(ForceCasting) fcp1;//(X)
		//최신 참조 문서를 확인 원래 안되던건데 갑자기 되서 당황s
		//컴파일 에러로 는 안뜨는데 결국 에러가 뜸 이상함
		
		//부모 변수가 참조하는 객체가 부모 객체인지 자식 객체인지 확인하는
		//방법이 있습니다
		//어떤 인스턴스 어떤 클래스의 인스턴스인지 확인하기 위해
		//instanceof 연산자를 사용합니다.
		//boolean result = 좌항(객체 또는 인스턴스) instanceof 우항(타입)
		//좌항의 객체가 우항의 인스턴스이면, 즉 우항의 타입으로 객체가
		//생성되었따면 true를 리턴하고 그렇지 않으면 false를 리턴합니다.
		
		if(fcp1 instanceof ForceCasting) {
			ForceCasting fc1=(ForceCasting) fcp1;
		}
		//ForceCasting fc1=(ForceCasting) fcp1;
		System.out.println("다음 코드");
		ForceCasting fc2=new ForceCasting();
		fc2.checkCast(new ForceCasting());
		fc2.checkCast(new ForceCatingParents());
	}
	public void checkCast(ForceCatingParents fcp) {
		if(fcp instanceof ForceCasting) {
			ForceCasting fc=(ForceCasting)fcp;
			System.out.println("변환 성공");
		}else {
			System.out.println("변환 불가");
		}
	}
}
