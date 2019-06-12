package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task560 implements Task<Map<Integer, Integer>> {

    private final static Task560 task560 = new Task560();

    public synchronized static Task<Map<Integer, Integer>> getInstance(){
        return task560;
    }

    public void setUp(BufferedReader reader) throws IOException {}

    public Map<Integer, Integer> execute(){
        return run();
    }

    public Map<Integer, Integer> run() {
        Map<Integer, Integer> numbersSumOfDividers = new HashMap<>();

        for (int i = 200; i < 300; i++) {
            int sum = div(i);
            numbersSumOfDividers.put(i, sum);

        }

        Map<Integer, Integer> rez = new HashMap<>();

        int currentNumber = 200;
        while (currentNumber != 300) {
            for (int i = 200; i < 300; i++) {
                if (i != currentNumber && numbersSumOfDividers.get(i) == currentNumber && numbersSumOfDividers.get(currentNumber) == i) {
                    if (!rez.containsValue(i)) {
                        rez.put(i, currentNumber);
                    }
                }
            }
            currentNumber++;
        }

        return rez;
    }

    public int div(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum += (number % i) == 0 ? i : 0;
        }

        return sum;
    }
}
