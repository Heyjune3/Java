package f_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		
		// @since 1.0 (java 최초출시버전 1.0)
		Date date = new Date();
		System.out.println(date.toString());
		
		// 요즘은 이렇게 사용하지 않고 SimpleDateFormat 사용
		// @deprecated 1.1
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDate();
		System.out.println(year + "년" + month + "월" + day + "일");
		
		// Since 1.1
		// 위의 Date클래스가 복잡해서 만든 새로운 표준 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		String now = sdf.format(date);
		System.out.println(now);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a KK:mm:ss.SSS D");
		now = sdf.format(date);
		System.out.println(now);
	}

}
