package application;

public class Ex1 {

	public static void main(String[] args) {
		int stepCount = 5000;
		double result = cal(stepCount);
		System.out.println("소모된 칼로리는 : "+ result + "kcal");
	}
	public static double cal(int walk) {
		return 0.02 * walk;
	}

}
