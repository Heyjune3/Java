package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// Printer printer = new Printer(); 안됨
		Printer printerA = Printer.getInstance();
		System.out.println(printerA);
		
		Printer printerB = Printer.getInstance();
		System.out.println(printerB);
	}

}
