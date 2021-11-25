package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	RandomWord r = new RandomWord();
	Scanner sc = new Scanner(System.in);

	public void run() {
		do {
			displayWord(); // 화면에 단어 표시
			getUserrInput(); // 철자 하나를 입력 받음
			checkuserInput(); // 맞는지 체크(전부 맞으면 running = false)
		} while (running);
	}

	private void displayWord() {
//		System.out.println("체크");
		System.out.println(r.toString());
	}

	private void getUserrInput() {
		// 유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 한 문자를 뽑아서
		// RandomWord 객체에 전장 ( addGuess(문자)메소드를 만들자 )
		System.out.print("한 문자 입력 : ");
		String guess = sc.nextLine();
		r.addGuess(guess.charAt(0));	// 첫번째 문자
	}

	private void checkuserInput() {
		System.out.println("화면에 단어 표시");
	}
}
