package lambda_example;

interface Runner {
	void excute(); // 추상메소드 1개 => 람다식 사용 가능
}

public class App2 {

	public static void main(String[] args) {
		Runner run = () -> {
			System.out.println("헬로우");
			System.out.println("람다식");
		};// 실행 코드가 한줄일때 코드블록{} 생략 가능
		run.excute();

		System.out.println(run instanceof Runner); // run은 Runner의 객체임을 확인
		System.out.println(run.getClass()); // class는 Lambda
	}

}
