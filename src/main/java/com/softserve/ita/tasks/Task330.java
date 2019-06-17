package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task330 implements Task<List, Integer> {
    private final static Task330 task330 = new Task330();

    public synchronized static Task<List, Integer> getInstance() {
        return task330;
    }

    private Task330() {

    }


    private int naturalNumber;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter natural number:");
        naturalNumber = Integer.valueOf(reader.readLine());
    }

    @Override
    public void setUp(Integer number) throws IOException {
        naturalNumber = number;
    }

    public List<Integer> execute() {
        List<Integer> arrayList = new ArrayList<>();
        int sumOfDividers = 0;
        for (int i = 1; i < naturalNumber; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumOfDividers += j;
                }
            }
            if (sumOfDividers == i) {
                arrayList.add(i);
            }
            sumOfDividers = 0;
        }
        return arrayList;
    }

}
