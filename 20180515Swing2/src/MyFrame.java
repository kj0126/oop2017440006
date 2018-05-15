import java.awt.FlowLayout;
import javax.swing.*;

// ������ ����� �� ��° ���: JFrame���κ��� ��ӹ��� Ŭ�󽺸� �����. 
public class MyFrame extends JFrame {

	public MyFrame() {
		
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("choice 2nd frame");
		
		// ���ο� ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout());
		JLabel label = new JLabel("�� �ڸ� ������ �Է��ϼ���: "); // ���̺� ��ü ����
		JTextField tf = new JTextField(20); // �ؽ�Ʈ �ʵ� ��ü ����
		JButton button = new JButton("choice button"); // ��ư ��ü ����

		button.setText("Ȯ��");
		tf.setText("1234");
		
		// �г� ����
		JPanel panel = new JPanel();
		panel.add(label); // ���̺� ��ü�� �гο� �߰�
		panel.add(tf); // �ؽ�Ʈ �ʵ� ��ü�� �гο� �߰�
		
		this.add(panel); // �г� ��ü�� �������� �߰�
		this.add(button); // ��ư ��ü�� �����ӿ� �߰�
		
		pack(); // �������� ������Ʈ���� ũ�⿡ �µ��� ����
				
		setVisible(true);
		
	}
	
}