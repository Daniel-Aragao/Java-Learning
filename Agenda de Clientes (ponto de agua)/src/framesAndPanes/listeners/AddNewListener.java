package framesAndPanes.listeners;

import java.util.EventListener;

import App.Cliente;

public interface AddNewListener extends EventListener {
	public void novoSavedEvent(Cliente cliente);
}
