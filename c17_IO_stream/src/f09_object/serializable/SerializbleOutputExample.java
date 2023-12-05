package f09_object.serializable;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializbleOutputExample {

	public static void main(String[] args) {
		
		Person.nation = "대한민국";
		File file = new File("person.dat");
		
		ObjectOutputStream oos = null;
		
		// == StreamCorruptedException 에러 발생 if함수
		try {
			// 파일이 존재하지 않거나 파일의 길이가 0 인 경우
			if(!file.exists() || file.length() == 0) {
				// writeStreamHeader 정보 추가
				oos = new ObjectOutputStream(
						new BufferedOutputStream(
							new FileOutputStream(file,true)
				)
			);
			}else {
				// 등록된 header 정보가 존재 할 시에는 Header정보 추가 하지 않음
				oos = new ObjectAppendStream(
						new BufferedOutputStream(
								new FileOutputStream(file,true)
					));
			}
			
			Person p = new Person();
			p.setName("이순신");
			p.setAge(500);
			p.setId("id001");
			p.setPw("12345");
			oos.writeObject(p);
			
			Person p1 = new Person();
			p1.setName("최기근");
			p1.setAge(26);
			p1.setId("id002");
			p1.setPw("54321");
			oos.writeObject(p1);
			
			oos.flush();
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}













