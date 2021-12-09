package instance_of;

import java.io.Serializable;

class Creature implements Serializable{
	private static final long serialVersionUID = 1L;
}

class Cat extends Creature{
	private static final long serialVersionUID = 1L;
	
}
public class App {

	public static void main(String[] args) {
		// instance of class : 객체의 타입을 판별
		Creature c1 = new Creature();
		
		Object c2 = c1;

		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c1 instanceof Object);	// Object가 부모클래스 >> 객체가 맞음
		System.out.println(c1 instanceof Serializable);	// 인터페이스를 구현 >> 객체가 맞음
		System.out.println(c1 instanceof Creature);	// 본인 클래스
		System.out.println(c1 instanceof Cat);
	}

}
