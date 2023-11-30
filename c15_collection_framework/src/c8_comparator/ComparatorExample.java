package c8_comparator;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// Fruit 과일을 정렬할 비교 기준을 정의한 클래스
		DescendingComparator com = new DescendingComparator();
		TreeSet<Fruit> treeSet = new TreeSet<>(com);
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("딸기",1500));
		treeSet.add(new Fruit("수박",10000));
		System.out.println(treeSet);
		
	}

}
