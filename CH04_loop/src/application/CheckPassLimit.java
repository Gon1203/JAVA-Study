package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		int count = 0;
		String password = "";
		final String USER_PASSWORD = "hello";
		Scanner scanner = new Scanner(System.in);
		
		do {
			if(count >= 3) {
				System.out.println("접속 거부");
				break;
			}
			System.out.println("비밀번호를 입력하세요 > ");
			password = scanner.nextLine();
			count++;
				
		}while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인");
		}
	}

}
