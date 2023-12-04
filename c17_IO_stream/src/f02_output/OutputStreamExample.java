package f02_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamExample {

	public static void main(String[] args) {
		
		String path = "C:\\Temp\\file2.txt";
		
		// alt + s + w
		try {
			// 출력하면 덮어써짐
			// OutputStream os = new FileOutputStream(path);
													 // append 이어쓴다
			OutputStream os = new FileOutputStream(path,true);
			String s = "한글";
			byte[] strs = s.getBytes();
			System.out.println(Arrays.toString(strs));
			/*
			for(int i = 0; i < strs.length; i++) {
				// 1byte씩 출력
				os.write(strs[i]);
			}
			*/
			// 매개변수로 넘겨받은 모든 byte배열을 출력
			os.write(strs, 3, 3);
			
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
