package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {	// 생성자
		super(title);	// 창의 이름을 넣어서 생성
		
		//패널넣기 
		
		setLayout(new BorderLayout());	// 창에 컴포넌트를 붙이기 위해 레이아웃 생성
		
		final MainPanel mainPanel = new MainPanel();
		//		mainPanel.setBackground(Color.CYAN);
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
