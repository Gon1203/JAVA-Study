package ex5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item strom = new Item("스톰브링어", 600);
		Item gauntlet = new Item("인피니티 건틀렛",999);
		Item bow = new Item("호크아이 활",50);
		Item shield = new Item("캡틴아메리카의 방패",50);
		
		Item[] items = {strom, gauntlet, bow, shield};
		
		for(Item c : items) {
			System.out.println(c.toString());
		}
	}

}
