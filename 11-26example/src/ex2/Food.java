package ex2;

public class Food {
	
	private int price ;
	private String food ;
	public Food(String string, int i) {
		// TODO Auto-generated constructor stub
		price = i;
		food = string;
	}
	@Override
	public String toString() {
		return "Food [price=" + price + ", food=" + food + "]";
	}
	
}
