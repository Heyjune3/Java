package f_object_array;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean[] koreans = new Korean[3];
		//   0  	1 	   2
		// [null] [null] [null]
		System.out.println(koreans);
		for(int i = 0; i < koreans.length; i++) {
			System.out.println(i+":"+koreans[i]);
		}
		
		Korean k1 = new Korean();
		koreans[0] = k1;
		// [k1] [null] [null]
		k1.name = "이준호";
		k1.birth = "960730";
		k1.age = 28; 
		System.out.println(koreans[0].name);
		System.out.println(koreans[0].birth);
		System.out.println(k1.age);
		
		koreans[1] = new Korean();
		koreans[1].name = "이순신";
		koreans[1].birth = "1678";
		koreans[1].age = 356;
		
		// NullPointerException
		for(Korean k : koreans) {
			// NullPointerException
			// for로 전체를 돌다가 마지막 koreans 배열의
			// 3번째 항목이 null이기 때문에
			// NullPointerException 디버그 발생
			if(k != null) {
			System.out.println(k.nation);
			System.out.println(k.name);
			System.out.println(k.birth);
			System.out.println(k.age);
			System.out.println("=====================");
			}
		}	
	}
}






