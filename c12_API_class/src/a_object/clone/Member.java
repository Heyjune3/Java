package a_object.clone;

import java.util.Arrays;

public class Member implements Cloneable{
	
	String name;
	int age;
	int[] scores;
	Car car;
	
	// 기본생성자
	public Member() {}

	// 생성자
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	public Member getCloned() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();
		return cloned;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member)super.clone(); // 얕은 복제
		// scores 새로운 공간 생성
		int[] scores = new int[cloned.scores.length];
		for(int i = 0; i < cloned.scores.length; i++) {
			scores[i] = this.scores[i];
		}
		cloned.scores = scores;
		Car car = new Car(this.car.model);
		cloned.car = car;
		return cloned;
	}

	// toString
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + ", car=" + car + "]";
	}
	
	
	
	
}
