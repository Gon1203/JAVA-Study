package custom_exception;

import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(-2);
			
		} catch (TempTooHighException e) {	// 온도가 너무 높을경우
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {	// 온도가 너무 낮을경우
			System.out.println(e.getMessage());
		}
	}

}
