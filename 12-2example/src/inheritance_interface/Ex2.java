package inheritance_interface;

public class Ex2 {

	public static void main(String[] args) {
		Car c = new Car("티코");
		Car t = new Truck("봉고", 1.5);
		
		System.out.println(c.toString());
		System.out.println(t.toString());
	}

}


class Car{
	protected String name;
	
	public Car() {
		
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[자동차] { name : "+name+ "}";
	}
}

class Truck extends Car{
	protected double ton;
	public Truck(String name) {
		super(name);
	}

	public Truck(String name, double d) {
		super(name);
		this.ton = d;
	}

	@Override
	public String toString() {
		return "[트럭] {name : " + name + ", ton : " + ton + "}";
	}
	
	
	
}