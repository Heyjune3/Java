package d_constructor;

public class Car {
	
	String company;		// 제조사
	String model;		// 모델명
	String color;		// 색상
	
	int maxSpeed;		// 최대속도
	int speed;			// 현재속도

	// 생성자를 정의하지 않으면
	// 컴파일러가 기본생성자(밑의 형식)를 자동으로 추가
	
	Car(){
		System.out.println("Car 기본 생성자 호출");
	} 
	// 위와 같이 직접! 추가해놓으면 컴파일러는 따로 기본생성자를 추가하지 않음
	
	Car(String c, String m, int i){
		company = c;
		model = m;
		maxSpeed = i;
		System.out.println("3개의 매개변수를 넘겨받는 생성자 호출");
	}
	
	Car(String company, String model, String color){
		System.out.println(this);
		// this == 생성된 인스턴스의 주소
		this.company = company;
		this.model = model;
		this.color = color;
	}
	// alt + s + a = 생성자 자동 완성
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		// super();  // 상속에서 학습
		// this() == 자신의 생성자 호출
		this(company,model,color);
		/*
		this.company = company;
		this.model = model;
		this.color = color;
		*/
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
		
}



