package application;

public class DatingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = rating(4.2, 4.7, 4.3);
		String y = rating(3.8,4.1,3.5);
		String z = rating(3.6,3.0,3.4);
		
		System.out.printf("X-> %s등급\n",x);
		System.out.printf("Y-> %s등급\n",y);
		System.out.printf("Z-> %s등급\n",z);
	}
	public static String rating(double a, double b, double c) {
		String result = "";
		double t = a + b + c;
		if(a>4.0&&b>4.0&&c>4.0) {
			result = "A";
		}else if((t>10)&&(a>4.0||b>4.0||c>4.0)) {
			result = "B";
		}else {
			result = "C";
		}
		return result;
	}

}
