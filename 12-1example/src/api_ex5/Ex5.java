package api_ex5;

import java.util.ArrayList;

public class Ex5 {

	public static void main(String[] args) {
		// 김밥(2000원) * 57
		// 돈까스(6000원) * 29
		// 냉면(5000원) * 34
		
		Store st = new Store();
		Menu m1 = new Menu("김밥",2000,57);
		Menu m2 = new Menu("돈까스",6000,29);
		Menu m3 = new Menu("냉면",5000,34);
		
		st.add(m1);
		st.add(m2);
		st.add(m3);
		
		System.out.printf("총 매출 : %d원",st.totalSales());
	}

}

class Store {
	private ArrayList<Menu> list;

	public Store() {
		this.list = new ArrayList<Menu>();
	}

	public void add(Menu menu) {
		list.add(menu);
	}

	public int totalSales() {
		int sum = 0;
		for (Menu m : list) {
			sum += m.getPrice()*m.getCount();
		}
		return sum;
	}
}

class Menu {
	private String name;
	private int price;
	private int count;

	public Menu(String name, int price, int count) {

		this.name = name;
		this.count = count;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}