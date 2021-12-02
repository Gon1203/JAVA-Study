package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Five extends TimerTask {
	private int count = 0;
	@Override
	public void run() {
		if(count < 5) {
		System.out.println("계란 삶는중");
		count++;
		}else {
			cancel();
		}
	}

}

class CookDone implements Runnable {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란삶기 완료");
	}

}

public class App {

	public static void main(String[] args) {
		// 1. 5초 간격 타이머 "계란 삶는중"
		// 2. 30초 간격 타이머 "계란 삶기 완료"
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Five(), 5000, 5000); // 5초 후 5초 간격 메시지 출력

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new CookDone(), 30L, 30L, TimeUnit.SECONDS);

	}

}
