package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import App.Cliente;

public class Import {

	public static ArrayList<Cliente> listaDeClientes(File f){
		FileReader arquivo = null;
		BufferedReader leituraArquivo = null;
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			arquivo = new FileReader(f);
			leituraArquivo = new BufferedReader(arquivo);
			String line;
			while((line = leituraArquivo.readLine()) != null){
				String[] atribuidor = line.split(";");
				lista.add(new Cliente(atribuidor[0],atribuidor[1],atribuidor[2],atribuidor[3]));
			}
			
			leituraArquivo.close();
			arquivo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lista;
	}
	
}
