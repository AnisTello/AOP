package OOP;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Orders {
	private List<Order> orders;
	
	public Orders() {
		this.orders = new LinkedList<>();
	}
	
	public Order getRadomOrder(){
		Random r = new Random();
		return orders.get(r.nextInt(orders.size() -1 ));
	}
	
	public void addOrder(Order c) {
		if (!this.orders.contains(c)){
			this.orders.add(c);
		}
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void delOrder(Order c) {
		if (this.orders.contains(c)){
			this.orders.remove(c);
		}
	}

}
