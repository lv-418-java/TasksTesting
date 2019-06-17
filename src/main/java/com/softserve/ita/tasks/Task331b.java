package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.pow;

public class Task331b implements Task<List<String>, Integer> {
    private final static Task331b task331b = new Task331b();

    public synchronized static Task<List<String>, Integer> getInstance() {
        return task331b;
    }

    private Task331b() {

    }

    private int n;
    List<String> list = new ArrayList<>();

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
    public List<String> execute() {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (n == pow(i, 2) + pow(j, 2) + pow(k, 2)) {
                        list.add("[" + i + " " + j + " " + k + "] ");
                        list.add("[" + i + " " + k + " " + j + "] ");
                        list.add("[" + j + " " + i + " " + k + "] ");
                        list.add("[" + j + " " + k + " " + i + "] ");
                        list.add("[" + k + " " + i + " " + j + "] ");
                        list.add("[" + k + " " + j + " " + i + "] ");
                        return list;
                    }
                }
            }
        }
        return Collections.emptyList();
    }

}

