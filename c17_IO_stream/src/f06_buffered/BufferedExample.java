package f06_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedExample {
	
	// 보조스트림 Buffer와의 시간 차이
	// 성능향상 보조스트림으로 출력 시간 줄이기(파일 크기가 클수록 좋음) <-> (너무 작으면 쓰지 말 것)
	
	public static void main(String[] args) throws IOException {

		String originalPath = "C:\\Temp\\cat1.jpg";
		File originalFile = new File(originalPath);
		FileInputStream fis = new FileInputStream(originalFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		String copyPath = "C:\\Temp\\dir\\copy.jpg";
		File copyFile = new File(copyPath);
		FileOutputStream fos = new FileOutputStream(copyFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		
		long startTime = 0, endTime = 0;
		
		int data;
		startTime = System.nanoTime();
		while((data = fis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		endTime = System.nanoTime();
		System.out.printf("fos file : %d ns %n",(endTime - startTime));
		
		startTime = System.nanoTime();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		endTime = System.nanoTime();
		System.out.printf("bos file : %d ns %n",(endTime - startTime));
		
		bos.close();
		bis.close();
		
		System.out.println("copy 완료");
		
	}

}











