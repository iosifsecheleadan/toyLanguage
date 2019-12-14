package model.collection.map;

import model.collection.list.list;

import java.util.ArrayList;
import java.util.HashMap;

import exception.exception;

public class map<Key, Value> implements mapInterface<Key, Value> {
    private HashMap<Key, Value> map;

    public map() {
        this.map = new HashMap<Key, Value>();
    }

    private map(HashMap<Key, Value>  newMap) {
        this.map = newMap;
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public void put(Key key, Value value) {
        this.map.put(key, value);
    }

    @Override
    public void remove(Key key) throws exception {
        try {
            this.map.remove(key);
        } catch (Exception ex) {
            throw new exception("Inexisting key.");
        }
    }

    @Override
    public Value get(Key key) throws exception {
        try {
            return this.map.get(key);
        } catch (Exception ex) {
            throw new exception("Inexisting key.");
        }
    }

    @Override
    public list<Key> getKeys() {
        return new list<Key>(new ArrayList<Key>(this.map.keySet()));
    }

    @Override
    public list<Value> getValues() {
        return new list<Value>(new ArrayList<Value>(this.map.values()));
    }

    @Override
    public boolean has(Key identifier) {
        return this.map.containsKey(identifier);
    }

    @Override
    public String toString() {
        return this.map.toString();
    }

    @Override
    public map<Key, Value> copy() {
        return new map<Key, Value>((HashMap<Key, Value>) this.map.clone());
    }
}
