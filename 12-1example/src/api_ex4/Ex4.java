package api_ex4;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Item a = new Item("스트라이프 셔츠", 49900);
		Item b = new Item("슬림 면바지", 58900);
		Item c = new Item("스니커즈", 46900);
		
		cart.add(a);
		cart.add(b);
		cart.add(c);
		
		System.out.printf("총합 : %d원",cart.totalPrice());
	}

}

class Cart{
	private ArrayList<Item> list;
	
	public Cart() {
		this.list = new ArrayList<Item>();
	}
	
	public void add(Item item) {
		list.add(item);
	}
	
	public int totalPrice() {
		int sum = 0;
		for(Item c : list) {
			sum += c.getPrice();
		}
		return sum;
	}
}

class Item{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}