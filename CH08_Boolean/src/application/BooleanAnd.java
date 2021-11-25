package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A,B 모두 참일때만 참
		boolean isRaining =true;
		boolean haveUmbrella = true;
		
		boolean takeUmbrella = false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번째 : "+takeUmbrella);
		
		//2
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("두번째 : "+takeUmbrella);
		//3
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("세번째 : "+takeUmbrella);

	}

}
