package api_ex1;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		order.add(new Chicken("로스트 치킨", 9900));
		order.add(new Chicken("파닭 치킨", 12900));
		order.add(new Chicken("마늘아 치킨", 13900));
		
		int sum = 0;
		
		for(Chicken od : order) {
			sum += od.getPrice();
		}
		
		System.out.println("총합 : "+sum+"");
		
	}

}


class Chicken{
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}