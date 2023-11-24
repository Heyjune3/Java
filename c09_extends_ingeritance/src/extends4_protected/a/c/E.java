package extends4_protected.a.c;

import extends4_protected.a.A;

// 같은 패키지 == 패키지에 정의되어 있는 이름(명)이 똑같애야 함.

// class의 package명이 동일해야 같은 package로 인식
public class E {
	
	A a = new A();
	
	public E() {
		a.a = 100;		// public
		// a.b = 200;		// protected
	}

}
