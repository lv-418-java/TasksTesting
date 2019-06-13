package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task178b implements Task<List> {
    private final static Task178b task178b = new Task178b();

    public synchronized static Task<List> getInstance() {
        return task178b;
    }

    private Task178b() {

    }

    private int arraySize = 0;
    private int multOf3 = 0;
    private int notMultOf5 = 0;

    public void setUp(BufferedReader bufferedReader) throws IOException {
        System.out.print("Number of elements in the array: ");

        arraySize = Integer.valueOf(bufferedReader.readLine());
    }

    public List execute() {
        int naturalArr[] = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < naturalArr.length; i++) {
            naturalArr[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < naturalArr.length; i++) {
            if ((naturalArr[i] % 3) == 0) multOf3++;
            if ((naturalArr[i] % 5) != 0) notMultOf5++;
        }

        List<Integer> arrResult = new ArrayList();

        arrResult.add(multOf3);
        arrResult.add(notMultOf5);

        return arrResult;
    }
}
