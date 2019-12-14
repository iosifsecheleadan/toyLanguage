package model.statement;

import model.collection.map.mapInterface;
import model.collection.programState.programState;
import model.type.Type;
import model.value.Value;
import exception.exception;

import java.io.IOException;

public interface Statement {
    programState execute(programState state) throws exception;
    mapInterface<String, Type> typeCheck (mapInterface<String, Type> typeEnvironment) throws exception;
    String toString();
    Statement copy();
}
