package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;


public class Task86b implements Task<Integer, Integer> {
    private final static Task86b task86b = new Task86b();

    public synchronized static Task<Integer, Integer> getInstance(){
      return task86b;
    }

    private Task86b(){

    }

    private int sumOfNumbers;
    private int naturalNumber;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter natural number:");
        naturalNumber = Integer.valueOf(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        naturalNumber = value;
    }

    @Override
    public Integer execute() {
        char[] array = Task86a.returnCharArrayOfNumber(naturalNumber);
        for (char c : array) {
            sumOfNumbers += Character.getNumericValue(c);
        }
        return sumOfNumbers;
    }
}
