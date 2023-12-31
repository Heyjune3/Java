package com.bitc.conditional_statement;
// 앞으로 이 class에서 
// java.util 패키지에 있는 Scanner라는 클래스를 사용할것임을 명시
import java.util.Scanner;

public class IFExample {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		if(true) {
			System.out.println("무조건 실행");
		}
		
		if(num1 < num2) {
			System.out.println("num1 이 num2 보다 작습니다.");
		}
		
		if(num1 < num2) {
			System.out.println("num1 이 num2 보다 작습니다.");
		}else if(num1 > num2) {
			System.out.println("num1 이 num2 보다 큽니다.");
		}else {
			System.out.println("num1 이 num2과 같습니다.");
		}
		
		// 나중에 배우게 될 객체
		// Console을 통해서 사용자에게 값을 입력받는 객체
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("정수값을 입력해 주세요 > ");
		// Scanner.nextInt(); // console을 통해서 정수값을 입력받아 반환
		int a = sc.nextInt();
		System.out.println(a);
		
		// Scanner.next(); // console을 통해서 한단어를 입력받아 반환
		System.out.println("단어를 입력해 주세요.");
		String str = sc.next();
		System.out.println(str);
		
		System.out.println("실수를 입력해 주세요 > ");
		double r = sc.nextDouble();
		System.out.println(r);
		
		System.out.println("실행 여부를 작성해 주세요! true or false");
		boolean isRun = sc.nextBoolean();
		System.out.println(isRun);
		
		System.out.println("boolean 타입으로 값을 입력받아 저장");
		System.out.println("지정된 타입으로 값이 입력되었는지 여부를 boolean타입으로 반환");
		isRun = sc.hasNextBoolean();
		/*
		 	Scanner.hasNextBoolean();
		 	Scanner.hasNextInt();
		 	Scanner.hasNextDouble();
		 	Scanner.hasNext();
		 */
		
		// boolean 타입의 값인지 여부 확인
		if(isRun) {
			System.out.println("boolean 타입의 값이 정상적으로 입력");
			boolean isResult = sc.nextBoolean();
			System.out.println(isResult);
		}else {
			
			System.out.println("boolean 타입의 값이 아닙니다.");
			String dummy = "10" ;
			dummy = "3.141592";
			dummy = "true";
			dummy = sc.next();
			System.out.println("잘못된 값을 꺼내와서 제거 : " + dummy);
		}
		
	}

}














