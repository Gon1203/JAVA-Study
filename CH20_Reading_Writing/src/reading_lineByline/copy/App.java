package reading_lineByline.copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "/Users/jeonmac/Desktop/JAVA/JAVA/JAVA-Study/CH20_Reading_Writing/test.txt";
		// 위의 파일 주소로 파일 객 생성 메소드 exists는 파일이 있으면 true, false 리턴
		System.out.println(new File(fileLocation).exists());
		System.out.println();

		try {
			// 파일을 읽기 위한 객체 생성
			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			// 파일 읽기
			String line = null;
			while ((line = reader.readLine()) != null) { // 파일의 끝에 더이상 문자가 없으면 null
				System.out.println(line); // 더이상 읽을 줄이 없을때까지 읽어서 한 줄씩 출력
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우
			// e.printStackTrace(); 빨간색 예외 처리
			System.out.println("파일을 찾지 못함 : " + fileLocation);
		} catch (IOException e) {
			// 파일을 읽지 못한 예외 처리
			// e.printStackTrace();
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}
		
	}

}
