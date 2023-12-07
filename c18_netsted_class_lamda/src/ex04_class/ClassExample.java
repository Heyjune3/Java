package ex04_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ClassExample {

	public static void main(String[] args) {
		
		// Class의 설계 정보를 저장하는 객체 Class
		// 1. Object의 정적멤버인 class keyword를 이용하여 객체 설계정보 획득
		Class<Person> pClass1 = Person.class;
		// class의 이름 정보(Package를 포함하는 class의 전체 이름)
		System.out.println(pClass1.getName());
		
		
		Person person = new Person();
		System.out.println(person);
		
		// 2. Object의 인스턴스 멤버 메소드인 getClass()를 이용하여 인스턴스 설계 정보 획득
		Class<Person> pClass2 = (Class<Person>) person.getClass();
		System.out.println(pClass2.getName());
		
		try {
			// 3. class의 이름 정보를 이용하여 설계 정보 획득
			Class<Person> pClass3 = (Class<Person>) Class.forName("ex04_class.Person");
			
			System.out.println("----------------");
			System.out.println(pClass3.getName());					// 풀 네임
			System.out.println(pClass3.getSimpleName());			// class 이름
			System.out.println(pClass3.getPackage().getName()); 	// package 이름
			
			// class에 정의된 Field(전역변수) 정보
			// java.lang.reflect
			// Declared - 선언됨
			Field[] fields = pClass3.getDeclaredFields();
			System.out.println("Fields ===============");
			for(Field f : fields) {
				int modifier = f.getModifiers();
				System.out.print(modifier+"\t");
				System.out.print(Modifier.toString(modifier)+"\t");
				System.out.print(f.getType().getSimpleName()+"\t");
				System.out.println(f.getName());
				System.out.println("---------------------------");
			}
			
			// 생성자 정보
			System.out.println("Constructors ==================");
			// java.lang.reflect
			Constructor<?>[] cons = pClass3.getDeclaredConstructors();
			for(Constructor<?> c : cons) {
				System.out.print(Modifier.toString(c.getModifiers())+"\t");
				System.out.print(c.getName()+"(");
				
				
				// 생성자의 매개변수 타입 및 이름
				Class<?>[] types = c.getParameterTypes();
				Parameter[] name = c.getParameters();
				for(int i = 0; i < types.length; i++) {
					System.out.print(types[i].getName() + " " + name[i].getName());
				}
				System.out.println(")");
			}
			
			// method 정보
			System.out.println("methods =====================");
			// java.lang.reflect.Method
			Method[] methods = pClass3.getDeclaredMethods();
			for(Method m : methods) {
				System.out.println(m);
				System.out.println("-----------------------");
				System.out.print(Modifier.toString(m.getModifiers())+"\t");
				System.out.print(m.getReturnType()+"\t"+m.getName());
				System.out.print("(");
				Class<?> [] types = m.getParameterTypes();
				Parameter[] params = m.getParameters();
				for(int i = 0; i < types.length; i++) {
					System.out.print(" "+ types[i].getName()+" ");
					if(params[i].isNamePresent()) { // 파라미터 이름을 저장하고 있으면 true
						System.out.println(params[i].getName());
					}
				}
				System.out.println(")");
			}
			
			System.err.println("Class를 이용하여 instance 생성");
			Class<Person> clazz = (Class<Person>) Class.forName("ex04_class.Paerson");
			Person p = (Person)clazz.newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// 객체 설계 정보는 있으나 객체 생성이 불가능 할 때 발생하는 오류
			// 추상 class, interface 이러한 설계 정보를 가진 class는
			// 자체 만으로 객체 생성이 불가하니 생성할 수 없다고 발생하는 예외
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}












