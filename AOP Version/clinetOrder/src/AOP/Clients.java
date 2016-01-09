package AOP;

import java.util.List;
import java.util.LinkedList;

public class Clients {
	
	private List<Client> clients;
	
	public Clients() {
		clients = new LinkedList<Client>();
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void addClient(Client c) {
		clients.add(c);
	}
	
	public void delClient(Client c) {
		clients.remove(c);
	}

}
