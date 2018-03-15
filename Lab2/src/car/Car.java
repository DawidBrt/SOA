package car;

public class Car {
	private String model;
	private String type;
	private int cost;
	
	public Car(String model, String type, int cost) {
		this.model = model;
		this.type = type;
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
