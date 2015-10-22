package framesAndPanes;

//import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.Border;

import App.Cliente;
import framesAndPanes.listeners.SelectListener;

public class ListPanel extends JPanel{
	private JLabel search;
	private JTextField textBox;
	private JList<String> list;
	private ArrayList<Cliente> listaArray;
	private int selecionado;
	private JButton selectButton;
	
	private SelectListener selectListener; 
	
	public ListPanel(ArrayList<Cliente> lista){
		Dimension dim = getPreferredSize();
		dim.width = 150;
		setPreferredSize(dim);
		
		search = new JLabel("Search: ");		
		textBox = new JTextField(10);
		
		list = new JList<String>();
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		for(Cliente c: lista){
			model.addElement(c.getNome());
		}
		list.setModel(model);
		
		
		list.setBorder(BorderFactory.createEtchedBorder());
		list.setSelectedIndex(0);
		
		
		selectButton = new JButton("Selecionar");
		selectButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				selecionado = list.getSelectedIndex();
				
				if(selectListener != null){
					selectListener.listClientSelectedEvent(lista.get(selecionado));
				}
				
			}
			
		});
		
		Border innerBorder = BorderFactory.createTitledBorder("Clientes: ");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
		
		GridBagLayout gl = new GridBagLayout();
		this.setLayout(gl);
		
		GridBagConstraints gc = gl.getConstraints(this);
		
		
		gc.fill = GridBagConstraints.NONE;
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.gridx = 0;
		
		/////////FIRST LINE///////////////////////////////////
		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		this.add(search,gc);
		
		/////////SECOND LINE//////////////////////////////////
		gc.gridy = 1;
		
		gc.anchor = GridBagConstraints.LINE_START;
		this.add(textBox,gc);
		
		/////////THIRD LINE///////////////////////////////////
		gc.gridy = 2;
		gc.fill = GridBagConstraints.BOTH;
		gc.weighty = 2;
		gc.anchor = GridBagConstraints.CENTER;
		this.add(list,gc);
		
		////////FOURTH LINE///////////////////////////////////
		gc.gridy = 3;
		gc.fill = GridBagConstraints.NONE;
		
		gc.weighty = 1;
		this.add(this.selectButton,gc);
		
	}
	
	public void setSelectListener(SelectListener listener){
		this.selectListener = listener;
	}
	
}
