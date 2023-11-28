package c2_set;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<>();
		s1.add("A");
		//s1.add(0,"B"); 순서가 없음 = index 번호도 없음
		s1.add("D");
		s1.add("B");
		s1.add("C");
		
		boolean isAdd = s1.add("C");
		System.out.println(s1);
		System.out.println("isAdd : " + isAdd);
		
		// 반복자 내부에 저장하고 있는 데이터를 token 처럼 꺼내옴
		Iterator<String> iterator = s1.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println(s1.contains("B"));
		
		Set<String> s2 = new HashSet<>();
		s2.add("A");
		s2.add("D");
		s2.add("E");
		System.out.println(s2);
		
		// s3 == s1 : s1이 가지고 있는 값을 가지고 새로 생성. 주소값이 다름
		Set<String> s3 = new HashSet<>(s1);
		System.out.println(s3);
		System.out.println(s3 == s1);
		
		// s3 : A B C D
		// s2 : A D E
		// 중복을 제외한 합집합
		s3.addAll(s2);
		System.out.println(s3);
		
		Set<String> s4 = new HashSet<>(s1);
		// s4 : A B C D
		// s2 : A D E
		// 교집합
		s4.retainAll(s2);
		System.out.println("s4 : " + s4);
		
		boolean isDeleted = s1.remove("A");
		System.out.println("isDeleted : " + isDeleted);
		System.out.println(s1);
		
		for(String s : s1) {
			System.out.println(s + " ");
			// remove안됨
			// BCD가 있는 3개 항목을 순회하려하는데
			// 밑의 remove로 인해 2개가 되면 오류
			// ConcurrentModificationException
			// 항목의 갯수가 변경되는 활동을 반복문 내에서 하면 안됨
			if(s.equals("B")) {
				s1.remove(s);
			}
		}
	}

}



















