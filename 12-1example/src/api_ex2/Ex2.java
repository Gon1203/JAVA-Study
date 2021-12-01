package api_ex2;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		LottoMachine m1 = new LottoMachine();
		
		int[] numbers = m1.getLottoNumbers();
		
		System.out.print("생성 번호 : ");
		for(int i : numbers) {
			System.out.printf("%d ",i);
		}
	}

}

class LottoMachine{
	private int[] LottoNumbers;
	
	public LottoMachine() {
		LottoNumbers = generate();
	}
	
	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();
		
		for(int i = 0; i < 6; i++) {
			pickedNumbers[i] = rand.nextInt(45)+1;
		}
		return pickedNumbers;
	}

	public int[] getLottoNumbers() {
		return LottoNumbers;
	}

	public void setLottoNumbers(int[] lottoNumbers) {
		LottoNumbers = lottoNumbers;
	}
	
	
}