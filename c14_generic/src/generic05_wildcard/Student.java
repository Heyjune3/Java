package generic05_wildcard;

public class Student extends Person{
	
	// Person엔 생성자가 지정되어 있으니 
	// Student가 기본생성자만으로는 호출 불가능 
	public Student(String name) {
		super(name);
	}

}
