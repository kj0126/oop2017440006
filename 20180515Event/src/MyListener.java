import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

// ù ��° �̺�Ʈ ������ ���� ���
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//�׼� �̺�Ʈ ��ü���� ������ ��ư ��ü(��ư ��ü�� ����������)�� �����´�. 
		JButton button = (JButton) e.getSource();
		
		System.out.println("OMG ��ư�� ���������!!!!!");
		button.setText("��ư�� ���������. ");
		
	}

}