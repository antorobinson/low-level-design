package com.anto.hfooad.instrument.model;

import com.anto.hfooad.instrument.enums.Builder;
import com.anto.hfooad.instrument.enums.Type;
import com.anto.hfooad.instrument.enums.Wood;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GuitarSpec extends InstrumentSpec {
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood, Integer numStrings) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	@Override
	public boolean matches(InstrumentSpec instrumentSpec) {

		if (!super.matches(instrumentSpec))
			return false;
		if (!(instrumentSpec instanceof GuitarSpec))
			return false;

		GuitarSpec spec = (GuitarSpec) instrumentSpec;
		if (numStrings != spec.getNumStrings())
			return false;

		return true;
	}
}
