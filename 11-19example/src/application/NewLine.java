package application;

public class NewLine {

	public static void main(String[] args) {
		System.out.println("line 1");
		threeLines();
		System.out.println("line 2");

	}
	
	public static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
	}
	
	public static void oneLine() {
		System.out.println(">");
	}

}
