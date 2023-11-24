package array;

import java.util.Scanner;

public class StudentManagementTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 종료 flag
		boolean isRun = true;
		
		// 학생의 점수를 입력받아 저장할 공간(배열)
		int[] scores = null;
		
		while(isRun) {
			System.out.println("==========================");
			System.out.println("1.학생수|2.점수입력|3.전체점수|4.분석|5.종료");
			System.out.println("==========================");
			System.out.println("선택하실 기능의 번호를 입력하세요 >");
			
			int selectNo = sc.nextInt();
			System.out.println("선택하신 번호는 : " + selectNo);
			/*
			 	1. 학생 수를 입력 -> 입력받은 학생 수만큼의 점수를 저장할 배열 생성
			 	2. scores 배열의 크기만큼(학생 수) 점수를 입력받아 각 항목에 저장
			 	3. scores 배열에 저장된 학생들의 점수를 하나씩 출력한다.
			 	4. 분석 - scores 배열에 저장된 점수의 전체 총점, 평균 점수, 최고점수, 최저점수 출력
			 	5. 프로그램 종료
			 */
			
			if(selectNo != 1 && selectNo != 5 && scores == null) {
				System.out.println("학생 수를 먼저 입력해 주세요.");
				 continue;
				
			}
			
			if(selectNo == 1) {
				System.out.println("학생수를 입력해주세요 > ");
				int studentNum = sc.nextInt();
				// 입력받은 학생 수 만큼 배열 생성
				scores = new int[studentNum];
				System.out.println("등록된 학생 수는 : " +scores.length);
			}else if(selectNo == 2) {
				System.out.println("점수 입력");
				// 배열의 크기만큼 학생들의 점수를 입력받아 저장
				for(int i = 0; i < scores.length; i++) {
					System.out.println(i+1 +"번째 학생의 점수를 입력해주세요 > ");
					// 입력한 점수를 배열에 저장
					scores[i] = sc.nextInt();
				}
				System.out.println("점수 입력 완료!");
			}else if(selectNo == 3) {
				System.out.println("학생들의 점수 출력");
				for(int i : scores) {
					System.out.println("등록된 학생의 점수는 : " + i);
				}
			}else if(selectNo == 4) {
				System.out.println("점수 분석");
				// 총점, 평균, 최고, 최저
				int sum = 0; // 총점
				double avg = 0; // 평균
				int max, min; // 최고, 최저 점수
				max = min = scores[0];
				
				for(int i : scores) {
					sum += i;
					if(i > max) max = i;
					if(i < min) min = i;
					
				}
				avg = (double)sum / scores.length;
				System.out.println("총점 : " + sum);
				System.out.printf("평균 : %.1f %n",  avg);
				System.out.println("최고 : " + max);
				System.out.println("최저 : " + min);
			}else {
				System.out.println("프로그램 종료");
				isRun = false;
			}
			
		}//end while
		
		System.out.println("프로그램 종료");
	}// end main

}





