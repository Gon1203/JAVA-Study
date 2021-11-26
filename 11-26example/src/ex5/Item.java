package ex5;

public class Item {
	private String name;
	private int power;

	public Item(String str, int i) {
		name = str;
		power = i;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", power=" + power + "]";
	}
	

}
