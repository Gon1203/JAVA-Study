package application;

import java.util.Scanner;

public class Rectangle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
	}
	public static boolean inRect(int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2) {
		if((x>=rect_x1 && x <= rect_x2))
		return true;
		return false;
	}

}
