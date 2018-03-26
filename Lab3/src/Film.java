
public class Film {
	
	private String tytul;
	private String gatunek;
	private int rok;
	private String dochod;
	
	public Film(String tytul, String gatunek, int rok, String dochod) {
		this.setTytul(tytul);
		this.setGatunek(gatunek);
		this.setRok(rok);
		this.setDochod(dochod);
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public String getDochod() {
		return dochod;
	}

	public void setDochod(String dochod) {
		this.dochod = dochod;
	}
	
	
	
}
