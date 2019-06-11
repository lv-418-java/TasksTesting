package com.softserve.ita.taskstesting.tasks;

import com.softserve.ita.taskstesting.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task330 {

    static {
        Main.registerTask("330", new Task86A());
    }

    private ArrayList<Integer> arrayList;
    private int naturalNumber;

    @Override
    public String toString() {
        return "Sum of numbers in number " + naturalNumber + " is: " + arrayList;
    }

    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter natural number:");
        naturalNumber = Integer.valueOf(reader.readLine());
    }

    public ArrayList<Integer> execute() {
        arrayList = new ArrayList<Integer>();
        int sumOfDividers = 0;
        for(int i = 1; i < naturalNumber; i++) {
            for(int j = 1; j < i; j++) {
                if(i % j == 0){
                    sumOfDividers += j;
                }
            }
            if(sumOfDividers == i) {
                arrayList.add(i);
            }
            sumOfDividers = 0;
        }
        return arrayList;
    }

}
