package j_practice;

public class Practice05WrapperExample {

	public static void main(String[] args) {
		String scores = "100,11,35,41";
		// 총점
		int total = 0;
		// 평균
		double avg = 0;
		
		String[] strs = scores.split(",");
		// [100][11][35][41]
		for(String s : strs) {
			total += Integer.parseInt(s);
		}
		avg = (total / strs.length);
		System.out.println(scores);
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : %.1f점 \n",avg);
		
	}

}
