package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){명령문;}
//		for(int i=0;i<10;i++) {
//			System.out.println("i : "+ i);
//		}
//		for(;;) {
//			//무한 반복
//			System.out.println("hello");
//		}
//		1~100까지의 합을 for문ㅇ르 사용해서 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println("sum : " + (sum += i)+ " i : "+ i);
		}
	}

}
