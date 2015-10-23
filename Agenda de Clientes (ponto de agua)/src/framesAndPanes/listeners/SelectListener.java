package framesAndPanes.listeners;

import java.util.EventListener;

import App.Cliente;

public interface SelectListener extends EventListener{
	public void listClientSelectedEvent(Cliente cliente);
	public void listClientEditEvent(Cliente cliente);
}
