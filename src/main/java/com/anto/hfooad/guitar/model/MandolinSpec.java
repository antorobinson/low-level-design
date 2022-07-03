package com.anto.hfooad.guitar.model;

import com.anto.hfooad.guitar.enums.Builder;
import com.anto.hfooad.guitar.enums.Style;
import com.anto.hfooad.guitar.enums.Type;
import com.anto.hfooad.guitar.enums.Wood;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MandolinSpec extends InstrumentSpec {
    private Style style;

	public MandolinSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood, Style style) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	@Override
	public boolean matches(InstrumentSpec instrumentSpec) {

		if (!super.matches(instrumentSpec))
			return false;
		if (!(instrumentSpec instanceof MandolinSpec))
			return false;

        MandolinSpec spec = (MandolinSpec) instrumentSpec;
        if (style.equals(spec.getStyle()))
            return false;

        return true;
    }
}
