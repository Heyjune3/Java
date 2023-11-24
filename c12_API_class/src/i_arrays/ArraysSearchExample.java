package i_arrays;

import java.util.Arrays;

public class ArraysSearchExample {

	public static void main(String[] args) {
		// search - 지정된 값이 배열의 몇번째 index에 존재하는지 검색
		int[] scores = {1, 10, 5, 7, 9};
		//				 0  1  2  3  4
		//				-1 -2 -3 -4 -5  == 마지막으로 탐색한 위치 -6
		// 2진탐색트리 = 중간에서 부터 반씩 쪼개서 찾아나감
		// = 찾을 값이 10일 때 중간 값 5보다 크면 인덱스 2와 인덱스 4를 더해 2로 나눠서 찾아봄
		// = 그래도 못찾으면 위로 올라가 인덱스 3과 인덱스 4를 더한 후 2로나눠 값을 찾아봄
		// = 없으면 결국 음수로 넘어감 그래도 없으면 마지막으로 탐색한 위치를 반환 == -4
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 10);
		System.out.println("찾은 인덱스 : " + index);
		index = Arrays.binarySearch(scores, 8);
		System.out.println("찾은 인덱스 : " + index);
	}

}
