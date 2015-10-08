package Exercicing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ToolBar extends JPanel implements ActionListener{
	JButton helloWorld;
	JButton clean;
	JButton thanks;//  joh purcell for the learning
	
	StringListener stringListener;
	
	public ToolBar(){
		setSize(getPreferredSize().width, 50);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBorder(BorderFactory.createRaisedBevelBorder());
		helloWorld = new JButton("Hello World!");
		clean = new JButton("Clean");
		thanks = new JButton("Thanks");
		
		
		helloWorld.addActionListener(this);
		clean.addActionListener(this);
		thanks.addActionListener(this);
		
		add(helloWorld);
		add(clean);
		add(thanks);
	}

	public void setStringListener(StringListener listener){
		this.stringListener = listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		if(buttonClicked == helloWorld){
			stringListener.textEmited("Hello World!\n");
		}else if(buttonClicked == clean){
			stringListener.textEmited(null);
		}else if(buttonClicked == thanks){
			stringListener.textEmited("thanks john purcell for the lessons\n");
		}
		
	}
	
}

