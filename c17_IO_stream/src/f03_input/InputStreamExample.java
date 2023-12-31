package f03_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			File file = new File("C:\\temp\\file2.txt");
			is = new FileInputStream(file);
			int readByte = 0;
			while(true) {
				// byte 단위로 읽어와서 읽은 byte를 int type으로 반환
				readByte = is.read();
				System.out.println(readByte);
				// EOF == End Of File == -1
				if(readByte == -1) break;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
