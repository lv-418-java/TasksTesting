package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task243b implements Task<List<String> , Integer> {
    private final static Task243b task243b = new Task243b();

    public synchronized static Task<List<String>, Integer> getInstance(){
        return task243b;
    }

    private Task243b(){

    }


    private int n;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter value for n: ");
        n = Integer.parseInt(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        n = value;
    }

    @Override
    public List<String> execute() {
        int boundary = (int) Math.sqrt(n);
        List<String> resultList = new ArrayList<>();

        for (int x = 1; x <= boundary; x++) {
            for (int y = 1; y <= x; y++) {
                if ((x * x + y * y) == n) {
                    resultList.add("x= " + x + " y= " + y);
                }
            }
        }

        return resultList.get(0) != null ?
                resultList : Collections.emptyList();
    }
}

