package c04;

import java.util.Scanner;
public class PsySimpleTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("간단한 심리 테스트입니다");
		System.out.println("문제에 대한 답을 선택하세요");
		System.out.println("(범죄가아닌상황에서)누군가 갑자기 당신에게");
		System.out.println("카메라를 들이댄다면 어떻게 하실 건가요?");
		System.out.println("1)멋진 포즈를 취한다");
		System.out.println("2)주위사람들에게 같이 찍자고한다");
		System.out.println("3)피한다");
		System.out.println("4)장난스런 표정을 짓는다");
		System.out.println("선택:");
		int choice=scanner.nextInt();
		//버그때문에 언터값을 제거하기위한 문장
		scanner.nextLine();
		if(choice==1) {
			System.out.println("1)멋진 포즈를 취한다");
			System.out.println("당신은 속마음을 드러내지 않으면서");
			System.out.println("거짓말을 잘하네요.");
		}else if(choice==2) {
			System.out.println("2)주위 사람들에게 같이 찍자고 한다");
			System.out.println("밝은 성격이며 모임에서 호감을 주고");
			System.out.println("모두에게 친절하네요");
		}else if(choice==3) {
			System.out.println("3)피한다");
			System.out.println("수줍음이 많은 성격이며 자신감이 좀 부족하네요");
		}else if(choice==4) {
			System.out.println("4)장난스런 표정을 짓는다");
			System.out.println("당신은 가볍게 사귀는 것과");
			System.out.println("즐거운 만남을 좋아하네요");
		}
	}

}
