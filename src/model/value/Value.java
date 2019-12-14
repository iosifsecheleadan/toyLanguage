package model.value;

import model.type.Type;
import exception.exception;

public interface Value {
    String toString();
    boolean equals (Value that) throws exception;
    Type getType();
}
