package f09_object.serializable;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeInputExample {

	public static void main(String[] args) {

		try {
			ObjectInputStream ois 
				= new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream("person.dat")));
			
			// Person을 저장하는 list라는 걸 제네릭으로 명시
			List<Person> list = new ArrayList<>();
			// [Object Write Header][Person][Person]
			// SerializableOutputExample을 재 실행 시키고 현재 파일을 다시 실행 시키면
			// [Object Write Header][Person][Person][Object Write Header][Person][Person] 중복
			// == StreamCorruptedException 에러 발생
			// 재실행 시 Header 를 가져오지 못하게 만들어야 함
			while(true) {
				try {
					Person p = (Person)ois.readObject();
					list.add(p);	// 리스트에 Person 정보 추가
					// EOFException - End Of File
					// ObjectInputStream - 더 이상 읽을 객체가 존재하지 않으면 EOFException 발생
				} catch (EOFException e) {
					System.out.println("모든 객체를 다 읽음");
					break;
				}
			} // end while
			
			System.out.println(list);
			ois.close();
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		
	}

}














