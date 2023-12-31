package a_object.toString;

class Person{
	String name;
	int height;
	double weight;
	
	// alt + s + a : 생성자 
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// alt + s + s + s : CodeTree == 부모요소의 생성자를 자식요소가 의미있게 사용할 수 있게 만듬
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	/*
	// alt + s + v : override
	@Override
	public String toString() {
		return super.toString();
	}
	*/
}

public class ToStringExample {

	public static void main(String[] args) {
		Object obj = new Object();
		
		String result = obj.toString();
		System.out.println(result);
		System.out.println(obj);
		
		Person p = new Person("이준호", 175, 60);
		System.out.println(p);
	}

}
