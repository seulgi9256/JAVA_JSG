package Day03;

// enum(열거타입) 정의
// - 열거타입은 enum 파일로도 정의할수 있고,
// 클래스 파일 내에서 정의할 수도 있다.
enum Test { A, B, C, D, E, F };

public class Ex07_Enum {

	public static void main(String[] args) {
		// ENUM(열거타입)
		// -요소들을 명명한 값으로 집합을 이루는 자료형
		// 특징
		// 1. enum을 비교할 때는 값 뿐만아니라 타입도 비교한다.
		// 2. enum의 상수값이 재정의되도 다시 컴파일할 필요가 없다.
		
		
		// values() 	: 열거체의 모든 요소를 배열로 반환
		Rainbow[] rainbow = Rainbow.values();
		
		for(Rainbow color : rainbow) {
			System.out.println(color + " ");
		}
		System.out.println();
		
		// valueOf : 전달된 문자열과 일치하는 열거체 상수를 반환
		Rainbow G = Rainbow.valueOf("Green");
		System.out.println("G : " + G);
		
		// ordinal()	: 해당 열거체 상수가 정의된 순서 index를 반환
		int index = G.ordinal();
		System.out.println("GREEN의 index : " + index);

	}

}
