import java.awt.FlowLayout;
import javax.swing.*;

// 프레임 만드는 두 번째 방법: JFrame으로부터 상속받은 클라스를 만든다. 
public class MyFrame extends JFrame {

	public MyFrame() {
		
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("choice 2nd frame");
		
		// 새로운 컴포넘트를 프레임에 추가
		setLayout(new FlowLayout());
		JLabel label = new JLabel("네 자리 정수를 입력하세요: "); // 레이블 객체 생성
		JTextField tf = new JTextField(20); // 텍스트 필드 객체 생성
		JButton button = new JButton("choice button"); // 버튼 객체 생성

		button.setText("확인");
		tf.setText("1234");
		
		// 패널 생성
		JPanel panel = new JPanel();
		panel.add(label); // 레이블 객체를 패널에 추가
		panel.add(tf); // 텍스트 필드 객체를 패널에 추가
		
		this.add(panel); // 패널 객체를 프레임의 추가
		this.add(button); // 버튼 객체를 프레임에 추가
		
		pack(); // 프레임을 컴포넌트들의 크기에 맞도록 조절
				
		setVisible(true);
		
	}
	
}