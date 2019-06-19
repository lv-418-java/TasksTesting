package com.softserve.ita.utils;

public class TripleTuple<E, T, R> extends DoubleTuple<E, T> {

    private R thirdElement;

    public TripleTuple() {
    }

    public TripleTuple(E firstElement, T secondElement, R thirdElement) {
        super(firstElement, secondElement);
        this.thirdElement = thirdElement;
    }

    public R getThirdElement() {
        return thirdElement;
    }

    public void setThirdElement(R thirdElement) {
        this.thirdElement = thirdElement;
    }
}
