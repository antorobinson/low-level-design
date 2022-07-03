package com.anto.hfooad.guitar.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Guitar extends Instrument {
	public Guitar(String serialnumber, double price, GuitarSpec spec){
		super(serialnumber, price, spec);
	}

	@Override
	public String toString() {
		return super.toString();
	};
}
