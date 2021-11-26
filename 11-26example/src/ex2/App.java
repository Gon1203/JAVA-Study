package ex2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥", 22000);
		
		Food[] foods = {chicken, pizza, sushi};
		
		for(Food c : foods) {
			System.out.println(c.toString());
		}
	}

}
