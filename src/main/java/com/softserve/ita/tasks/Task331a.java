package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.pow;

public class Task331a implements Task<List<String>> {
    private final static Task331a task331a = new Task331a();

    public synchronized static Task<List<String>> getInstance() {
        return task331a;
    }

    private Task331a() {

    }

    private int n;
    List<String> list = new ArrayList<>();
    String numbers;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Print some number: ");
        n = Integer.parseInt(reader.readLine());
    }

    @Override
    public List<String> execute() {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (n == pow(i, 2) + pow(j, 2) + pow(k, 2)) {
                       numbers = "[" + i + " " + j + " " + k + "]";
                        list.add(numbers);
                        return list;
                    }
                }
            }
        }
        return Collections.emptyList();
    }
}
