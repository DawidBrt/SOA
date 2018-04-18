package com.myconv;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TemperatureConverter
 */
@Stateless
@LocalBean
public class TemperatureConverter implements TemperatureConverterRemote {

    /**
     * Default constructor. 
     */
    public TemperatureConverter() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public double fromCtoF(double C) {
		double F = C*(9.0/5.0)+32.0;
    	return F;
	}

	@Override
	public double fromFtoC(double F) {
		double C = (5.0/9.0)*(F-32.0);
    	return C;
	}

}
