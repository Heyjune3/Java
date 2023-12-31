package f_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String text = "회원 ID : {0} \n회원이름 : {1} \n전화번호 : {2}";
		System.out.println(text);
		System.out.println();
		
		String result = MessageFormat.format(text, "id001", "이준호", "01054462217");
		System.out.println(result);
		System.out.println();
		
		String text2 = "학번은 {0}, 이름은 {1}, 전화번호는 {2}";
		// 정수타입도 넣고 String타입도 넣고
		Object[] arguments = {1, "이준호", "01054462217"};
		String result2 = MessageFormat.format(text2, arguments);
		System.out.print(result2);
		System.out.println("\n");
		
		MessageFormat format = new MessageFormat(text2);
		String result3 = format.format(arguments);
		System.out.println(result3);
	}

}
