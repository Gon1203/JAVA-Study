package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 시트에 넣기
		// 이때 리스트는 단어가 중복 X. 알파벳 순으로 저장
		File mobydick = new File("mobydick.txt");
		File gatsby = new File("gatsby.txt");
		/// Users/jeonmac/Desktop/JAVA/JAVA/JAVA-Study/CH22_CollectionsAPI/mobydick.txt
		/// (경로)
		System.out.println(mobydick.exists());
		System.out.println(gatsby.exists());

		TreeSet<String> mobylist = loadWords(mobydick);
		TreeSet<String> gatsList = loadWords(gatsby);
		System.out.println(gatsList.size());
		System.out.println(mobylist.size());
		displayWords(mobylist);

//		for (String w : mobylist) {
//			System.out.println(w);
//		}
	}

	/**
	 * 입련된 파일을 읽어서 단어를 저장하여 마지막에 트리셋 리스트로 리턴
	 * 
	 * @param file
	 * @return wordSet
	 */
	private static TreeSet<String> loadWords(File file) {
		TreeSet<String> wordSet = new TreeSet<>();

		// 파일을 읽기 위한 객체 생성
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			// 파일 읽기
			String line = null;
			while ((line = reader.readLine()) != null) { // 파일의 끝에 더이상 문자가 없으면 null
				// 트리셋에 단어로 분리해서 입력한다.(자동 정렬 및 중복 제거)
				String[] words = line.split("[^a-zA-Z]+");

				for (String w : words) {
					if (w.length() < 9) {
						continue;
					}
					wordSet.add(w.toLowerCase()); // 소문자로 단어입력
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못함");
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함");
		}

		return wordSet; // wordSet 리턴
	}

	/**
	 * list를 입력받아 그 안에 단어들을 출력한다
	 * 
	 * @param list
	 */
	private static void displayWords(TreeSet<String> list) {
		int count = 0;
		for (String w : list) {
			System.out.printf("%10s \t", w);
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

}
