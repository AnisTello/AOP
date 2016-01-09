package AOP;

public class Order {
	
	private int id;
	private double amount;
	
	public Order(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void printOrder() {
		System.out.println("order number " + id + "amount: " + amount);
	}
}
