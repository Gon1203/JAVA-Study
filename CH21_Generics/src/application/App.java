package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {
		Wrapper<Cat> wrap1 = new Wrapper<>();
		Wrapper<Creature> wrap2 = new Wrapper<>();
		Wrapper<Mammal> wrap3 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다");
		Creature cr = new Creature("크리쳐");
		Mammal m = new Mammal("포유류");
		
		wrap1.setObject(cat);
		wrap3.setObject(m);
		wrap2.setObject(cr);
		
		Cat c1 = wrap1.getObject();
		Creature cr1 = wrap2.getObject();
		Mammal ma = wrap3.getObject();
		
		
		System.out.println(c1);
		System.out.println(cr1);
		System.out.println(ma);
	}

}
