package example;

import java.util.Scanner;

public class Alba {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시급 : ");
		int base = scanner.nextInt();
		System.out.print("시간 : ");
		int time = scanner.nextInt();
		int earn = base * time;
		System.out.printf("income : %d", earn);
		
		scanner.close();
	}

}
