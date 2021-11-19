package application;

public class Audition {

	public static void main(String[] args) {
		// 변수 생성
		double tomVocal = 8.8;
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;

		System.out.printf("Tom의 오디션 결과 : %s\n", test(tomVocal, tomDance));
		System.out.printf("Kate의 오디션 결과 : %s\n", test(kateVocal, kateDance));
	}

	public static String test(double vocal, double dance) {
		return ((vocal * dance > 70.0) ? "통과" : "실패");
	}
}
