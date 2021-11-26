package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scisors;

public class Game {

	GameObject[] objects = { new Scisors(), new Rock(), new Paper() };
	Random random = new Random();

	public void run() {
		System.out.println("게임 시작 ....");

		int num = random.nextInt(objects.length);
		GameObject ob = objects[num];
		System.out.println(ob); // GameObject에서 toString을 오버라이드 했기 때문에 주소 대신 ob(.toString)이 출
	}
}
