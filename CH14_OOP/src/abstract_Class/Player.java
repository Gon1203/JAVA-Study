package abstract_Class;
// 추상 클래스를 상속 받았을 경우 추상 메소드를 구현(만들어야)해야 함
public class Player extends GameObject{

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println("플레이어 입니다.");
	}

}
