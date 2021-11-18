package example;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSec = 7582;
		int min = totalSec / 60;
		int hour = min / 60;
		int sec = totalSec % 60;
		System.out.printf("%d시간 %d분 %d초", hour, min%60, sec);
	}

}
