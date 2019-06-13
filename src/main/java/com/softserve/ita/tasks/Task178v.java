package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Task178v implements Task<Integer> {

    private final static Task178v task178v = new Task178v();

    public synchronized static Task<Integer> getInstance() {
        return task178v;
    }

    private Task178v() {

    }

    private int arraySize = 0;
    private int sqrtOfEvenNumb = 0;

    public void setUp(BufferedReader bufferedReader) throws IOException {
        System.out.print("Number of elements in the array: ");

        arraySize = Integer.valueOf(bufferedReader.readLine());
    }

    public Integer execute() {
        int naturalArr[] = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < naturalArr.length; i++) {
            naturalArr[i] = random.nextInt(100) + 1;
        }


        for (int i = 0; i < naturalArr.length; i++) {
            if (Math.sqrt(naturalArr[i]) % 2 == 0) sqrtOfEvenNumb++;
        }
        return sqrtOfEvenNumb;
    }
}
