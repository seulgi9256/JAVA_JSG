package Day07.Ex02_Computer;

//부모 클래스의 추상메소드는 반드시 오버라이딩 해야한다.
public class DeskTop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop - display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop - typing");
	}

}
