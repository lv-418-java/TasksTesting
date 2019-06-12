package com.softserve.ita.tasks;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task554 implements Task<ArrayList<List<Integer>>> {

    private final static Task554 task554 = new Task554();

    public synchronized static Task<ArrayList<List<Integer>>> getInstance(){
        return task554;
    }

    private Task554(){

    }

    private int naturalNumb = 0;

    private ArrayList<List<Integer>> resultArr = new ArrayList<>();

    public void setUp(BufferedReader bufferedReader) throws IOException {
        System.out.print("Enter any natural number: ");

        naturalNumb = Integer.valueOf(bufferedReader.readLine());
    }


    public ArrayList<List<Integer>> execute() {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= naturalNumb; i++) {
            for (int j = 1; j <= naturalNumb; j++) {
                for (int k = 1; k <= naturalNumb; k++) {
                    result.clear();
                    if((i*i + j*j == k*k)) { //| (i*i + k*k == j*j) | (j*j + k*k == i*i))
                        result.add(i);
                        result.add(j);
                        result.add(k);
                        resultArr.add(result);
                    }
                }
            }
        }
        return resultArr;
    }
}
