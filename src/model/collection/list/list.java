package model.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

import exception.exception;

public class list<Type> implements listInterface<Type> {
    private ArrayList<Type> list;

    public list(ArrayList<Type> newList){
        this.list = newList;
    }

    public list() {
        this.list = new ArrayList<Type>();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public listInterface<Type> sublist(int fromIndex, int toIndex) throws exception{
        if (fromIndex > 0 && toIndex < this.list.size()) {
            return new list<Type>((ArrayList<Type>) this.list.subList(fromIndex, toIndex));
        } else throw new exception ("index out of bounds");
    }

    @Override
    public void insert(Type element, int index) {
        this.list.add(index, element);
    }

    @Override
    public void remove(Type element) throws exception {
        if (this.list.contains(element)) {
            this.list.remove(element);
        } else throw new exception (element + " not in list");
    }

    @Override
    public void remove(int index) throws exception {
        if (index < this.list.size()) {
            this.remove(index);
        } else throw new exception ("index out of bounds");
    }

    @Override
    public Type get(int index) throws exception {
        if (index < this.list.size()) {
            return this.list.get(index);
        } throw new exception ("index out of bounds");
    }

    @Override
    public String toString() {
        return this.list.toString();
    }

    @Override
    public void append(Type element) {
        this.list.add(element);
    }

    @Override
    public boolean has(Type userInput) {
        return this.list.contains(userInput);
    }

    @Override
    public Iterator<Type> iterator() {
        return this.list.iterator();
    }
}
