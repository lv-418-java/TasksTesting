package com.softserve.ita.tasks;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Task554 implements Task<ArrayList> {

    private int naturalNumb = 0;

    private ArrayList<ArrayList> resultArr = new ArrayList<>();

    public void setUp(BufferedReader bufferedReader) throws IOException {
        System.out.print("Enter any natural number: ");

        naturalNumb = Integer.valueOf(bufferedReader.readLine());
    }


    public ArrayList execute() {
        ArrayList<Integer> result = new ArrayList();
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
