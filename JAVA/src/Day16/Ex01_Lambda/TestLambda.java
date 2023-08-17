package Day16.Ex01_Lambda;

class Television {
	void volumeUp() { System.out.println("UP"); }
	void volumeDown() {	System.out.println("Down"); }
}

interface RemoteControl {
	void volumeUp();
	void volumeDown();
}

// 함수형 인터페이스 어노테이션
@FunctionalInterface		// 인터페이스가 함수형 인터페이스인지 체크 (추상 메소드가 1개 인지 체크)
interface Calculator {
	int calc(int a, int b);
	
	// 함수형 인터페이스는 추상메소드가 2개 이상 있으면 에러 발생
	//double calc(double a, double b); // 메소드 오버로드 : 같은 메소드에 매개변수만 다름
	
}

public class TestLambda {
	
		public static void main(String[] args) {
			// 익명 자식 객체
			Television tv = new Television() {
				int channel = 0;
				
				void volumeUp() { System.out.println("UP - 자식"); }
				void volumeDown() {	System.out.println("Down - 자식"); }

			};
			
			tv.volumeUp();
			tv.volumeDown();
			
			// 익명 구현 객체
			RemoteControl rc = new RemoteControl() {
				
				@Override
				public void volumeUp() {
					System.out.println("UP - 구현");
				}
				
				@Override
				public void volumeDown() {
					System.out.println("DOWN - 구현");
				}
			};
		 rc.volumeUp();
		 rc.volumeDown();
		 
		 //익명 구현 객체
		 Calculator cal = new Calculator() {
			 
			 @Override
			 public int calc(int a, int b) {
				 return a + b;
			 }
			 
//			 @Override
//			 public double calc(double a, double b) {
//				 return a + b;
//			 }
		};
		
		int result1 = cal.calc(10, 20);
		System.out.println("result1 : " + result1);
			
		// 람다식
		Calculator calLambda = (a, b)-> {return a + b; };
		int result2 = calLambda.calc(20, 30);
		// double result3 = calLambda.calc(1.5, 3.4);
		System.out.println("result2 : " + result2);
		// System.out.println("result3 : " + result3);
		}
		
}

