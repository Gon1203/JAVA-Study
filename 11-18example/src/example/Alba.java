package example;

import java.util.Scanner;

public class Alba {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("μκΈ : ");
		int base = scanner.nextInt();
		System.out.print("μκ° : ");
		int time = scanner.nextInt();
		int earn = base * time;
		System.out.printf("income : %d", earn);
		
		scanner.close();
	}

}
