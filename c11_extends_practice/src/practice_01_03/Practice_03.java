package practice_01_03;

public class Practice_03 {

	public static void main(String[] args) {
		// Code 작성
		int[] numbers = new int[10];
		System.out.print("최초의 리스트 : ");
		for(int i = 0; i < numbers.length; i++) {
			// 난수 삽입 및 출력
			numbers[i] = (int)(Math.random() * 100)+1;
			System.out.print(numbers[i] + " ");
			
			for(int j=0; j < i; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}// 정렬
		}// end for
		
		// 정렬된 리스트 출력
		System.out.println();
		System.out.print("정렬된 리스트 : ");
		for(int i : numbers) {
			System.out.print(i+" ");
		}
		/*int[] numbers = new int[10];
//		int number = (int)(Math.random() * 100);
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100);
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}				
		}
		System.out.print("최초의 리스트 :");
		for(int nm : numbers) {
			System.out.print(" " + nm);
		}
		int sort = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < i; j++) {
				if(numbers[i] > numbers[j]) {
					sort = numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=sort;
				}
			}
		}System.out.print("\n" + "정렬된 리스트 :");
		for(int nm : numbers) {
			System.out.print(" " + nm);
		}*/
		
		
	} // end main
} // end