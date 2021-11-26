package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;
// ==> import enitites.*; ( entities 안의 모든 클래스)

// 다른 패키지의 객체를 사용할 경우 import해야함


public class App {

	public static void main(String[] args) {
		// protected 접근 지정자 사용시 다른 패키지에서 사용할 수 없고 상속받은 자식 클래스에서 사용 가능
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		
//		f1.id = 7;
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}
