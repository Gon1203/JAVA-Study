
package polymorphism;

import casting.Cat;
import casting.HouseCat;
import casting.RoadCat;
import casting.Tiger;

public class App {

	public static void main(String[] args) {
		// 다형성 : 자식 클래스 타입을 부모타입으로 형 변환
//		Cat cat1 = new Cat();
//		Cat cat2 = new HouseCat();
//		Cat cat3 = new RoadCat();
//		Cat cat4 = new Tiger();
//
//		Cat[] cats = { cat1, cat2, cat3, cat4 };
//		for (Cat c : cats) { // cats 배열의 각각의 객체가 c에 대입하여 반복
//			c.vocal();
//			c.hunt();
//		}
		Cat[] cats = { new Cat(), new HouseCat(), new RoadCat(), new Tiger() };
		// cats[0] == new Cat();
		// cats[1] == new HouseCat();
		// cats[2] == new RoadCat();
		// cats[3] == new Tiger();

//		String[] s = {"문자열1","문자열2", "문자열3, "문자열4"} == String s = {new String("문자열1"), new String("문자열2")...}

		for (int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}

		// for each 반복문
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}

		// 캐스팅 형변환 (기본 데이터 타입)
		int a = (int) 1.2345; // 실수 1.2345를 (int)형으로 캐스팅
		System.out.println(a);

		// 참조형 타입 (상속 관계일때)
		Cat cat1 = new HouseCat(); // 업캐스
		HouseCat cat2 = (HouseCat) cat1; // 다운 캐스팅
	}

}
