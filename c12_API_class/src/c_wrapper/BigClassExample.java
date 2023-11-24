package c_wrapper;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.processing.SupportedSourceVersion;

public class BigClassExample {

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		BigInteger bi = new BigInteger(
			"10000000000000000000000000000000000000000000000000000"
		);
		
		System.out.println(bi.toString());
		System.out.println(bi.intValue());
		
		BigInteger bi2 = new BigInteger("123456789000");
		System.out.println(bi2);
		
		BigInteger result = new BigInteger("0");
		
		// 더하기
		result = bi.add(bi2);
		System.out.println("add result : "+ result);
		
		//빼기
		result = bi.subtract(bi2);
		System.out.println("substract result : "+result);
		
		// 곱하기
		result = bi.multiply(bi2);
		System.out.println("multiply result : "+result);
		
		// 나누기
		result = bi.divide(bi2);
		System.out.println("divide result : "+result);
		
		double d = 3.14159264452316549453219465321231189632122222222222216548965121;
		System.out.println(d);
		
		java.math.BigDecimal bd = new BigDecimal(
			"1.66666666666666666666666666666666666666666666666"
		);
		
		BigDecimal bd2 = new BigDecimal(
			"2.02222222222222222222222222221"
		);
		System.out.println(bd.multiply(bd2));
		
	}

}











