package com.anto.hfooad.guitar.model;

import com.anto.hfooad.guitar.enums.Builder;
import com.anto.hfooad.guitar.enums.Type;
import com.anto.hfooad.guitar.enums.Wood;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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
