import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	
	public MainFrame(String title){
		super(title);
		
		setLayout(new BorderLayout());
		
		JTextArea textArea = new JTextArea();
		
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
	}
}