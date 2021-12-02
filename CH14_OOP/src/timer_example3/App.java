package timer_example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() { // Runnable의 추상메소드를 구현(완성)한다.
		// 구동 코드 작성
		System.out.println("타이머2 헬로우");

	}

}

class Task2 extends TimerTask {

	@Override
	public void run() {
		System.out.println("타이머1 헬로우");
	}
}

public class App {

	public static void main(String[] args) {
		// 타이머1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task2(), 0L, 1000L);
		
		// 타이머2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);
	}

}
