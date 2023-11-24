package abstract_base;

public abstract class Animal { // 추상클래스
	
	String Kind;		// 분류
	
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound();
		

}
