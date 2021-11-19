package application;

import java.util.Scanner;

public class RareItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("체력을 입력하세요 > ");
		int hp = input.nextInt();
		System.out.print("마력을 입력하세요 > ");
		int mp = input.nextInt();
		wear(hp,mp);
		input.close();
	}
	public static void wear(int hp, int mp) {
		if(hp >= 2000 && mp >= 2000) {
			System.out.println("아이템 장착 완료!");
		}else {
			System.out.println("아이템을 착용할 수 없습니다.");
		}
	}

}
