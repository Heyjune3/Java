package f09_object.serializable;

import java.io.Serializable;

public class Person implements Serializable{
	
	// class Person에 노란 줄 지우기
	// 버전 UID를 파일에 저장되어져 있는 값을 사용하는 파일과 같게 바꾸기 6328165541094285911
	// Input과 Output의 UID 만 같으면 실행가능 
	// == SerializeInputExample 파일도 똑같이 실행가능
	private static final long serialVersionUID = 6328165541094285911L;

	public static String nation;
	
	private String name;
	private int age;
	private String id;
	// transient : 직렬화에서 제외
	transient private String pw;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "nation = "+Person.nation+", Person [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}
	
	
	
}
