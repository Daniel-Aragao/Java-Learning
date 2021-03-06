package Exercicing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class TextPanel extends JPanel{
	private JTextArea textArea;

	public TextPanel() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300,200));
		setBorder(BorderFactory.createTitledBorder("Writing area"));
		
		add(new JScrollPane(textArea),BorderLayout.CENTER);
	}
	
	public void setText(String text){
		textArea.setText(text);
	}
	
	public void appendText(String text){
		textArea.append(text);
	}
	
}
