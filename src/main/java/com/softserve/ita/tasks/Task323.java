package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task323 implements Task<List<Integer>, Integer> {

    private final static Task323 task323 = new Task323();

    public synchronized static Task<List<Integer>, Integer> getInstance(){
        return task323;
    }

    private int number;

    public void setUp(BufferedReader reader) throws IOException{
        System.out.println("Enter number:");
        this.number = Integer.valueOf(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        number = value;
    }

    public List<Integer> execute(){
        return run(this.number);
    }

    private List<Integer> run(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Number " + number + " is negetive");
        }

        this.number = number;

        return calculate();
    }

    private List<Integer> calculate() {

        int remainder = number;
        int remainderBuffer = 0;
        List<Integer> squareRoots = new ArrayList<>(Arrays.asList(0,0,0,0));

        int currentSquarePosition = 0;

        while (remainder > 0) {
            double sqrt = Math.sqrt(remainder);
            if (sqrt % 2 == 0 || sqrt % 2 == 1) {
                remainder -= sqrt * sqrt;
                squareRoots.set(currentSquarePosition, (int) sqrt);
                remainder += remainderBuffer;
                remainderBuffer = 0;
                currentSquarePosition++;
            } else {
                remainder--;
                remainderBuffer++;
            }
        }

        return squareRoots;
    }
}
