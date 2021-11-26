package ex6;

public class Order {
	private int orderNum;
	private Menu[] menus;
	
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}
	
	public int totalPrice() {
		int total = 0;
		for(int i = 0; i < menus.length;i++) {
			total += menus[i].price;
		}
		return total;
	}
	
}
