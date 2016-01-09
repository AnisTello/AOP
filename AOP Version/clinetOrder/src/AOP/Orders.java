package AOP;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Orders {
	
	private List<Order> orders;
	
	public Orders() {
		orders = new LinkedList<Order>();
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public void delOrder(Order o) {
		orders.remove(o);
	}

	public Order getRadomOrder(){
		Random r = new Random();
		return orders.get(r.nextInt(orders.size() -1 ));
	}
}