import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextPanel extends JPanel{
	private JTextArea textArea;
	
	public TextPanel(){
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
	
	public void setText(String text){
		this.textArea.setText(text);
	}
	
	public void appendText(String text) {
		this.textArea.append(text);
		
	}
	
	
	
}
