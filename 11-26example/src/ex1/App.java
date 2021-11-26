package ex1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c = new Cylinder();
		
		c.radius = 4;
		c.height = 5;
		
		System.out.printf("원기둥 부피 : %.2f \n", c.getVolume());
		System.out.printf("원기둥 겉넓이 : %.2f \n", c.getArea());
	}

}
