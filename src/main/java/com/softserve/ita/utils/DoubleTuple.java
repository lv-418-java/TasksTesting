package com.softserve.ita.utils;

public class DoubleTuple<E, T> {

    protected E firstElement;
    protected T secondElement;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        DoubleTuple<?, ?> doubleTuple = (DoubleTuple<?, ?>) obj;

        return doubleTuple.firstElement == firstElement && doubleTuple.secondElement == secondElement;
    }
}
