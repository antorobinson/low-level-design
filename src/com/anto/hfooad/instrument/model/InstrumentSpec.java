package com.anto.hfooad.instrument.model;

import com.anto.hfooad.instrument.enums.Builder;
import com.anto.hfooad.instrument.enums.Type;
import com.anto.hfooad.instrument.enums.Wood;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public boolean matches(InstrumentSpec instrumentSpec) {
        if (builder != instrumentSpec.getBuilder())
            return false;

        if (model != null && !model.equalsIgnoreCase(instrumentSpec.getModel()))
            return false;

        if (type != instrumentSpec.getType())
            return false;

        if (backWood != instrumentSpec.getBackWood())
            return false;

        if (topWood != instrumentSpec.getTopWood())
            return false;

        return true;
    }    
}
