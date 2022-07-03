package com.anto.hfooad.guitar.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Mandolin extends Instrument {
	public Mandolin(String serialnumber, double price, MandolinSpec spec){
		super(serialnumber, price, spec);
	}
}
