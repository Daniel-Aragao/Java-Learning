package Exercicing;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel{

	JLabel name;
	JLabel age;
	JLabel question;
	JTextField textFName;
	JTextField textFAge;
	JTextField textFQuestion;
	JButton ok;
	JButton cleanLabels;
	
	public FormPanel(){
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		name = new JLabel("Name: ");
		age = new JLabel("Age: ");
		question = new JLabel("What are you doing here?");
		
		textFName = new JTextField("dumbass");
		textFAge = new JTextField("-5");
		textFQuestion = new JTextField("Wtf?");
		
		ok = new JButton("OK..");
		cleanLabels = new JButton("Clean those shits");
		
		setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints = new GridBagConstraints();
		/////////////////////FIRST ROW////////////////////////////////
		
		
		
	}
	
	
}
