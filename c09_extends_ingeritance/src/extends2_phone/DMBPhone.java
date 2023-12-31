package extends2_phone;

public class DMBPhone extends Phone {

	int channel;
	
	public DMBPhone() {
		// super(); // 생략가능
	}
	
	public DMBPhone(String model, String color, int channel) {
		super(model, color);
		/*
		this.model = model;
		super.color = color; // color는 부모요소다 라는 걸 명시적으로 표현
		*/
		this.channel = channel;
	}
	
	void changeChannel() {
		if(channel < 1) {
			System.out.println("사용할 수 없는 채널입니다.");
		}else {
			this.channel = channel;
			System.out.println("채널이 : " + this.channel + "로 변경되었습니다.");
		}
	}
	
	void turnOnDMB() {
		System.out.println("DMB를 켭니다.");
	}
	
	void turnOffDMB() {
		System.out.println("DMB를 끕니다.");
	}
	
}
