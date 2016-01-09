package OOP;

public class Client {
	private String name;
	private String address;
	private Orders orders;
	
	public Client(String name, String address) {
		this.name = name;
		this.address = address;
		this.orders = new Orders();
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addOrder(Order o) {
		o.setClient(this);
		this.orders.addOrder(o);
	}
	public boolean hasOrder(){
		return this.orders.getOrders().isEmpty();
	}
	public void delOrder(Order O) {
		this.orders.delOrder(O);
	}
	
	public String getName() {
		return name;
	}
	
	public Orders getOrders() {
		return orders;
	}
	
	@Override
	public String toString() {
		return this.name + "address:" + address;
	}
	
}
