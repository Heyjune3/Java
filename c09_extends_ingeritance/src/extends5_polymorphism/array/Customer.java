package extends5_polymorphism.array;

public class Customer {
	
	int customerID;				// 소비자 아이디
	String customerName;		// 소비자 이름
	String customerGrade;		// 소비자 등급
	int bonusPoint;				// 보너스포인트
	double bonusRatio;			// 보너스 비율
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	// 보너스 포인트 적립 후 구매 가격 알림
	public int clacPrice(int price) {
		// 보너스 포인트 적립율 만큼 보너스 포인트 추가
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String toString() {
		return customerName+"님의 등급은 "+customerGrade+"이며"
				+"보너스 포인트는 : " +bonusPoint+"입니다.";
	}
}
