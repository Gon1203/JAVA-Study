package school;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("춘식이", 7);
		Student s2 = new Student("길동", 37);
		Student s3 = new Student("라이언", 17);
		Student s4 = new Student("오리온", 27);
		
		s1.setVisible(false);	// 춘식이 원격, 온도측정 안함
		
		s2.setTemperature(35.5);	// 길동 집체, 온도 35.5
		
		s3.setTemperature(36.5);	// 라이언 집체, 온도 36.5
		
		s4.setVisible(false);	// 오리온 원격, 온도측정 안함
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
	}

}
