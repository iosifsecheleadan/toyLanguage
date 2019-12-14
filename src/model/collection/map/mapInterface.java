package model.collection.map;

import model.collection.list.list;
import exception.exception;

public interface mapInterface<Key, Value> {
    int size();
    void put(Key key, Value value);
    void remove(Key key) throws exception;
    Value get(Key key) throws exception;
    list<Key> getKeys();
    list<Value> getValues();
    boolean has(Key identifier);
    String toString();
    mapInterface<Key, Value> copy();
}
