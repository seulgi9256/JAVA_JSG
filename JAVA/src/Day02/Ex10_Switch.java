package Day02;

import java.util.Scanner;

public class Ex10_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널을 선택하세요 : ");
		int channel1 = sc.nextInt();
		
		// switch : ctrl + space
		switch(channel1) {
			case 11:
				System.out.println("MBC - 나혼자산다");
				break;
			case 15:
				System.out.println("jtbc - 킹더랜드");
				break;
			case 27:
				System.out.println("Mnet");
				break;
			case 28:
				System.out.println("ENA - 나는솔로");
				break;
			case 1:
				System.out.println("넷플릭스 - 하트시그널");
				break;
			case 2:
				System.out.println("디즈니플러스 - ");
				break;
			case 3:
				System.out.println("쿠팡플레이 - ");
				break;
			
			default:
				System.out.println("유효한 채널번호를 입력해주세요");
				break;
				
		}
		sc.close();
		
	}

}
