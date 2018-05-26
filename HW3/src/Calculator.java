import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener, KeyListener {

	private GridBagConstraints gbc;
	private JTextField tf1;
	private JTextField tf2;
	private JButton button[];
	private JPanel numPanel;
	
	private int lastValue = 0;
	private int lastOperator = 0;
	private boolean start = true;
	
	Calculator() {
		
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf1.setBorder(BorderFactory.createEmptyBorder());
		tf1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		tf2 = new JTextField("0");
		tf2.setEditable(false);
		tf2.setHorizontalAlignment(JTextField.RIGHT);
		tf2.setBorder(BorderFactory.createEmptyBorder());
		tf2.setFont(new Font("Dialog", Font.BOLD, 30));
				
		button = new JButton[13];
		for (int i = 0; i < 10 ; i++) {
			button[i] = new JButton(String.valueOf(i));
			button[i].setFont(new Font("Dialog", Font.BOLD, 30));
			button[i].setActionCommand(String.valueOf(i)); 
			button[i].addActionListener(this);
		}
		button[10] = new JButton("C");
		button[10].setFont(new Font("Dialog", Font.PLAIN, 30));
		button[10].setActionCommand("C"); 
		button[10].addActionListener(this);
		button[11] = new JButton("+");
		button[11].setFont(new Font("Dialog", Font.PLAIN, 30));
		button[11].setActionCommand("+"); 
		button[11].addActionListener(this);
		button[12] = new JButton("=");
		button[12].setFont(new Font("Dialog", Font.PLAIN, 30));
		button[12].setActionCommand("="); 
		button[12].addActionListener(this);
		
		numPanel = new JPanel();
		numPanel.setLayout(new GridBagLayout());
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;

		addGrid(button[7], 0, 0, 1, 1);
		addGrid(button[8], 1, 0, 1, 1);
		addGrid(button[9], 2, 0, 1, 1);
		addGrid(button[10], 3, 0, 1, 1);
		
		addGrid(button[4], 0, 1, 1, 1);
		addGrid(button[5], 1, 1, 1, 1);
		addGrid(button[6], 2, 1, 1, 1);
		addGrid(button[11], 3, 1, 1, 2);
		
		addGrid(button[1], 0, 2, 1, 1);
		addGrid(button[2], 1, 2, 1, 1);
		addGrid(button[3], 2, 2, 1, 1);
		
		addGrid(button[0], 0, 3, 3, 1);
		addGrid(button[12], 3, 3, 1, 1);
		
		add(tf1, BorderLayout.PAGE_START);
		add(tf2, BorderLayout.CENTER);
		add(numPanel, BorderLayout.PAGE_END);
		
		addKeyListener(this);
		setFocusable(true);
		requestFocus();
				
		pack();
		setVisible(true);
	}
	
	private void addGrid(Component c, int gridx, int gridy, int gridwidth, int gridheight) {
        
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridwidth;
		gbc.gridheight = gridheight;
		gbc.weightx = gridwidth;
		gbc.weighty = gridheight;
		numPanel.add(c, gbc);
        
   }

	@Override
	public void actionPerformed(ActionEvent e) {
	
		requestFocus();
		if (e.getActionCommand() == "C") {
			lastValue = 0;
			lastOperator = 0;
			start = true;
			tf1.setText(null);
			tf2.setText("0");
		}
		else if (e.getActionCommand() == "+") {
			if(!(lastOperator == 1 && start)) {
				if (lastOperator == 0 || lastOperator == 2)
					lastValue = Integer.parseInt(tf2.getText());
				else
					lastValue += Integer.parseInt(tf2.getText());
				lastOperator = 1;
				tf1.setText(tf1.getText() + tf2.getText() + " + ");
				tf2.setText(String.valueOf(lastValue));
				start = true;
			}
		}
		else if (e.getActionCommand() == "=") {
			if (lastOperator == 1) {
				lastOperator = 2;
				start = true;
				tf1.setText(null);
				tf2.setText(String.valueOf(lastValue + Integer.parseInt(tf2.getText())));
				lastValue = Integer.parseInt(tf2.getText()) - lastValue;
			}
			else if (lastOperator == 2) {
				tf1.setText(null);
				tf2.setText(String.valueOf(String.valueOf(Integer.parseInt(tf2.getText()) + lastValue)));
			}
		}
		else
			if (start) {
				tf2.setText(((JButton)e.getSource()).getText());
				start = false;
			}
			else
				tf2.setText(tf2.getText() + ((JButton)e.getSource()).getText());
		
    }

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_C) {
			lastValue = 0;
			lastOperator = 0;
			start = true;
			tf1.setText(null);
			tf2.setText("0");
		}
		else if (e.getKeyCode() == KeyEvent.VK_ADD || (e.getKeyCode() == KeyEvent.VK_EQUALS && e.isShiftDown())) {
			if(!(lastOperator == 1 && start)) {
				if (lastOperator == 0 || lastOperator == 2)
					lastValue = Integer.parseInt(tf2.getText());
				else
					lastValue += Integer.parseInt(tf2.getText());
				lastOperator = 1;
				tf1.setText(tf1.getText() + tf2.getText() + " + ");
				tf2.setText(String.valueOf(lastValue));
				start = true;	
			}
		}
		else if ((e.getKeyCode() == KeyEvent.VK_EQUALS && !e.isShiftDown()) || e.getKeyCode() == KeyEvent.VK_ENTER){
			if (lastOperator == 1) {
				lastOperator = 2;
				start = true;
				tf1.setText(null);
				tf2.setText(String.valueOf(lastValue + Integer.parseInt(tf2.getText())));
				lastValue = Integer.parseInt(tf2.getText()) - lastValue;
			}
			else if (lastOperator == 2) {
				tf1.setText(null);
				tf2.setText(String.valueOf(String.valueOf(Integer.parseInt(tf2.getText()) + lastValue)));
			}
		}
		else if (e.getKeyCode() >= KeyEvent.VK_0 && e.getKeyCode() <= KeyEvent.VK_9)
			if (start) {
				tf2.setText(String.valueOf(e.getKeyCode() - KeyEvent.VK_0));
				start = false;
			}
			else
				tf2.setText(tf2.getText() + String.valueOf(e.getKeyCode() - KeyEvent.VK_0));
		else if(e.getKeyCode() >= KeyEvent.VK_NUMPAD0 && e.getKeyCode() <= KeyEvent.VK_NUMPAD9)
			if (start) {
				tf2.setText(String.valueOf(e.getKeyCode() - KeyEvent.VK_NUMPAD0));
				start = false;
			}
			else
				tf2.setText(tf2.getText() + String.valueOf(e.getKeyCode() - KeyEvent.VK_NUMPAD0));
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}