import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button, btn; // ��� �޼ҵ忡�� ������ �� �ִ�. 
	JTextField tf;
	
	MyFrame() {
		
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("choice 2nd frame");
		
		// ���ο� ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout()); // �÷ο� ��ġ �Ŵ��� ����
		button = new JButton("button1"); // ��ư ��ü ����
		btn = new JButton("button2");
		tf = new JTextField(20);
		button.addActionListener(this); // �̺�Ʈ ������ ��ü ���
		btn.addActionListener(this);
		
		this.add(button); // ��ư ��ü�� �����ӿ� �߰�
		button.setActionCommand("button1");
		this.add(btn);
		btn.setActionCommand("button2");
		this.add(tf);
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("button1"))
			tf.setText("ù ��° ��ư");
		else
			tf.setText("�� ��° ��ư");		
	}
	 	
}