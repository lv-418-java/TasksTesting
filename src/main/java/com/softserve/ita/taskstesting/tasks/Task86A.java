package com.softserve.ita.taskstesting.tasks;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task86A implements Task<Integer> {

    static {
        Main.registerTask("86a", new Task86A());
    }

    static char[] returnCharArrayOfNumber(int natutalNumber) {
        String temp = Integer.toString(natutalNumber);
        char [] array = temp.toCharArray();
        return  array;
    }

    private int naturalNumber;

    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter natural number:");
        naturalNumber = Integer.valueOf(reader.readLine());
    }

    public Integer execute() {
        return returnCharArrayOfNumber(naturalNumber).length;
    }
}
