package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task108 implements Task<Double, Integer> {
    private final static Task108 task108 = new Task108();

    public synchronized static Task<Double, Integer> getInstance() {
        return task108;
    }

    private Task108() {

    }

    private int n;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Print some number: ");
        n = Integer.parseInt(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        n = value;
    }

    @Override
    public Double execute() {
        for (int i = 0; ; i++) {
            double x = Math.pow(2, i);
            if (x > n) {
                return x;
            }
        }
    }
}
