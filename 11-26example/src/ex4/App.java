package ex4;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube a = new Cube(3);
		Cube b = new Cube(5);
		
		System.out.printf("정육면체 a의 부피 : %d, 겉넓이 : %d \n",a.volume(),a.area());
		System.out.printf("정육면체 b의 부피 : %d, 겉넓이 : %d",b.volume(),b.area());
	}

}
