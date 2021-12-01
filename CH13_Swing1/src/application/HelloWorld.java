package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class HelloWorld {

	public static void main(String[] args) {
		// 자바 스윙 프로그램
		// JFrame 은 윈도우 창

		SwingUtilities.invokeLater(() -> {
			new MainFrame("테스트 스윙 앱");
			
//			JFrame mainFrame = new JFrame(); // 새 윈도우 창을 생성
//
//			mainFrame.setSize(600, 400); // 가로 600 세로 400
//			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료시 프로그램 종료
//			mainFrame.setVisible(true); // 창을 보이게 함
			
		});
	}

}
