package practice;

import java.util.Scanner;

public class TheaterReserveRowColumn {

	public static void main(String[] args) {
		
		byte[] seats[] = new byte[10][10];
		
		// seats[1][2] = 1;
		/*
		for(byte[] line : seats) {
			//System.out.print(line + "-");
			for(byte column : line) {
				if(column == 0) {
					System.out.print("[□]");
				}else {
					System.out.print("[■]");
				}
				// System.out.printf("[%d]",column);
			}
			System.out.println();
		}
		*/
		// 예약 프로그램 종료 flag
		boolean isRun = true;
		// 사용자에게 예약할 좌석을 입력
		Scanner sc = new Scanner(System.in);
		
		while(isRun) {
			System.out.println("           [SCREEN]");
			// 열번호 출력
			for(int i = 0; i < seats.length; i++) {
				System.out.print("["+(i+1)+"]");
			}
			System.out.println("[열]");
			// 좌석표시
			for(int i = 0; i < seats.length; i++) {
				for(int j = 0; j < seats[i].length; j++) {
					if(seats[i][j] == 0) {
						System.out.print("[□]");
					}else {
						System.out.print("[■]");
					}
				}
				System.out.println("["+(char)(i+65)+"행]");
				
			} // 상영관 그리기 완료 - 좌석표시 끝
			System.out.println("예약하실 좌석의 행이름을 입력해주세요(A~J)");
			String s =sc.next();
			System.out.println(s);
			
			char inputRow = s.charAt(0);
			System.out.println(inputRow);
			
			System.out.println("선택하신 행 이름은 : " + inputRow);
			// 열 번호
			// 0~9
			int row = inputRow - 65;
			System.out.println("예약하실 좌석의 열번호를 입력해주세요.(1-10");
			int columnNum = sc.nextInt();
			
			if(columnNum < 1 || columnNum > 10 ) {
				System.out.println("사용할 수 없는 열번호 입니다");
				continue;
			}
			// 정상적인 행과 열을 입력
			System.out.printf("선택하신 좌석은 %s행 %d열입니다. %n",inputRow,columnNum);
			
			// 예약 진행
			// 행 인덱스 번호 : row
			// 열 인덱스 번호 : columnNum -1;
			
			System.out.println("예약을 완료 하시겠습니까? y/n");
			String selected = sc.next();
			
			// equals(==) method를 사용해 저장한 문자열이 같은지를 비교
			if(selected.equals("Y") || selected.equals("y")) {
				// 중복 예약 확인
				if(seats[row][columnNum-1] != 0) {
					// 이미 예약된 자리
					System.out.println("이미 예약이 완료된 좌석입니다.");
					continue;
				}
				seats[row][columnNum - 1] = 1;
				System.out.println("예약이 완료되었습니다.");
			}else {
				System.out.println("예약이 취소되었습니다.");
			}
		} // end while
	} // end main
}





















