package com.anto.hfooad.instrument.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Instrument {
    private String serialnumber;
    private double price;
    private InstrumentSpec spec;    
}
