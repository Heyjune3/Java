package c3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("최기근", 100);
		map.put("이준호", Integer.valueOf(59));
		map.put("김규민", 97);
		map.put("박진성", 70);
		System.out.println(map);
		// key값이 중복이 발생했을 시 대체
		map.put("이준호", 89);
		System.out.println(map);
		
		int score = map.get("최기근");
		System.out.println("최기근 점수 : " + score);
		int size = map.size();
		System.out.println("저장된 entry 크기 : " + size);
		
		// get으로 가져올 때 값이 없으면 map = null 을 가져옴
		// int 같이 null을 가져올 수 없는 값일 시 Nullpointerexcetion
		// score = map.get("이기근");
		Integer score2 = map.get("이기근");
		System.out.println(score2);
		
		// 동일한 key값의 entry 삭제
		map.remove("이준호");
		System.out.println(map.size());
		System.out.println(map);
		
		// map.containsKey key 값 존재 여부
		boolean isChecked = map.containsKey("이준호");
		System.out.println("key 존재 : " + isChecked);
		
		isChecked = map.containsValue(100);
		System.out.println("value : " + isChecked);
		
		// java.util.Map.Entry import
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		// java.util.Iterator
		Iterator<Entry<String,Integer>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		   }
			System.out.println(map);
			System.out.println("===================");
			
			// key 묶음
			Set<String> keySet = map.keySet();
			for(String key : keySet) {
				int value = map.get(key);
				System.out.printf("key : %s = value : %d,",key,value);					
			}
			System.out.println();
			
			// value 묶음
			Collection<Integer> values = map.values();
			for(Integer value : values) {
				System.out.print(value + ", ");
			}
			System.out.println();
			
			map.clear();		// 전체 entry 삭제
			System.out.println(map.size());
			isChecked = map.isEmpty();
			System.out.println("isEnpty : " + isChecked);
			
			System.out.println("========================================");
			Map<String, Integer> linkedMap = new LinkedHashMap<>();
			linkedMap.put("최기근", 100);
			linkedMap.put("김유신", 99);
			linkedMap.put("제임스 고슬링", 98);
			linkedMap.put("리누스토발즈", 99);
			linkedMap.put("빌게이츠", 100);
			System.out.println(linkedMap);
	}

}









