package application;

public class Diet {

	public static void main(String[] args) {
		double w = 81.6;
		double t = 1.76;
		double bmi = Bmi(w, t);

		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
		System.out.printf("결과: %s입니다.\n", result(bmi));
	}

	public static double Bmi(double w, double t) {
		double bmi = w / t / t;
		return bmi;
	}

	public static String result(double bmi) {
		String result = "";
		if (bmi >= 30) {
			result = "비만";
		} else if (bmi >= 25 && bmi < 30) {
			result = "과체중";
		} else if (bmi >= 18.5 && bmi < 25) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}

}
