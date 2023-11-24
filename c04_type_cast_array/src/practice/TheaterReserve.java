package practice;

import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		
		final int size = 10;
		
		int[] seats = new int[size];
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------------");
			for(int i = 0; i < seats.length; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n-------------------------");
			for(int i : seats) {
				System.out.print(i+" ");
			}
			System.out.println("\n-------------------------");
			System.out.println("원하시는 좌석번호를 입력하세요.(종료는 -1)");
			int seatNum = sc.nextInt();
			System.out.println("선택하신 번호는 : " + seatNum);
			/*
			 아래는 좌석배치를 하는 애플리케이션입니다.
			 사용자에게 번호를 입력 받아 해당 번호의 위치에 예약을 할 수
  			 있도록 소스 코드를 작성 하세요(0 : 빈자리 , 1 : 예약완료 자리) 
			 */
			if(seatNum == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			// 입력한 좌석 번호가 1보다 작거나 10보다 크면
			if(seatNum < 1 || seatNum > 10) {
				System.out.println("선택할 수 없는 자리입니다.");
				continue;
			}
			
			// seatNum == 1 이면 확인할 인덱스 번호는 0
			// seatNum == 10 이면 확인할 인덱스 번호는 9
			if(seats[seatNum-1] == 0) {
				seats[seatNum-1] = 1;
				System.out.println("예약이 완료 되었습니다.");
			}else {
				System.out.println("이미 예약이 완료된 자리입니다.");
			}
			
		} // end while
		
	} // end main
	
	
	
	
	
	
	
	
	
}
