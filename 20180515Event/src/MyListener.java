import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

// 첫 번째 이벤트 리스너 구현 방법
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//액션 이벤트 객체에서 눌려진 버튼 객체(버튼 객체의 레퍼전스값)를 가져온다. 
		JButton button = (JButton) e.getSource();
		
		System.out.println("OMG 버튼이 눌러졌어요!!!!!");
		button.setText("버튼이 눌러졌어요. ");
		
	}

}