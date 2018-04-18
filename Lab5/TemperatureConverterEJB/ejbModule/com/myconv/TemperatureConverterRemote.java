package com.myconv;

import javax.ejb.Remote;

@Remote
public interface TemperatureConverterRemote {
	public double fromCtoF(double C);
	public double fromFtoC(double F);
}
