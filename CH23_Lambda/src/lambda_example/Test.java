package lambda_example;

// 람다식을 쓸려면 functional interface여야 함
@FunctionalInterface
public interface Test {
	void run(); // 추상메서드 런을 생성 => 함수형 인터페이스 조건 만족

//	void run2(); // 함수형 인터페이스는 하나의 수상메소드만 가진 인터페이스이다
}
