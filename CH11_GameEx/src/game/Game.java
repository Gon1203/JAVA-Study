package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scisors;

public class Game {

	GameObject[] objects = { new Scisors(), new Rock(), new Paper() };
	Random random = new Random();
	Scanner sc = new Scanner(System.in);

	public void run() {
		System.out.println("게임 시작 ....");
		int wins = 0;
		for (int i = 0; i < 3; i++) {

			System.out.print("가위(0), 바위(1), 보(2)를 숫자로 선택 >>");
			GameObject ob1 = objects[sc.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			System.out.println("당신의 선택은 : " + ob1.getName()); // GameObject에서 toString을 오버라이드 했기 때문에 주소 대신
																// ob(.toString)이 출력
			System.out.println("컴퓨터의 선택은 : " + ob2.getName());

			int score = ob1.compareTo(ob2);
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
