package application;

public class Switch {

	public static void main(String[] args) {
		// Switch
		int option = 0;

		switch (option) {
		case 0: // 옵션 변수가 케이스 0과 같을때
			System.out.println("옵션 0 선택");
			System.out.println("케이스  0 일때");
			break; // 항상 케이스 하나 끝에 break작성
		case 1: // 옵션 변수가 케이스 1과 같을때
			System.out.println("옵션 1 선택");
			break;
		case 10: // 옵션 변수가 케이스 10과 같을때
			System.out.println("프로그램 종료");
			break;
		default: // case와 같은 값이 없을 때 default실행
			System.out.println("잘못된 옵션 번호");
			break;
		}

	}

}
