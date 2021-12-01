package class_ex8;

import java.util.Random;

public class Ex8 {

	public static void main(String[] args) {
		Hero arthas = new Hero("아서스");
		Hero leona = new Hero("레오나");

		Hero.battle(arthas, leona);
	}

}

class Hero {
	String name;
	int hp;

	public Hero(String str) {
		name = str;
		hp = 30;
	}

	public void punch(Hero enemy) {
		Random dmg = new Random();
		enemy.hp -= dmg.nextInt(10) + 1;
	}

	public static void battle(Hero a, Hero b) {
		boolean firstAttack = true;
		while (a.hp > 0 && b.hp > 0) {
			if (firstAttack) {
				a.punch(b);
				System.out.printf("[%s]의 펀치%n", a.name);
				System.out.printf("%s : %d/30%n", b.name, b.hp);
			} else {
				b.punch(a);
				System.out.printf("[%s]의 펀치%n", b.name);
				System.out.printf("%s : %d/30%n", a.name, a.hp);

			}
			firstAttack = !firstAttack;
		}
	}
}