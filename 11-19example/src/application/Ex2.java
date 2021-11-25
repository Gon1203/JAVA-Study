package application;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gasoline = 8.86;
		double distance = 182.736;
		double result = calEffiency(gasoline, distance);
		System.out.printf("%.2f km/l",result);
	}
	
	public static double calEffiency(double fuel, double distance) {
		return distance / fuel;
	}

}
