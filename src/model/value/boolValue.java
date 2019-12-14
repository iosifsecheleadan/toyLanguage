package model.value;

import model.type.Type;
import model.type.boolType;
import exception.exception;

public class boolValue implements Value {
    private boolean value;

    public boolValue(boolean value) {
        this.value = value;
    }

    public boolValue() {
        this.value = false;
    }

    public boolean getValue () {
        return this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @Override
    public Type getType() {
        return new boolType();
    }

    @Override
    public boolean equals(Value that) throws exception{
        if (that.getType() instanceof boolType) {
            return this.getValue() == ((boolValue) that).getValue();
        } else {
            throw new exception ("Comparison between incompatible types");
        }
    }
}
