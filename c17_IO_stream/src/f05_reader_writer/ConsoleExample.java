package f05_reader_writer;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("아이디 : ");
		String id = console.readLine();
		System.out.println("비밀번호 : ");
		char[] password = console.readPassword();
		System.out.println("------------------");
		String strPassword = new String(password);
		System.out.println("id : " + id);
		System.out.println("pass : " + strPassword);
		/*
		  ConsoleExample.java 우클릭 export Runable JAR file
		  Launch configuration에서 ConsoleExample클래스 찾고 
		  Browse..에서 바탕화면 선택 후 Finish
		  바탕화면에 Console.jar 파일 생성 확인 후
		  바탕화면에 shift + 우클릭 후 파워셀 실행
		  
PS C:\Users\admin\Desktop> java -jar console.jar
아이디 :
kfd45674
비밀번호 :

------------------
id : kfd45674
pass : 12345
PS C:\Users\admin\Desktop>
		 */
	}

}
