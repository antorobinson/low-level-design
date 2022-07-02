package com.anto.hfooad.guitar.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar {

	private String serialnumber;
	private double price;
	private GuitarSpec guitarSpec;
	
}
