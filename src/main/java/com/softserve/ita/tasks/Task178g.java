package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class Task178g implements Task<Integer> {

    private final static Task178g task178g = new Task178g();

    public synchronized static Task<Integer> getInstance(){
        return task178g;
    }

    private Task178g(){

    }

    private int arraySize = 0;
    private int array[];
    private int count = 0;

    public void setUp(BufferedReader bufferedReader) throws IOException {
        System.out.print("Number of elements in the array:");
        arraySize = Integer.valueOf(bufferedReader.readLine());
        array = new int[arraySize];
        System.out.println("Elements:");
        for(int i = 0; i < arraySize; i++) {
            array[i] = Integer.valueOf(bufferedReader.readLine());
        }
    }

    public Integer execute() {
        for(int i = 1; i < arraySize - 1; i++){
            if(array[i] < (array[i - 1] + array[i + 1]) / 2){
                count++;
            }
        }
        return count;
    }
}
