package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import com.softserve.ita.utils.DoubleTuple;

import java.io.BufferedReader;
import java.io.IOException;

public class Task87 implements Task<Long, DoubleTuple<Long, Long>> {

    /*
    * Дано натуральні n, m. Отримати суму останніх m цифр числа n
    * */

    private final static Task87 task87 = new Task87();

    public synchronized static Task<Long, DoubleTuple<Long, Long>> getInstance() {
        return task87;
    }

    private DoubleTuple<Long, Long> tuple;

    private Task87() {
        tuple = new DoubleTuple<>();
    }

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter n:");
        tuple.setFirstElement(Math.abs(Long.valueOf(reader.readLine())));
        System.out.println("Enter m:");
        tuple.setSecondElement(Math.abs(Long.valueOf(reader.readLine())));
    }

    @Override
    public void setUp(DoubleTuple<Long, Long> value) throws IOException {
        tuple = value;
    }

    @Override
    public Long execute() {
        long sum = 0;

        for (int i = 0; i < tuple.getSecondElement(); i++) {
            sum += tuple.getFirstElement() % 10;
            tuple.setFirstElement(tuple.getFirstElement() / 10);

            if (tuple.getFirstElement() == 0) {
                break;
            }
        }

        return sum;
    }
}
