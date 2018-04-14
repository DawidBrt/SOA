package ex3;

public class TheCar {
	private String marka;
	private String model;
	private Integer cena;
	private Integer paliwo;
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getCena() {
		return cena;
	}
	public void setCena(Integer cena) {
		this.cena = cena;
	}
	public Integer getPaliwo() {
		return paliwo;
	}
	public void setPaliwo(Integer paliwo) {
		this.paliwo = paliwo;
	}

	public TheCar(String marka, String model, Integer cena, Integer paliwo) {
		this.marka=marka;
		this.model=model;
		this.cena=cena;
		this.paliwo=paliwo;
	}
	
	public Boolean check(String m, String mo, Integer min, Integer max, Integer p) {
		if(p!=-1) {
			if(marka.equals(m) && (model.equals(mo) && paliwo==p)) {
				if(cena>=min && cena <=max) {
					return true;
				}
				return false;
			}
			else
				return false;
			}
		else {
			if(marka.equals(m) && model.equals(mo)) {
				if(cena>=min && cena <=max) {
					return true;
				}
				return false;
			}
			else
				return false;
		}
	}
	
	public String toString() {
		return marka + " " + model + ": " + Integer.toString(cena) +"zl";
	}
}
