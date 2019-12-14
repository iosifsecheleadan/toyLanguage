package model.expression;

import model.collection.map.mapInterface;
import model.type.Type;
import model.value.Value;
import exception.exception;

public interface Expression {
    Value evaluate(mapInterface<String, Value> symbolTable, mapInterface<Integer, Value> heap) throws exception;
    Type typeCheck(mapInterface<String, Type> typeEnvironment) throws exception;
    String toString();
}
