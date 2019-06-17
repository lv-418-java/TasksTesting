package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task86a implements Task<Integer,Integer> {
    private final static Task86a task86a = new Task86a();

    public synchronized static Task<Integer,Integer> getInstance(){
      return task86a;
    }

    private Task86a(){

    }


    static char[] returnCharArrayOfNumber(int natualNumber) {
        String temp = Integer.toString(natualNumber);
        return temp.toCharArray();
    }

    private int naturalNumber;

    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter natural number:");
        naturalNumber = Integer.valueOf(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        naturalNumber = value;
    }

    public Integer execute() {
        return returnCharArrayOfNumber(naturalNumber).length;
    }
}
