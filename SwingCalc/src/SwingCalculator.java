import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
	
public class SwingCalculator extends JPanel {
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_plus, b_minus, b_result;
	JLabel textResult;
	GridBagConstraints gbc = new GridBagConstraints();
	
	public  SwingCalculator(){
		
		setLayout(new GridBagLayout());
		
		
		textResult = new JLabel("result");
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(textResult, gbc);
		
		b1 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(b1,gbc);
		
		b2 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(b2,gbc);
		
		b3 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 1;
		add(b3,gbc);
		
		b4 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(b4,gbc);
		
		b5 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(b5,gbc);
		
		b6 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 2;
		add(b6,gbc);
		
		b7 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(b7,gbc);
		
		b8 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(b8,gbc);
		
		b9 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 3;
		add(b9,gbc);
		
		b0 = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(b0,gbc);
		
		b_plus = new JButton("+");
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(b_plus,gbc);
		
		b_minus = new JButton("-");
		gbc.gridx = 2;
		gbc.gridy = 4;
		add(b_minus,gbc);
		
		b_result = new JButton("=");
		gbc.gridx = 2;
		gbc.gridy = 5;
		add(b_result, gbc);
	}
	
		public static void main(String... args){
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					JFrame frame = new JFrame("My new Swing UI");
					SwingCalculator swingCalc = new SwingCalculator();
					
					frame.setSize(500, 400);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					frame.add(swingCalc);
				}
			});
		}
	
	
}
