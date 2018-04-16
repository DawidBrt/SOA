package ex.soa;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyTempCalc
 */
@Stateless
@LocalBean
@Remote
public class TempCalc {

    /**
     * Default constructor. 
     */
    public TempCalc() {
        // TODO Auto-generated constructor stub
    }
    
    public double FtoC(double F) {
    	double C = (5/9)*(F-32);
    	return C;
    }
    
    public double CtoF(double C) {
    	double F = C*(9/5)+32;
    	return F;
    }

}
