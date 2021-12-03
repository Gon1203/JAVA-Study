package inheritance_interface;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();

		taxi.start();
		taxi.stop(5000);
	}

}

interface Meter {
	public int BASE_FARE = 3000; // 기본요금

	abstract public void start();

	abstract public void stop(int distance);
}

class Taxi implements Meter {

	private int price;

	public void start() {
		System.out.println("운행을 시작 합니다.");
	}

	public void stop(int distance) {

		price = BASE_FARE + distance * 2;
		System.out.println("운행을 종료 합니다. 요금은 " + price + "입니다.");
	}

}