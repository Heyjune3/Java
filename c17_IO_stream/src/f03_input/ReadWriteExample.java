package f03_input;

import java.io.*;

public class ReadWriteExample {

	public static void main(String[] args) {
		
		File file = new File("src\\f03_input\\ReadExample.java");
		System.out.println(file.length());
		
		try {
			InputStream is = new FileInputStream(file);
			
			int data;
			
			OutputStream os = System.out;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			os.flush();
			os.close();
			
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
