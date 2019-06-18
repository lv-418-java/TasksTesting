package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task178v implements Task<Integer, int[]> {

    private final static Task178v task178v = new Task178v();

    public synchronized static Task<Integer, int[]> getInstance(){
        return task178v;
    }

    private Task178v(){

    }

    private int arraySize = 0;
    private int[] array;
    private int sqrtOfEvenNumb = 0;

    public void setUp(BufferedReader bufferedReader) throws IOException {
        System.out.print("Number of elements in the array: ");

        arraySize = Integer.valueOf(bufferedReader.readLine());
        array = new int[arraySize];
        System.out.println("Elements:");
        for(int i = 0; i < arraySize; i++) {
            array[i] = Integer.valueOf(bufferedReader.readLine());
        }
    }

    @Override
    public void setUp(int[] value) throws IOException {
        array = value;
        arraySize = value.length;
    }

    public Integer execute() {
        sqrtOfEvenNumb = 0;
        for (int i = 0; i < arraySize; i++) {
            if (Math.sqrt(array[i]) % 2 == 0) {
                sqrtOfEvenNumb++;
            }

        }
        return sqrtOfEvenNumb;
    }
}
