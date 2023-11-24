package e_math;
/**
 * Math
 * 수학 계산에 사용할 수 있는 정적 메소드를 제공하는 class
 * */
public class MathExample {

	public static void main(String[] args) {
		
		// 절대 값 : 부호가 생략된 값 abs 함수
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1);			// 5
		System.out.println("v2 : " + v2);			// 3.14
		
		// 내림
		double v3 = Math.floor(5.3);
		double v4 = Math.floor(-5.3);
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);
		
	}
}
