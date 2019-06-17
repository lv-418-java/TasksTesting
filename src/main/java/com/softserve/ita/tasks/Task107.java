package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task107 implements Task<Integer, Integer> {

    private final static Task107 task107 = new Task107();

    public synchronized static Task<Integer, Integer> getInstance(){
        return task107;
    }

    private Task107(){

    }

    private int m;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter value for m: ");
        m = Integer.parseInt(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        m = value;
    }

    @Override
    public Integer execute() {
        int k = 0;
        int maxK = -1;
        final int constant = 4;
        long result;

        while (true) {
            result = (long) Math.pow(constant, ++k);
            if (result < m) {
                maxK = k;
            } else {
                return maxK;
            }
        }
    }
}
