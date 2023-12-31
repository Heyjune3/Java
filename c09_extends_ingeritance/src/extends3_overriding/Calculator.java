package extends3_overriding;
// Object 는 최 상위 객체
// 상속받는 객체를 명시하지 않으면 extends Object를 생략해놓음
public class Calculator // extends Object
{
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public double circleArea(double radius) {
			System.out.println("calculator circleArea 호출");
			return radius * radius * 3.14;
	}
	
	@Override
	public String toString() {
		return "Calculator";
	}
		
}
