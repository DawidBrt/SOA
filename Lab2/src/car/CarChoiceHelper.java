package car;

import java.util.ArrayList;

public class CarChoiceHelper {
	private ArrayList<Car> cars = new ArrayList<>();
	public CarChoiceHelper() {
		cars.add(new Car("Nissan GTR", "Sport",510000));
		cars.add(new Car("Nissan Micra","City",45000));
		cars.add(new Car("Nissan Juke","City",55000));
		cars.add(new Car("Nissan Leaf","City",139000));
		cars.add(new Car("Nissan 370Z","Sport",182000));
		cars.add(new Car("Nissan 370Z Roadster","Sport", 211000));
		cars.add(new Car("Lexus IS","Exclusive",139000));
		cars.add(new Car("Lexus GS","Exclusive",181000));
		cars.add(new Car("Lexus LS","Exclusive",490000));
	}
	
	public String getCars(String type, int from, int to){
		String ans = "";
		for(Car c: cars) {
			String typeTmp = c.getType();
			if(type.equals(typeTmp)) {
				int cost = c.getCost();
				if(cost>=from && cost <=to) {
					ans+=c.getModel()+"\n";
				}
			}
		}
		return ans;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}

}
