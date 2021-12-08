package file_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		//
		File currentDirectory = new File("."); // "." 은 현재 폴더 위치

		System.out.println(currentDirectory.getAbsolutePath()); // 파일객체의 절대경로 출력
		
		System.out.println(currentDirectory.getCanonicalPath());	// 파일의 정규 경로를 문자열로 반환
		
		
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
	}

}
