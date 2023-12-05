package f05_reader_writer;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {

	public static void main(String[] args) {

		InputStream is = System.in;
		
		try {
			while(true) {
				int i = is.read();  // 바이트 단위로 읽기
				System.out.println(i);
				if(i == 'q') break;
				System.out.println("입력받은 값은 : " + (char)i);
/*
A
65
입력받은 값은 : A
13
입력받은 값은 :  // Enter키 

10
입력받은 값은 : 
*/
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
