package c4_tree;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "최기근");
		map.put(15, "임꺽정");
		map.put(88, "박종현");
		map.put(97, "박진성");
		map.put(80, "엄수연");
		System.out.println(map);  // {15=임꺽정, 80=엄수연, 88=박종현, 97=박진성, 100=최기근}
		
		// java.util.Map.Entry;
		Entry<Integer, String> entry = null;
		
		entry = map.firstEntry();
		System.out.println("가장 낮은 키 entry : " + entry);  // 15=임꺽정
		
		entry = map.lastEntry();
		System.out.println("가장 높은 키 entry : " + entry);  // 100=최기근
		
		entry = map.higherEntry(90);
		System.out.println("90보다 높은 entry : " + entry);	// 97=박진성
		
		entry = map.lowerEntry(90);
		System.out.println("90보다 낮은 entry : " + entry);	// 88=박종현
		
		entry = map.ceilingEntry(90);
		System.out.println("90이거나 90보다 높은 entry : " + entry);	// 97=박진성
		
		entry = map.floorEntry(90);
		System.out.println("90이거나 90보다 낮은 entry : " + entry);	// 97=박진성
		
		Integer key = map.firstKey();
		System.out.println("첫번째 키 : " + key);  // 15
		

		key = map.lastKey();
		System.out.println("마지막 키 : " + key);  // 100
		
		System.out.println("==============================");
		Map<Integer, String> subMap = map.headMap(80);
		System.out.println(subMap);		// {15=임꺽정}
		subMap = map.subMap(81, 98);
		System.out.println(subMap);		// {88=박종현, 97=박진성}
		subMap = map.tailMap(80);
		System.out.println(subMap);		// {80=엄수연, 88=박종현, 97=박진성, 100=최기근}
	}

}




















