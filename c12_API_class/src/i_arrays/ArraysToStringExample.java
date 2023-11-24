package i_arrays;

import java.util.Arrays;

public class ArraysToStringExample {
/**
 * java.utill.Arrays utility class
 * 
 * 배열을 쉽게 다룰 수 있도록 기능을 정의해놓은 class
 * */
	public static void main(String[] args) {
		int[] scores = {99, 10, 97, 96, 98};
		System.out.println(scores);
		for(int i : scores) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		String result = Arrays.toString(scores);
		System.out.println(result);
	}
		
}
