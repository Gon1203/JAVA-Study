package integerVariable;

public class App {

	public static void main(String[] args) {
		// 변수 만들기 : 1. 변수선언(타입, 자료형), 2. 변수 초기화
		int x = 10; 
		int y = 30;
		int z = x + y;
		
		int a;
		int b = 10;
		a = 7;
		
		System.out.println("변수 z의 값은 : "+ z);	//문자열 ("") + 정수 = 문자열이 된
		System.out.println("변수 a의 값은 : "+ a);
		System.out.println("변수 b의 값은 : "+ b);
		
		//변수는 값을 다시 재할당가능(바꿀수 있다)
		z = a+b;
		System.out.println("변수 z의 값은 : "+ z);
	} 
	

}
