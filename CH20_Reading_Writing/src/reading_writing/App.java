package reading_writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// 텍스트 읽고 쓰기
		String text = "헬로우! \n 하 아 유 ?"; // 작성 내용

		Path path = Paths.get("text.txt"); // 파일 경로 지정

		Files.write(path, text.getBytes()); // Files 클래스의 스테틱 메소드 write(적을경로, 적을내용(byte단위)), 파일이 없을 경우 생성

		String recivedText = Files.readString(path);
		System.out.println(recivedText);
	}
}
