package ex3;

import java.util.*;

public class OnSell {
	private List<TheCar> otomoto = new ArrayList<>();
	
	public OnSell() {
		otomoto.add(new TheCar("Ford", "Fiesta",35000,1));
		otomoto.add(new TheCar("Ford", "Fiesta",40000,0));
		otomoto.add(new TheCar("Ford", "Focus",50000,1));
		otomoto.add(new TheCar("Ford", "Focus",55000,0));
		otomoto.add(new TheCar("Honda", "Civic",55000,1));
		otomoto.add(new TheCar("Honda", "Civic",53200,1));
		otomoto.add(new TheCar("Honda", "Civic",55600,1));
	}
	public List<String> cars4Me(String m, String mo, Integer min, Integer max, Integer p){
		List<String> c4m = new ArrayList<>();
		if(max<0) max=1000001;
		try {
			for(int i=0;i<otomoto.size();i++) {
				if(otomoto.get(i).check(m, mo, min, max, p)) {
					c4m.add(otomoto.get(i).toString());
				}
		}
		}
		catch(Exception e) {
		}
		if(c4m.isEmpty()) {
			return null;
		}
		return c4m;
	}
}
