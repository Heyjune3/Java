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
		
		// 올림
		double v5 = Math.ceil(5.3);
		double v6 = Math.ceil(-5.3);
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		
		// 두개의 값을 매개변수로 넘겨받아 둘중 큰 수를 반환
		int v7 = Math.max(10, 12);
		double v8 = Math.max(10.1, 10.4);
		System.out.println("v7 : " + v7);
		System.out.println("v8 : " + v8);
		
		// 두개의 값을 매개변수로 넘겨받아 둘중 작은 수를 반환
		int v9 = Math.min(10, 12);
		double v10 = Math.min(10.1, 10.4);
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);
		
		// 반올림
		// 소수점 첫째자리에서 반올림하고
		// 값을 double type으로 반환
		double v11 = Math.rint(5.311);
		double v12 = Math.rint(5.511);
		System.out.println("v11 : " + v11);
		System.out.println("v12 : " + v12);
	}
}
