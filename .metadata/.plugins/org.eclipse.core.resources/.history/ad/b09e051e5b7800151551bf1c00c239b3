package framesAndPanes;
import java.awt.BorderLayout;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;

import util.Import;
import App.Cliente;
import framesAndPanes.listeners.SelectListener;


@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	// Constants;
	public static final int WIDTH = 600,
							HEIGHT = 400;
	public static final File FILE = new File("clientes.txt");
	//Panes
	private ListPanel listPanel;
	private AddPanel addFrame;
	private InfoPanel infoPanel;
	private ClientPanel clientPanel;
	
	//Lista
	ArrayList<Cliente> lista;
	
	public MainFrame(){
		lista = Import.listaDeClientes(MainFrame.FILE);
		listPanel = new ListPanel(lista);
		
		clientPanel = new ClientPanel();
		createFrame();
		
		listPanel.setSelectListener(new SelectListener(){

			@Override
			public void listClientSelectedEvent(Cliente cliente) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
	}
	
	public void createFrame(){
		
		this.setTitle("Agenda de Clientes");
		this.setSize(MainFrame.WIDTH, MainFrame.HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		this.setLayout(new BorderLayout());
		this.add(listPanel,BorderLayout.WEST);
		this.add(clientPanel,BorderLayout.CENTER);
		
	}
	
	
	
}
