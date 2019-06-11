package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task86B implements Task<Integer> {

    static {
        Main.registerTask("86b", new Task86B());
    }

    private int sumOfNumbers;
    private int naturalNumber;

    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter natural number:");
        naturalNumber = Integer.valueOf(reader.readLine());
    }

    public Integer execute() {
        char array[] = Task86A.returnCharArrayOfNumber(naturalNumber);
        for(int i = 0; i < array.length; i++ ) {
            sumOfNumbers += Character.getNumericValue(array[i]);
        }
        return sumOfNumbers;
    }


}
