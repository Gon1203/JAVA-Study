package application;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액 : $%.2f(%.0f원)",dollar,won);
	}

	public static int dice() {
		int i = (int) (Math.random() * 6) + 1;
		return i;
	}

	public static double exchange(double dollar) {
		double j = dollar * 1082.25108;
		return j;
	}

}
