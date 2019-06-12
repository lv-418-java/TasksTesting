package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task178d implements Task<Integer> {

    private final static Task178d task178g = new Task178d();

    public synchronized static Task<Integer> getInstance(){
        return task178g;
    }

    private Task178d(){

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
        for(int i = 0; i < arraySize; i++){
            if(array[i] > Math.pow(2, i + 1) && array[i] < factorial(i + 1)){
                count++;
            }
        }
        return count;
    }

    public static int factorial(int n){
        if(n < 2){
            return n;
        }
        return n * factorial(n - 1);
    }
}
