package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;

public class Game {

	GameObject[] objects = GameObject.values();	// enum의 상수를 배열로 리턴
	Random random = new Random();
	Scanner sc = new Scanner(System.in);

	public void run() {
		int wins = 0;
		for (int i = 1; i < 4; i++) {
			System.out.println(i+ "번째 게임 시작 ....");

			System.out.print("가위(0), 바위(1), 보(2)를 숫자로 선택 >>");
			GameObject ob1 = objects[sc.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			System.out.println("당신의 선택은 : " + ob1); // GameObject에서 toString을 오버라이드 했기 때문에 주소 대신
																// ob(.toString)이 출력
			System.out.println("컴퓨터의 선택은 : " + ob2);

			int score = ob1.compare(ob2);
			wins += score;
		}
		if (wins > 0) {
			System.out.println("당신의 승리!");
		} else if (wins < 0) {
			System.out.println("당신이 졌습니다.");
		} else {
			System.out.println("비겼습니다");
		}
		sc.close();
	}
}
