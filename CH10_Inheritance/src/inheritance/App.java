package inheritance;

public class App {

	public static void main(String[] args) {
		// inheritance 
		Animal animal = new Animal();
		animal.eat();
		
		Bird bird = new Bird();
		bird.eat();	// 부모인 Animal로 부터 상속받은 메소드
		bird.fly();
	}

}
