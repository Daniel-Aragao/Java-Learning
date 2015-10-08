package Exercicing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	TextPanel textArea;
	ToolBar toolBar;
	FormPanel formPanel;
	
	public MainFrame(){
		createFrame();		
		
		//Create Panels
		textArea = new TextPanel();
		toolBar = new ToolBar();
		formPanel = new FormPanel();
		
		toolBar.setStringListener(new StringListener(){
			@Override
			public void textEmited(String text) {
				if(text != null){
					textArea.appendText(text);
				}else{
					textArea.setText(text);
				}
			}
		});
		
		add(toolBar,BorderLayout.NORTH);
		add(textArea,BorderLayout.CENTER);
		add(formPanel,BorderLayout.WEST);
		pack();
	}
	private void createFrame(){
		setTitle("MainFrame 1.0");
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(600,400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
}
