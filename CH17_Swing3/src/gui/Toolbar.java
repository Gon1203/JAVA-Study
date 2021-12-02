package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;
//
//class ColorButtonListenr implements ActionListener {
//	private MainPanel mainPanel;
//	private Color c;
//
//	public ColorButtonListenr(MainPanel mainPanel, Color color) {
//		this.mainPanel = mainPanel;
//		this.c = color;
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		mainPanel.setBackground(c);
//	}
//}

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// 버튼에 클릭 이벤트를 연결('클릭' 이벤트)
//		redButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				mainPanel.setBackground(Color.red);
//			}
//		});
		redButton.addActionListener(e -> mainPanel.setBackground(Color.red)); // 람다식 표현 : (매개변수) -> {함수 바디}
//		blueButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				mainPanel.setBackground(Color.blue);
//			}
//		});
		blueButton.addActionListener(e -> mainPanel.setBackground(Color.blue));

		// 툴바에 버튼을 붙임
		add(redButton);
		add(blueButton);
	}

}
