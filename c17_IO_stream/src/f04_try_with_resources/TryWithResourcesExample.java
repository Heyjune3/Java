package f04_try_with_resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		String path = "c:\\Temp\\file2.txt";
		try(
				InputStream is = new FileInputStream(path);
				FileOutputStream os = new FileOutputStream(path);
				) {
			int data;
			while((data = is.read()) != -1) {
				System.out.println(data);
			}
			is.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
