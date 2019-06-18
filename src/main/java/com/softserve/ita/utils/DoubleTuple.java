package com.softserve.ita.utils;

public class DoubleTuple<E, T> {

    private E firstElement;
    private T secondElement;

    public DoubleTuple() {
    }

    public DoubleTuple(E firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public E getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(E firstElement) {
        this.firstElement = firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(T secondElement) {
        this.secondElement = secondElement;
    }
}
