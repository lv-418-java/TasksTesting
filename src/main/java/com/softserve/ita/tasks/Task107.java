package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task107 implements Task<Integer> {
    private int m;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        m = Integer.parseInt(reader.readLine());
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
