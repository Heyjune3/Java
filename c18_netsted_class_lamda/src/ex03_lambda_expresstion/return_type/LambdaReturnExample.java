package ex03_lambda_expresstion.return_type;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface
interface MyInterface{
	int method(int x, int y, String s);
}

public class LambdaReturnExample {

	public static void main(String[] args) {
		MyInterface i = new MyInterface() {
			@Override
			public int method(int x, int y, String s) {
				System.out.print(s);
				return x * y;
			}
		};
		
		int result = i.method(10, 5, "곱셈연산");
		System.out.println("result : " + result);
		
		i =(a,b,s)->{
			System.out.println(s+"-");
			return a + b;
		};
		result = i.method(10, 20, "덧셈 연산");
		System.out.println("result : " + result);
		
		System.out.println("-------------------");
		
		Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// 오름차순
				return o1 - o2;
			}
		});
		
		set = new TreeSet<>((o1, o2)->{
			// 내림차순
			return o2 - o1;
		});
		
		set.add(10);
		set.add(90);
		set.add(50);
		System.out.println(set);
	}

}
