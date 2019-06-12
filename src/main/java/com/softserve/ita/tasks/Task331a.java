package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

import static java.lang.Math.pow;

public class Task331a implements  Task<Integer>  {
    private final static Task331a task331a = new Task331a();

    public synchronized static Task<Integer> getInstance() {
        return task331a;
    }

    private Task331a() {

    }

    private int n;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Print some number: ");
        n = Integer.parseInt(reader.readLine());
    }

    @Override
    public Integer execute() {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (n == pow(i, 2) + pow(j, 2) + pow(k, 2)) {
                        System.out.println("[" + i + " " + j + " " + k + "] ");
                        return 0;
                    }
                }
            }
        }
        System.out.println("No number");
        return 0;
        }
}
