package a_declaration;

public class StudentExample {

	public static void main(String[] args) {
		Student s1; // 변수 선언 (참조타입)
		s1 = new Student();
		System.out.println("Student class를 참조하여 s1 객체 생성 :" +s1);
		Student s2 = new Student();
		System.out.println("Student class를 참조하여 s2 객체 생성 :" +s2);
		System.out.println(s1 == s2); // false
		
		Teacher t1 = null;
		// 다른 타입이 들어오는 걸 컴파일러가 막고 있음
		// t1 = new Student();
		t1 = new Teacher();
		
		Teacher t2 = new Teacher();
		System.out.println(t1 == t2); // false
	}
}









