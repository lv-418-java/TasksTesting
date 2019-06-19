package com.softserve.ita.utils;

public class TripleTuple<E, T, R> extends DoubleTuple<E, T> {

    protected R thirdElement;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        TripleTuple<?, ?, ?> tripleTuple = (TripleTuple<?, ?, ?>) obj;

        return tripleTuple.firstElement == firstElement
                && tripleTuple.secondElement == secondElement
                && tripleTuple.thirdElement == thirdElement;
    }
}
