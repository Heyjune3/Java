package a_object.hashcode;

import java.util.HashSet;

public class KeyExample {

	public static void main(String[] args) {
		
		Key key1 = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		// hashCode는 기본적으로 정수값으로 나타냄
		System.out.println("key1 : " + key1.hashCode());
		System.out.println("key2 : " + key2.hashCode());
		System.out.println("key3 : " + key3.hashCode());
		
		// 나중에 배울꺼임 ㅇㅇ
		HashSet<Key> set = new HashSet<>();
		set.add(key1);
		set.add(key2);
		set.add(key3);
		
		System.out.println(set);
	}

}
