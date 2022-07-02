package com.anto.hfooad.guitar.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;

	public boolean matches(GuitarSpec searchGuitar){

		if(builder != searchGuitar.getBuilder()) return false;

		if(model != null && !model.equalsIgnoreCase(searchGuitar.getModel())) return false;
		
		if(type != searchGuitar.getType()) return false;
		
		if(backWood != searchGuitar.getBackWood()) return false;
		
		if(topWood != searchGuitar.getTopWood()) return false;

		if(numStrings != searchGuitar.getNumStrings()) return false;

		return true;
	}
}
