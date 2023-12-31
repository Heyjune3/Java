package j_practice;

import java.util.Scanner;

/**
 3. 라이브러리 기능 구현(String class method 활용)
  사용자에게 문자열을 입력 받아 “java”라는 문자열이 입력받은 문자열에 존재할 때
  프로그램을 종료 “java”라는 문자열이 존재 하지 않을 때 는 다시 문자열을 입력받아 
  확인 할 수 있도록 코드를 작성하시오.
 */
public class Practice03StringMethodExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력해주세요>>");
			String s = sc.nextLine();
			// java라는 문자열이 입력받은 문자열에 존재하는지 확인
			// index번호는 0에서부터 양수로 표현, -1은 존재하지 않음을 의미
			//if(s.indexOf("java") != -1) {
			// contains("검색할 문자열"), true - 포함, false - 미포함
			if(s.contains("java")) {
				System.out.println("java가 존재합니다.");
				break;
			}
			System.out.println("java가 존재하지 않습니다.");
		} // end while
		System.err.println("시스템을 종료합니다.");
	} // end main

}
