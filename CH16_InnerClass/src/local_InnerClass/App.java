package local_InnerClass;

public class App {
	private String name; // 인스턴스 변수

	public App() {
		name = "엘리자베스";
	}

	public static void main(String[] args) {
//		System.out.println(name); 사용불가 
		App app = new App();
		app.name = "춘식이";
		app.run();
	}

	private void run() {
//		System.out.println(name);
		class Printer {
			public void print() {
				System.out.println(name);
			}
		}
		new Printer().print();
	}
}
