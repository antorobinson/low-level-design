package com.anto.hfooad.instrument.enums;

import lombok.Getter;

@Getter
public enum Style {
    A("A"), F("F");

    private String value;

    Style(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
