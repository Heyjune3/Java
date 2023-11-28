package exam03;

import java.util.Arrays;

public class GenericMethod {

	/*
	 * printArray method 정의 
	 * 
	 */
	
public static <T> void printArray(T[] t){
	System.out.println(Arrays.toString(t));
}
	
	public static void main(String[] args) {
		Integer[] iArray = {10,20,30,40,50};
		Double[] dArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		Character[] cArray = {'K','O','R','E','A'};
		
		// 컴파일러가 GenericMethod.<Integer>를 알아서 맞춰주기때문에 생략가능 
		GenericMethod.<Integer>printArray(iArray); 
		printArray(dArray);
		printArray(cArray);
	}
	
}
