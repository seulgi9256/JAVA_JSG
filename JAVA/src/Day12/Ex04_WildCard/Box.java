package Day12.Ex04_WildCard;

/**
 * 제네릭 기법으로 클래스 정의하기
 * - 클래스명 뒤에 타입매개변수 <E>, <T>, <K>, <V> 등을 작성한다.
 * @param <T>
 */
public class Box<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
