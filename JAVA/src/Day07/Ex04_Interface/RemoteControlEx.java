package Day07.Ex04_Interface;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		// 인터페이스타입 객체명 = new 구현클래스();
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl speakerRc = new Speaker();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(-100);
		speakerRc.setMute(false);
		speakerRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();
			
	}

}
