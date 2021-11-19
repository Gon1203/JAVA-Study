package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 break; 사용 시 빠져나옴
		int count = 0;
		while (true) { // 무한 반복문
			System.out.println("헬로우! " + count);
			if (count == 5) { // count 5에서 break;
				
				break;
			}
			System.out.println("하아유?");

			count++;
		}

	}

}
