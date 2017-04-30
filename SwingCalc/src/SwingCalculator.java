import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
	
public class SwingCalculator extends JPanel {
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_plus, b_minus, b_result, clearBtn, multiBtn, divideBtn;
	JTextArea textResult;
	GridBagConstraints gbc = new GridBagConstraints();
	long  a=0, b=0, c=0, result=0;
	enum Operation {PLUS , MINUS, MULTI, DIVIDE };
	Operation operation, lastOperation;
	
	
//	ArrayList operationStack = new ArrayList();
	
	public  SwingCalculator(){
		
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(5, 	5, 5, 5);
		textResult = new JTextArea();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.EAST;
		add(textResult, gbc);
		
		b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textResult.setText(textResult.getText()+b1.getText());
			}
		});
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		add(b1,gbc);
		
		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b2.getText());
			}
		});
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		add(b2,gbc);
		
		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b3.getText());
			}
		});
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		add(b3,gbc);
		
		clearBtn = new JButton("CLR");
		clearBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				a=0;
				b=0;
			}
		});
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		add(clearBtn,gbc);
		
		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b4.getText());
			}
		});

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		add(b4,gbc);
		
		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b5.getText());
			}
		});

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		add(b5,gbc);
		
		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b6.getText());
			}
		});
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		add(b6,gbc);
		
		multiBtn = new JButton("*");
		multiBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operation = Operation.MULTI;
				a=Integer.parseInt(textResult.getText());
				
				textResult.setText("");
			}
		});
		
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		add(multiBtn,gbc);
		
		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b7.getText());
			}
		});
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		add(b7,gbc);
		
		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b8.getText());
			}
		});
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		add(b8,gbc);
		
		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b9.getText());
			}
		});
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		add(b9,gbc);
		
		divideBtn = new JButton("/");
		divideBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operation = Operation.DIVIDE;
				a=Integer.parseInt(textResult.getText());
				
				textResult.setText("");
			}
		});
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		add(divideBtn,gbc);
		
		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+b0.getText());
			}
		});
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		add(b0,gbc);
		
		b_plus = new JButton("+");
		b_plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				operation = Operation.PLUS;
				a=Integer.parseInt(textResult.getText());
				textResult.setText("");
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		add(b_plus,gbc);
		
		b_minus = new JButton("-");
		b_minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				operation = Operation.MINUS;
				a=Integer.parseInt(textResult.getText());
				textResult.setText("");
			}
		});
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		add(b_minus,gbc);
		
		b_result = new JButton("=");
		b_result.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(operation==Operation.PLUS){
					b=Integer.parseInt(textResult.getText());
					textResult.setText(Long.toString(a+b));
				}
				
				if(operation==Operation.MINUS){
					
					b=Integer.parseInt(textResult.getText());
					
					textResult.setText(Long.toString(c=a-b));
				}
				
				if(operation==Operation.MULTI){
					
					b=Integer.parseInt(textResult.getText());
					
					textResult.setText(Long.toString(c=a*b));
				}
				
				if(operation==Operation.DIVIDE){
					
					b=Integer.parseInt(textResult.getText());
					
					textResult.setText(Long.toString(c=a/b));
				}
					
			}
		});
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(b_result, gbc);
	}
	
		public static void main(String... args){
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					JFrame frame = new JFrame("My new Swing UI");
					SwingCalculator swingCalc = new SwingCalculator();
					
					frame.setSize(300, 300);
					frame.setResizable(false);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					frame.add(swingCalc);
				}
			});
		}
	
	
}
