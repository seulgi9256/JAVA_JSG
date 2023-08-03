package Day07.Ex02_Computer;

public abstract class Computer {
	// 추상메소드를 정의하면, abstract을 정의
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
		
	}
}
