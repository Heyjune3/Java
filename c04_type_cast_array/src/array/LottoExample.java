package array;

import java.util.Scanner;

/**
 * 1등이 6개 일치
 * 2등이 5개 일치 + bonus 숫자 일치
 * 3등이 5개 일치
 * 4등이 4개 일치
 * 5등이 3개 일치
 */
public class LottoExample {

	public static void main(String[] args) {
		// 1 ~ 45까지의 랜덤한 숫자 6개
		// 난수 추출
		// 0 ~ 0.9999999999999999999999999
		// 0이상 1미만의 실수를 전달.
		double random = Math.random();
		System.out.println(random * 45);
		int number = (int)(random * 45) + 1;
		System.out.println(number);

		
		// 당첨 번호를 저장할 배열
		int[] lotto = new int[6];
		int count = 0;
		for(int i = 0; i < lotto.length; i++ ) {
			count++;
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				// 중복 제거
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
//		 System.out.println(count);
		
		// 정렬
		// 3 38 16 18 13 15 
		/*
		int temp = lotto[2];
		lotto[2] = lotto[1];
		lotto[1] = temp;
		*/
		// 오름차순 정렬
		int temp = 0;
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				// 앞에 있는 값이 더 클 경우
				// 큰수를 뒤로 배치한다.
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		} //end sorting
		
		// 행운 번호
		int bonus = (int)(Math.random()*45) + 1;
		for(int i = 0; i < lotto.length; i++) {
			if(bonus == lotto[i]) {
				bonus = (int)(Math.random()*45) + 1;
				// i 의 값을 -1로 할당 하여 0번째 인덱스 부터 다시 비교
				i = -1;
			}
		}
		
		
		/*
		for(int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
		*/
		
		// 내 로또 번호
		int[] myLotto = new int[6];
		
		boolean isRun = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(isRun) {
			System.out.println("===============================");
			System.out.println("1.로또구입|2.번호확인|3.당첨확인|4.종료");
			System.out.println("===============================");
			System.out.println("선택할 항목의 번호를 입력하세요 > ");
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				System.out.println("1. 로또 구입");
				a : for(int i = 0; i < myLotto.length; i++) {
					System.out.println((i+1)+"번째 번호 입력 > ");
					int num = sc.nextInt();
					if(num < 1 || num > 45) {
						System.out.println("1 ~ 45 까지의 번호만 입력");
						i--;
						continue;
					}
					
					// 중복 확인
					for(int j = 0; j < i; j ++) {
						if(num == myLotto[j]) {
							// 중복
							System.out.println("이미 등록된 번호입니다.");
							i--;
							continue a;
						}
					}
					myLotto[i] = num;
				} // end for
				System.out.println("번호 등록 완료");
			}else if(selectNo == 2) {
				System.out.println("번호 확인!");
				for(int i : myLotto) {
					System.out.print("["+i+"]");
				}
				System.out.println();
			}else if(selectNo == 3) {
				System.out.println("당첨 확인");
				System.out.print("당첨번호:");
				for(int i : lotto) {
					System.out.printf("[%d]",i);
				}
				System.out.println(" 보너스 번호 : ["+bonus+"]");
				System.out.print("나의번호:");
				for(int i : myLotto) {
					System.out.printf("[%d]",i);
				}
				System.out.println();
				
				// 일치하는 번호 개수 확인
				int cnt = 0;	//일치하는 번호의 개수를 저장할 변수
				boolean isBonus = false;
				for(int i = 0; i < myLotto.length; i++) {
					for(int j = 0; j < lotto.length; j++) {
						if(myLotto[i] == bonus) {
							isBonus = true;
						}
						if(myLotto[i] == lotto[j]) {
							cnt++;
						}
					}
				}
				System.out.println("일치하는 번호 개수는 : " + cnt);
				if(cnt == 6) {
					System.out.println("1등입니다.");
				}else if(cnt == 5) {
					System.out.println("2~3등");
					if(isBonus) {
						System.out.println("2등입니다.");
					}else {
						System.out.println("3등입니다.");
					}
				}else if(cnt == 4) {
					System.out.println("4등입니다.");
				}else if(cnt == 3) {
					System.out.println("5등입니다.");
				}else {
					System.out.println("꽝!!!!");
				}
			}else {
				System.out.println("종료");
				isRun = false;
			}
			
		}// end while
		
	} // end main

}












