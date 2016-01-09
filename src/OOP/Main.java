package OOP;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		final Clients clients = new Clients();
		final Orders orders = new Orders();
		Random random = new Random();

		for (int i = 0; i < random.nextInt(5) ; i++) {
			clients.addClient(new Client("Client" + i, "Address" + i));
		}
		for (int i = 0; i < random.nextInt(15); i++) {
			orders.addOrder(new Order(i, random.nextInt(50)));
		}
		
		for (Client client : clients.getClients()){
			client.addOrder(orders.getRadomOrder());
		}
		
		System.out.println(clients.getClients().size() + " clients and " + orders.getOrders().size() + " orders.");
		
		for (Client client : clients.getClients()) {
			System.out.println(client.getName() + " has " + client.getOrders().getOrders().size() + " order(s).");
			for (Order order : client.getOrders().getOrders()) {
				System.out.print(" - ");
				order.printOrder();
			}
		}
		
	}

}
