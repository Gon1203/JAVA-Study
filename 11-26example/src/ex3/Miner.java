package ex3;

public class Miner {
	int coins;
	String name;
	
	public Miner(String c) {
		name = c;
		coins = 0;
	}
	public void mine() {
		coins++;
	}
	@Override
	public String toString() {
		return "Miner [coins=" + coins + ", name=" + name + "]";
	}
	
}
