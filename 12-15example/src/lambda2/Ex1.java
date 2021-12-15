package lambda2;

import java.util.Arrays;
import java.util.List;

interface Condition<T>{
	public boolean test(T t);
}

public class Ex1 {

	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
				new Car("현대", "쏘나타", "레드", 3200),
				new Car("현대", "뉴 투싼", "블랙", 3100),
				new Car("현대", "아반떼", "블루", 2500),
				new Car("기아", "카니발", "화이트", 5000),
				new Car("기아", "쏘렌토", "블루", 3800),
				new Car("쉐보레", "말리부", "블랙", 3000),
				new Car("쉐보레", "스파크", "레드", 1200),
				new Car("르노삼성", "QM6", "그레이", 3300)
				);
//		showCarPriceRange(cars,2700,3300);
//		showCarByColor(cars,"블루");
		showCars(cars,new Condition<Object>() {
			@Override
			public boolean test(Object t) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		
		showCars(cars, new Condition<Object>() {
			@Override
			public boolean test(Object t) {
				// TODO Auto-generated method stub
				return false;
			}
		});
	}

//	private static void showCarPriceRange(List<Car> cars, int low, int high) {
//		for(Car c : cars) {
//			if(low < c.getPrice() && c.getPrice() <= high) {
//				c.printCar();
//			}
//		}
//	}
//
//	private static void showCarByColor(List<Car> cars, String color) {
//		for(Car c : cars) {
//			if(c.getColor() == color) {
//				c.printCar();
//			}
//		}
//	}
	
	public static void showCars(List<Car> cars, Condition<Object> condition) {
		for(Car c : cars) {
			if(condition.test(c)){
				c.printCar();
			}
		}
	}

}
