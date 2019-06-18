package com.softserve.ita.utils;

public class TripleTuple<E, T, R> {

    private E firstElement;
    private T secondElement;
    private R thirdElement;

    public TripleTuple() {
    }

    public TripleTuple(E firstElement, T secondElement, R thirdElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
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

    public R getThirdElement() {
        return thirdElement;
    }

    public void setThirdElement(R thirdElement) {
        this.thirdElement = thirdElement;
    }
}
