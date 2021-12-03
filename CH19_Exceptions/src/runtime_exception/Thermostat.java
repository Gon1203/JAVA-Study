package runtime_exception;

public class Thermostat {
	// runtime 예외는 예외 처리를 하지 않도 된다.
	public void setTemperature(double temperature) {
		if (temperature < 0 || temperature > 35) {
			throw new RuntimeException("온도가 비정상 입니다.");

		}
		System.out.println("온도세팅 : " + temperature);
	}
}
