package f_object_array;

public class Student {

	int number;		// 학번
	String name;	// 학생이름
	int score;		// 점수
	
	// 생성자의 오버로딩
	// StudentManagement에 line 67을 수행하기 위해 기본생성자 생성
	Student(){}
	
	Student(int number, String name, int score){
		this.number = number;
		this.name = name;
		this.score = score;
	}
	
	String getInfo() {
		return "number : " + number + ", name : " + name + ", score : " + score;
	}
	
}
