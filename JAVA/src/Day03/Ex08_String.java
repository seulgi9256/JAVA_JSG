package Day03;

public class Ex08_String {

	public static void main(String[] args) {
		// String은 참조자료형
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a == c);					//T
		System.out.println(a == d);					//F
		System.out.println(a.equals(d));			//T

		System.out.println(e == f);					//F
		System.out.println(e.equals(f));			//T
		
		// == 			: 해당 변수의 레퍼런스(참조정보)를 비교
		// equals()		: 해당 변수의 문자열 자체를 비교

	}

}
