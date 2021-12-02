package local_InnerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
		class Printer implements Runnable {
			public void run() {
				System.out.println(name);
			}
		}
//		new Printer().print();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0, 1l, TimeUnit.SECONDS);
	}
}
