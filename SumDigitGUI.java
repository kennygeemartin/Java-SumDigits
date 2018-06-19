package sumDigit;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SumDigitGUI extends JFrame{
	
	private JTextField digitField = new JTextField();

	private JTextField answerField = new JTextField(20);
	
	private JLabel instL = new JLabel("Enter your numbers here");
	
	SumDigitTest sumDigit = new SumDigitTest();
	
	private JButton getAns = new JButton("Sum");
	
	public SumDigitGUI() {
		JPanel dPanel = new JPanel(new GridLayout(2,1));
		dPanel.add(instL);
		dPanel.add(digitField);
		
		JPanel answerP = new JPanel();
		answerP.add(new JLabel("Answer"));
		answerP.add(answerField);
		answerField.setEditable(false);
		
		JPanel btans = new JPanel();
		btans.add(getAns);
		
		add(dPanel, BorderLayout.NORTH);
		add(answerP, BorderLayout.CENTER);
		add(btans,BorderLayout.SOUTH);
		
		getAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long ans = new Long(digitField.getText()).longValue();
				
				long answer1 = sumDigit.sumDigit(ans);
				
				String answer = Long.toString(answer1);
				
				answerField.setText(answer);
			}
		});
		
		digitField.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				e.getKeyCode();
				long ans;
				//KeyEvent.VK_ENTER = 	
				
			}
			
		});
		
		
	}
	
	
	public static void main(String [] args) {
		SumDigitGUI frame = new SumDigitGUI();
		
		frame.setTitle("Sum Digit App");
		frame.setLocationRelativeTo(null);
		frame.setSize(300,160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
	
}
