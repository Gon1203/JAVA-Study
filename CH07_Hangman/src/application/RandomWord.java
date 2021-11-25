package application;

import java.util.Random;

public class RandomWord {
	private String str = "chemistry technology employer classroom perspective inspector baseball boyfriend response definition candidate literature championship distribution communication profession patience perception category internet grandmother instance variation delivery reception audience republic philosophy resource instruction president personality bathroom independence education presentation population significance suggestion comparison resolution decision childhood combination economics obligation magazine psychology language director";
	private String[] words = str.split(" ");

	private String selectWord;
	private char[] characters; // 문자 배열
	private Random random = new Random();

	public RandomWord() {
		// 생성자에 랜덤 단어를 선택
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()]; // 선택 단어의 길이 만큼 문자배열 크기로 생성
	}

	public void getWords() { // 현재 words배열에 있는 전체 단어를 출력
		for (String w : words) {
			System.out.println(w);
		}

	}

	public String toString() {
		// 단어를 _로 출력한다
//		String text = "";
		StringBuilder sb = new StringBuilder();
		for (char c : characters) {
//			if (c == '\u0000') { // 문자 초기값(default value(int = 0 cahr = '\u0000')) // 아직 맞추지 못한 문자
//				sb.append('_');
//			} else {
//				sb.append(c); // 맞춘 문자일 경우
//			}
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' '); // 철자를 한칸씩 스페이스
		}
//		System.out.println(selectWord); // 정답 출력 테스트 용
		return sb.toString(); // 선택된 랜덤 단어를 가져옴
	}
	public void addGuess(char c) {
		// 넘어온 문자를 검사해서 선택된 단어에 있으면 characters 배열에 저장
		for(int i = 0; i < selectWord.length();i++) {	// 단어 길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
	public boolean isCompleted(){
		for(char c : characters) {
			if(c=='\u0000') {
				return false;
			}
		}
		return true;
	}
}
