package throwing_exception;

public class Thermostat {
	public void setTemperature(double temperature) throws Exception {
		// 예외처리 throw는 해당 예외 처리를 이 메소드를 호출할때 처리하도록 함
		if (temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다.");

		}
		System.out.println("온도세팅 : " + temperature);
	}
}
