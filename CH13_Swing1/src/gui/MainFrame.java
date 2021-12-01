package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {	// 생성자
		super(title);	// 창의 이름을 넣어서 생성
		
		//패널넣기 
		
		setLayout(new BorderLayout());	// 창에 컴포넌트를 붙이기 위해 레이아웃 생성
		
//		JPanel panel = new JPanel();	// 패널 생성
//		panel.setBackground(Color.GREEN);	// 패널을 녹색으로 설정
//		add(panel, BorderLayout.CENTER);	// 위에서 만든 패널을 레이아웃의 가운데 붙이기
		
		add(new Toolbar(), BorderLayout.NORTH);
		add(new MainPanel(), BorderLayout.CENTER);
		
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
