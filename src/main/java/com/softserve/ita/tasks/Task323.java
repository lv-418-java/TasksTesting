package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task323 implements Task<Integer[]> {

    static {
        Main.registerTask("323", new Task323());
    }

    private int number;

    public void setUp(BufferedReader reader) throws IOException{
        System.out.println("Enter number:");
        this.number = Integer.valueOf(reader.readLine());
    }

    public Integer[] execute(){
        return run(this.number);
    }

    public Integer[] run(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Number " + number + " is negetive");
        }

        this.number = number;

        return calculate();
    }

    private Integer[] calculate() {

        int remainder = number;
        int remainderBuffer = 0;
        Integer[] squareRoots = new Integer[4];
        int currentSquarePosition = 0;

        while (remainder > 0) {
            double sqrt = Math.sqrt(remainder);
            if (sqrt % 2 == 0 || sqrt % 2 == 1) {
                remainder -= sqrt * sqrt;
                squareRoots[currentSquarePosition] = (int) sqrt;
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
