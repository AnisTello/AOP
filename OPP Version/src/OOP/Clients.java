package OOP;

import java.util.LinkedList;
import java.util.List;

public class Clients {
	private List<Client> clients;

	public Clients() {
		this.clients = new LinkedList<>();
	}

	public void addClient(Client c) {
		if (!this.clients.contains(c)) {
			this.clients.add(c);
		}
	}
	
	public List<Client> getClients() {
		return clients;
	}

	public void delClient(Client c) {
		if (this.clients.contains(c)) {
			if (!c.hasOrder())
				this.clients.remove(c);
			else
				System.out.println("can't be deleted. Client still has order(s)");
		}
	}

}
