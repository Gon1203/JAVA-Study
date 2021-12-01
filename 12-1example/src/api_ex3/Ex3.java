package api_ex3;

import java.util.StringTokenizer;

public class Ex3 {

	public static void main(String[] args) {
		String str = "치킨, 피자, 보쌈, 족발, 초밥, 떡볶이, 탕수육";
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
