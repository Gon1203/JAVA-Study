package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {

	public static void main(String[] args) {
		// 정수형 스트림 생성
		IntStream
			.range(1, 10)	// 1에서 10까지 정수
			.skip(5)		// 5개 정수를 스킵
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		int val =IntStream
			.range(1, 101)
			.sum();
		System.out.println(val);

	}

}
