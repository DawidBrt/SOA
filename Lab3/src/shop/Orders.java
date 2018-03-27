package shop;

import java.util.Hashtable;

public class Orders {
	private Hashtable<Integer, Integer> orders = new Hashtable<>();

	public Hashtable<Integer, Integer> getOrders() {
		return orders;
	}

	public void setOrders(Hashtable<Integer, Integer> orders) {
		this.orders = orders;
	}
	
	public void setOrder(Integer id, Integer value) {
		if(value>0) {
			orders.put(id, value);
		} else {
			orders.remove(id);
		}
	}	
}
