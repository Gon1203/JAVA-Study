package application;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => 둘 중 하나라도 참이면 참
		boolean isRaining =false;
		boolean mightRain = true;
		
		boolean takeUmbrella = false;
		
		takeUmbrella = isRaining || mightRain;
		System.out.println(takeUmbrella);
	}

}
