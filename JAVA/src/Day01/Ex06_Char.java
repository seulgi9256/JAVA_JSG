package Day01;

public class Ex06_Char {

	public static void main(String[] args) {

		// 리터럴(Literal) : 소스코드에 표기하는 데이터 (숫자인지, 문자인지, 문자열인지 의미를 부여)
		char c1 = 'A'; // 문자 리터럴 : 'A' (작은 따옴표)
		char c2 = 65; // 십진수 --> 아스키코드표에 매핑된 문자
		char c3 = '\u0041'; // 유니코드로 지정

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1; // char -> int로 자동형변환
		
		char b = (char) (c2 + 1);
		// (c2 + 1) 		: (char) --> (int) 자동 형변환 : 65
		// (char) (결과) 		: (int) --> (char) 강제 형변환
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2); //char
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A 의 코드 값 : " + uniCode);
		System.out.println("b : " + b);
		
	}

}
