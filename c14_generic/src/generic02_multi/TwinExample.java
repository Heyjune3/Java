package generic02_multi;

public class TwinExample {
	
	public static void main(String[] args) {
		/*
		* 제네릭 타입을 명시하지 않으면 Object type이 된다.
		Twin twin = new Twin();
		twin.setKind(new Car());
		twin.setModel(new TV());
		*/
		Twin<Tv, String> tvTwin = new Twin<>();
		Tv tv = new Tv();
		tvTwin.setKind(tv);
		tvTwin.setModel("LG 스마트 TV");
		System.out.println(tvTwin);
		
		Twin<Car, Integer> car = new Twin<Car, Integer>();
		car.setKind(new Car());
		car.setModel(520);
		System.out.println(car);
	}
}
