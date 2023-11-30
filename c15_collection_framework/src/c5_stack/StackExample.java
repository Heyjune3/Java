package c5_stack;

import java.util.Stack;

class Coin{
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class StackExample {

	public static void main(String[] args) {
		// Stack - LIFO(Last In First Out)
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		System.out.println(coinBox.size());	 // 4
		
		// peek = Stack에서 꺼내올 다음 동전이 얼마짜리인지 확인 
		Coin coin = coinBox.peek();
		System.out.println("value : " + coin.getValue());  // value : 100
		System.out.println(coinBox.size());  // 4
		
		boolean isEmpty = coinBox.isEmpty();
		System.out.println("코인박스가 비어있는가? - " + isEmpty);  // 코인박스가 비어있는가? - false
		
		// coinBox에 Coin이 존재하는 한...
		while(!coinBox.isEmpty()) {
			// coinBox에서 동전을 꺼내 온다.
			coin = coinBox.pop();
			System.out.println(coin.getValue()+"원");
			System.out.println(coinBox.size());
		}
	}

}




















