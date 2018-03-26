package beer.model;

import java.util.ArrayList;

public class EkspertPiwny {
	
	public ArrayList<String> ListaPiw(String kolor){
		ArrayList<String> marki = new ArrayList<>();
		switch (kolor){
		case "jasny":{
			marki.add("Lech");
			marki.add("Zywiec");
			marki.add("Perla");
			break;
		}
		case "bursztynowy":{
			marki.add("b1");
			marki.add("b2");
			marki.add("b3");
			break;
		}
		case "brazowy":{
			marki.add("br3");
			marki.add("br6");
			marki.add("br19");
			break;
		}
		case "ciemny":{
			marki.add("c192");
			marki.add("c105");
			marki.add("c198");
			break;
		}
		}
		return marki;
	}
}
