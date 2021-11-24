package windowPrograming;

public class App {

	public static void main(String[] args) {
		// 윈도우 객체를 생성
		// set 메소드로 값을 입력하고 get 메소드로 값을 출력
		// 설정 윈도우 창의 가로길이 300 세로길이 600
		// 현재 보이도록 true, top 200, left 400
		Window w1 = new Window();
		w1.setHeight(600);
		w1.setWidth(300);
		w1.setLeft(400);
		w1.setTop(200);
		w1.setIsVisible(true);
		System.out.println("width : " + w1.getWidth());
		System.out.println("height : " + w1.getHeight());
		System.out.println("top : " + w1.getTop());
		System.out.println("left : " + w1.getLeft());
		System.out.println("isVisible : " + w1.getIsVisible());
	}

}
