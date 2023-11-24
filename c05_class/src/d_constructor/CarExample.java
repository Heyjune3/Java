package d_constructor;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.company = "Benz";
		car.model = "S class";
		car.color = "BLACK";
		car.maxSpeed = 380;
		car.speed = 0;
		
		Car k5 = new Car("KIA","K5",230);
		
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.color);
		System.out.println(k5.maxSpeed);
		
		// 소괄호 안에 Ctrl + Space = 생성자 확인 및 지정 목록창
        Car k3 = new Car("KIA","K3","white");
        System.out.println(k3);
        
        Car avante = new Car("HYUNDAE","avente","white",180,0);
        System.out.println(avante.company);
	}

}





