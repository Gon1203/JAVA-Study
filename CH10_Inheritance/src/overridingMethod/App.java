package overridingMethod;

public class App {

	public static void main(String[] args) {
		// 메소드 오버라이딩
		Cat cat = new Cat();
		cat.hunt();
		cat.vocal();
		
		HouseCat hCat = new HouseCat();
		hCat.vocal();
		hCat.hunt();
		
		RoadCat rCat = new RoadCat();
		rCat.vocal();
		rCat.hunt();
		
		Tiger tiger = new Tiger();
		tiger.vocal();
		tiger.hunt();
	}

}
