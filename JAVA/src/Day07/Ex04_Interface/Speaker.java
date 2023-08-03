package Day07.Ex04_Interface;

public class Speaker implements RemoteControl {

	// 변수
	private int volume; 		// 음량

	@Override
	public void turnOn() {
		System.out.println("스피커 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스피커 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨을 최댓값을 넘지 못하게 지정
		if( volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		// 볼륨을 최솟값을 넘지 못하게 지정
		else if ( volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스피커 볼륨 : " + this.volume);
	}
	

}
