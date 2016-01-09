package OOP;

public class Order {
	private int id;
	private double amount;
	private Client client;

	public Order(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void printOrder() {
		System.out.println("order number " + id + "amount: " + amount + "to: " + client);
	}

}
