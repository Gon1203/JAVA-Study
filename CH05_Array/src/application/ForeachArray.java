package application;

public class ForeachArray {

	public static void main(String[] args) {
		// 배열에 사용할 수 있는 반복문 foreach
		// 간단한 배열의 반복에는 for each문을 사용하고 index 번호가 필요할 경우 for문을 사용
		String[] fruits = { "사과", "바나나", "수박" };
		int[] n = { 1, 2, 3 };
		boolean[] b = { true, false, true };
		double[] d = { 1.1, 2.2, 3.3, 4.4 };
		for (String x : fruits) { // for each문은 (변수 : 배열)형식으로 사용
			System.out.println(x);
		}
		for (int x : n) {
			System.out.println(x);
		}
		for (boolean x : b) {
			System.out.println(x);
		}
		for (double x : d) {
			System.out.println(x);
		}

	}

}
