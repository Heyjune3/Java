package ex02_nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		
		/*
		 document.getElementById("btnId").onclick = function(){
		 	// click 이벤트 발생 시 수행 할 작업
		 };
		 */
		
		Button callButton = new Button("전화걸기");
		callButton.setOnClickListener(new CallListener());
		callButton.onTouch();
		
		Button messageButton = new Button("메세지");
		messageButton.setOnClickListener(new MessageListener());
		messageButton.onTouch();
		
		// 익명 구현 객체
		Button powerButton = new Button("전원");
		Button.OnClickListener powerListener 
		= new Button.OnClickListener() {			
			@Override
			public void onClick() {
				System.out.println("전원을 끕니다.");
			}
		};
		powerButton.setOnClickListener(powerListener);
		powerButton.onTouch();

		Button internetBtn = new Button("Google");
		internetBtn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("구글 브라우저를 켭니다.");
			}
		});
		internetBtn.onTouch();
		
		Button btn2 = new Button("kakao");
		
		// lambda 표현식- method를 하나의 식으로 표현 - 익명 함수를 지징하는 용어
		btn2.setOnClickListener(()->{
			System.out.println("kakaotalk을 켭니다.");
		});
		btn2.onTouch();
	}

}
