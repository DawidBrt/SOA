package ex3;

import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "car", eager = true)
@SessionScoped
public class Car {
	private String brand=null;
	private String model=null;
	private List<String> brands = new ArrayList<>();
	private List<String> ford = new ArrayList<>();
	private List<String> honda = new ArrayList<>();
	private List<String> nissan = new ArrayList<>();
	
	private Integer costMin=-1;
	private Integer costMax=-1;
	private Integer fuel=-1;
	
	private String name = null;
	private String number = null;
	
	private OnSell os = new OnSell();
	
	public Car() {
		brands.add("Ford");
		brands.add("Honda");
		brands.add("Nissan");
		
		ford.add("Fiesta");
		ford.add("Focus");
		ford.add("Mustang");
		
		honda.add("Civic");
		honda.add("Acord");
		
		nissan.add("Leaf");
		nissan.add("GT-R");
		nissan.add("Juke");
	}
	
	public List<String> getBrands() {		
		return brands;
	}
	
	public List<String> getModels() {
		if(brand!=null) {
			switch(brand) {
			case "Ford":
				return ford;
			case "Honda":
				return honda;
			case "Nissan":
				return nissan;
			default:
				return null;
			}
		}
		return null;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.model = null;
		this.brand = brand;
	}
	
	public Integer getCostMin() {
		return costMin;
	}
	
	public void setCostMin(Integer costMin) {
		this.costMin = costMin;
	}
	
	public Integer getCostMax() {
		return costMax;
	}
	
	public void setCostMax(Integer costMax) {
		this.costMax = costMax;
	}
	
	public List<String> costsMin(){
		
		List<String> cmin = new ArrayList<>();
		if(costMax == -1) {
			for(int i=0;i<=100;i++) {
				cmin.add(Integer.toString(i*1000));
				
			}
		}
		else {
			for(int i=0;i<=costMax;i+=1000) {
				cmin.add(Integer.toString(i));
			}
		}
		return cmin;
	}
	
	public List<Integer> costsMax(){
		
		List<Integer> cmax = new ArrayList<>();
		if(costMin == -1) {
			for(int i=1;i<=100;i++) {
				cmax.add(i*1000);
			}
		}
		else {
			for(int i=costMin;i<=100000;i+=1000) {
				cmax.add(i);
			}
		}
		return cmax;
	}
	
	public Boolean isAble() {
		if(brand==null || brand.equals("-1")) {
			return true;
		}
		else if(model==null || model.equals("-1")) {
			return true;
		}
		else if(name==null) {
			return true;
		}
		else if(number==null || number.equals("stop")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void send() {}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void clear() {
		brand = null;
		model = null;
		costMin = -1;
		costMax = -1;
		fuel=-1;
		name = null;
		number = null;
		
	}

	public Integer getFuel() {
		return fuel;
	}

	public void setFuel(Integer fuel) {
		this.fuel = fuel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String n) {
		String number2=null;
		if(n.length()==9) {
			for(int i=0;i<n.length();i++) {
				if(n.charAt(i)>='0' && n.charAt(i)<='9') {
					number2+=n.charAt(i);
					this.number=number2;
				}
				else {
					this.number="stop";
					break;
				}
			}
		}
		else {
			this.number="stop";
		}
	}

	public OnSell getOs() {
		return os;
	}

	public void setOs(OnSell os) {
		this.os = os;
	}
	
	public List<String> sell(){
		try {
			return os.cars4Me(brand, model, costMin, costMax, fuel);
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
}
