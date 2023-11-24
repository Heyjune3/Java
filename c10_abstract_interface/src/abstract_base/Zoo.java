package abstract_base;

public class Zoo {

	static void animalSound(Animal animal) {
		animal.breath();
		animal.sound();
	}
	
	public static void main(String[] args) {
		// 실체화 되지 않은 기능을 가지고 있는 추상클래스는
		// 추상클래스만으로 객체 생성이 불가.
		//Animal animal = new Animal();		// 안됨 abstract 때문 인스턴스가 정의되지 않음
		
		Dog dog = new Dog();
		dog.breath();
		dog.Kind = "Jindo";
		dog.sound();
		
		Cat cat = new Cat();
		cat.Kind = "Siamese Cat";
		cat.breath();
		cat.sound();
		
		animalSound(dog);
		animalSound(cat);
		
		Animal navi = new Cat();
		navi.Kind = "시고르자브르종";
		animalSound(navi);
		
		// 익명 구현 객체
		// 이름을 가지지 못한 재생산이 불가능한 객체
		Animal tiger = new Animal() {
			String name;
			public void sound() {
				System.out.println(name + " : 어흥");
			}
		};
		
		// 익명 구현 객체에서 내부에 지정한 클래스는 외부엔 안됨
		// tiger.name = "얼룩이";
		tiger.Kind = "호랑이";
		animalSound(tiger);
		
	}

}




