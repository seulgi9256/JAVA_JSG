package Day16.Ex01_Lambda;

@FunctionalInterface
interface FuncInterface1 { void method(); }

@FunctionalInterface
interface FuncInterface2 { void method(String a, String b); }

@FunctionalInterface
interface FuncInterface3 { String method(); }

@FunctionalInterface
interface FuncInterface4 { String method( String a, String b); }

public class LambdaFormat {
	
	public static void main(String[] args) {
		//매개 변수, 반환타입 없는 람다식
		FuncInterface1 fi1 = () -> System.out.println("람다식1");		// 한 문장이면 { } 생략가능
		fi1.method();
		
		//매개 변수 있는 람다식
		FuncInterface2 fi2 = (a, b) -> { 
			String result = a + b; 
			System.out.println(result); 
			};

			// 반환타입이 있는 람다식
		FuncInterface3 fi3 = () -> {
			String a = "자바";
			String b = "람다식";
			return a+b;
			};
			String result3 = fi3.method();
			System.out.println(result3);
		
		// 매개변수, 반환타입 있는 람다식
		FuncInterface4 fi4 = (a, b) -> a+b;	//return 문만 있으면, "return, { }" 생략가능
		String result4 = fi4.method("자바", "람다식");
		System.out.println(result4);
			
	}
}
