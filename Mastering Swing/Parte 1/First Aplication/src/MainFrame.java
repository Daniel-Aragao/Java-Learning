import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formpanel;
	
	public MainFrame(){
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formpanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener(){
			public void textEmited(String text){
				if(text != null){
					textPanel.appendText(text);
				}else{
					textPanel.setText(text);
				}
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(formpanel, BorderLayout.WEST);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
