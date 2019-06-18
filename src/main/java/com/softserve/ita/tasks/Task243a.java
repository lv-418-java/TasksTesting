package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task243a implements Task<List, Integer> {

    private final static Task243a task243a = new Task243a();

    public synchronized static Task<List, Integer> getInstance(){
        return task243a;
    }

    private Task243a(){

    }

    private int n;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter value for n: ");
        n = Integer.parseInt(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        n = value;
    }

    @Override
    public List execute() {
        List<Integer> result = new ArrayList<>();
        int boundary = (int) Math.sqrt(n);

        for (int x = 1; x <= boundary; x++) {
            for (int y = 1; y <= boundary; y++) {
                if ((x * x + y * y) == n){
                    result.add(x);
                    result.add(y);
                    return result;
                }

            }
        }
        return Collections.emptyList();
    }
}
