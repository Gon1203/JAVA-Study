package ex3;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Miner malon = new Miner("말론");
		Miner gloria = new Miner("글로리아");
		
		
		
		for(int a = ran.nextInt(1000);a>1;a--) {
			malon.mine();
		}
		for(int b = ran.nextInt(1000);b>1;b--) {
			gloria.mine();			
		}
		
		
		System.out.println(malon.toString());
		System.out.println(gloria.toString());
	}

}
