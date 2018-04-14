package test.faces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Liczba {
	static int losuj = (int)(Math.random()*5+1);
	
	public String sprawdz(String l) {
		if(Integer.parseInt(l)==losuj) {
			losuj = (int)(Math.random()*5+1);
			return "trafiony";
		} else {
			return l;
		}
	}
	
}
