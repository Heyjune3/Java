package i_arrays;

import java.util.Arrays;

public class ArraysCopyExample {

	public static void main(String[] args) {
		int[] scores = {100, 60, 70, 80, 90};
		System.out.println(Arrays.toString(scores));
		int[] scores2 = new int[scores.length + 1];
		for(int i = 0; i < scores.length; i++) {
			scores2[i] = scores[i];
		}
		System.out.println(Arrays.toString(scores2));
		
		char[] arr1 = {'J','A','V','A'};
		System.out.println(Arrays.toString(arr1));
		
		// Arrays.copyOf(원본배열, 복사할 길이)
		char[] arr2 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOf(arr2, arr2.length + 1);
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = Arrays.copyOf(arr1, arr1.length - 1);
		System.out.println(arr4.length);
		System.out.println(Arrays.toString(arr4));
		
		// J A V A
		// 0 1 2 3
		// Arrays.copyOfRange(원본배열, 시작인덱스, 마지막인덱스 - 1);
		// 배열 보면 인덱스 마지막 번호를 기제할 때 파이썬이랑 똑같이 -1 붙이면 됨
		char[] arr5 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr5));
		
		// System.arraycopy(원본배열, 시작인덱스, 복제배열, 원본배열을 받을 시작인덱스, 복사할 길이);
		char[] arr6 = new char[arr1.length + 1];
		System.arraycopy(arr1, 0, arr6, 1, arr1.length);
		System.out.println(Arrays.toString(arr6));
	}

}






