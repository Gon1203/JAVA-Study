package example;

public class AverageWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		double weight = 81.36;
		total += weight;
		weight += 0.71;
		total += weight;
		weight -= 0.43;
		total += weight;
		System.out.printf("%.2f kg", (total / 3));
	}

}
