package AOP;

import java.util.LinkedList;
import java.util.List;

public aspect AClientOrder {
	private List<Order> Client.orders = new LinkedList<Order>();
	private Client Order.client;
	
	
	public void Client.addOrder(Order o) {
		orders.add(o);
	}
	
	public boolean Client.hasOrders() {
		return !orders.isEmpty();
	}
	
	public void Client.delOrder(Order o) {
		orders.remove(o);
	}
	
	public List<Order> Client.getOrders() {
		return orders;
	}
	
	public void Order.setClient(Client c) {
		this.client = c;
	}

	public Client Order.getClient() {
		return client;
	}
	
pointcut constraintRemoveOrder(Client clientToBeRemoved): call(void Clients.delClient(Client)) && args(clientToBeRemoved);
	
	void around(Client clientToBeRemoved) : constraintRemoveOrder(clientToBeRemoved) {
		if (clientToBeRemoved.orders.isEmpty()) {
			proceed(clientToBeRemoved);
			System.out.println("client has been Removed");
		}
		else
		System.out.println("can't be deleted. Client still has order(s)");
	}

}
