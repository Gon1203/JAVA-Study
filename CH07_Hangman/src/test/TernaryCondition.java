package test;

public class TernaryCondition {

	public static void main(String[] args) {
		//삼항조건연산자
		// 조건 ? A : B (조건이 참이면 A 거짓이면 B를 반환)
		System.out.println(true ? "참":"거짓");
		System.out.println(false ? "참":"거짓");
		
		int n = 101;
		n = n > 100 ? 100 : n;
		System.out.println(n);
		
		int[] values = {6,3,92,64,17};
		int max = 0;
		for(int val : values) {
//			if(val > max) {
//				max=val;
			max = val > max ? val : max;
			}
		
		System.out.println(max);
	}
}