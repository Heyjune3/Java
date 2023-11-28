package exam04;

public class Util {

	/*
		getValue() method 작성	
	*/
	
	public static <K, V> V getValue(Pair<K,V> p, K k){
		if(p.getKey().equals(k)) {
			return p.getValue();
		}
		return null;
	}
	
}
 