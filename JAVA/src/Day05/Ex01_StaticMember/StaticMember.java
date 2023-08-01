package Day05.Ex01_StaticMember;

public class StaticMember {
	// static 변수
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592;
	
	// static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
//		sum += c;
//		c는 static 멤버가 아니기 때문에,
//		static 메소드 내에서 접근할 수 없다.
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = sum(10,20);
		a = 100;
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		
		int a1 = sm1.a;
		int c1 = sm1.c = 10;
		int a2 = sm2.a;
		int c2 = sm2.c = 20;
		
		// PI = 100;
		// final은 상수로 지정하는 키워드
		// : 한 번 값을 초기화한 이후에는 값을 변경할 수 없다.
		
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
		System.out.println("sum : " + sum);
		
	}
}
