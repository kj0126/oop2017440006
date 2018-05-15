import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button, btn; // 모든 메소드에서 접근할 수 있다. 
	JTextField tf;
	
	MyFrame() {
		
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("choice 2nd frame");
		
		// 새로운 컴포넘트를 프레임에 추가
		setLayout(new FlowLayout()); // 플로우 배치 매니저 생성
		button = new JButton("button1"); // 버튼 객체 생성
		btn = new JButton("button2");
		tf = new JTextField(20);
		button.addActionListener(this); // 이벤트 리스너 객체 등록
		btn.addActionListener(this);
		
		this.add(button); // 버튼 객체를 프레임에 추가
		button.setActionCommand("button1");
		this.add(btn);
		btn.setActionCommand("button2");
		this.add(tf);
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("button1"))
			tf.setText("첫 번째 버튼");
		else
			tf.setText("두 번째 버튼");		
	}
	 	
}