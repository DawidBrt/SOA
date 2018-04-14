package ex4;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ankieta", eager = true)
@SessionScoped
public class Ankieta {
	private String imie = null;
	private String email = null;
	private String wiek = null;
	private String plec =null;
	private String poziom = null;
	private String wzrost = null;
	private String talia = null;
	private String biodro = null;
	private String miseczka = null;
	private String noga = null;
	private String klata = null;
	private String pas = null;
	
	private String q1 = null;
    private String q2 = null;
    private String q3 = null;
    private String[] q4 = null;
    private String q5 = null;
    private String q6 = null;
    private String q7 = null;
    private String q8 = null;

    private String[] q4ans_female = {"garsonki","bluzki","spódniczki","spodnie"};
    private String[] q4ans_male = {"spodnie","spodenki","garnitury","koszule","krawaty"};
	
	
	
	public Boolean isWomen() {
		if(plec==null || plec.equals("m")) {
			return false;
		}
		else
			return true;
	}
	public List<String> getAges(){
		List<String> ages = new ArrayList<>();
		for(int i=10;i<=100;i++) {
			ages.add(Integer.toString(i));
		}
		return ages;
	}
	
	public List<String> getHigh(){
		List<String> gh = new ArrayList<>();
		if(plec==null) {
		}
		else if(plec.equals("m")) {
			for(int i=165;i<=200;i++) {
				gh.add(Integer.toString(i));
			}
		}
		else {
			for(int i=150;i<=185;i++) {
				gh.add(Integer.toString(i));
			}
		}
		return gh;
	}

	public String getwiek() {
		return wiek;
	}

	public void setwiek(String wiek) {
		this.wiek = wiek;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPoziom() {
		return poziom;
	}

	public void setPoziom(String poziom) {
		this.poziom = poziom;
	}

	public String getWzrost() {
		return wzrost;
	}

	public void setWzrost(String wzrost) {
		this.wzrost = wzrost;
	}

	public String getTalia() {
		return talia;
	}

	public void setTalia(String talia) {
		this.talia = talia;
	}
	public String getMiseczka() {
		return miseczka;
	}
	public void setMiseczka(String miseczka) {
		this.miseczka = miseczka;
	}
	public String getNoga() {
		return noga;
	}
	public void setNoga(String noga) {
		this.noga = noga;
	}
	public String getKlata() {
		return klata;
	}
	public void setKlata(String klata) {
		this.klata = klata;
	}
	public String getPas() {
		return pas;
	}
	public void setPas(String pas) {
		this.pas = pas;
	}
	public String getQ1() {
		return q1;
	}
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	public String getQ2() {
		return q2;
	}
	public void setQ2(String q2) {
		this.q2 = q2;
	}
	public String[] getQ4() {
		return q4;
	}
	public void setQ4(String[] q4) {
		this.q4 = q4;
	}
	public String getQ3() {
		return q3;
	}
	public void setQ3(String q3) {
		this.q3 = q3;
	}
	public String getQ6() {
		return q6;
	}
	public void setQ6(String q6) {
		this.q6 = q6;
	}
	public String getQ5() {
		return q5;
	}
	public void setQ5(String q5) {
		this.q5 = q5;
	}
	public String getQ7() {
		return q7;
	}
	public void setQ7(String q7) {
		this.q7 = q7;
	}
	public String getQ8() {
		return q8;
	}
	public void setQ8(String q8) {
		this.q8 = q8;
	}
	public String[] getQ4ans_male() {
		return q4ans_male;
	}
	public void setQ4ans_male(String[] q4ans_male) {
		this.q4ans_male = q4ans_male;
	}
	public String[] getQ4ans_female() {
		return q4ans_female;
	}
	public void setQ4ans_female(String[] q4ans_female) {
		this.q4ans_female = q4ans_female;
	}
	
	
	public Boolean isOneAble() {
		if(imie==null) {
			return true;
		}
		if(email==null) {
			return true;
		}
		if(plec==null) {
			return true;
		}
		return false;
	}
	public String getBiodro() {
		return biodro;
	}
	public void setBiodro(String biodro) {
		this.biodro = biodro;
	}
	
	public String q4ans() {
		String ans = new String();
		for(int i=0; i<q4.length;i++) {
			if(i==0) {
				ans+=q4[i];
			}
			else {
				ans+=", "+q4[i];
			}
		}
		return ans;
	}

}
