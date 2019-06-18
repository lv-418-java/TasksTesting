package com.softserve.ita.tasks;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task554 implements Task<List<Task554.Triple>, Integer> {

    private final static Task554 task554 = new Task554();

    public synchronized static Task<List<Triple>, Integer> getInstance(){
        return task554;
    }

    private Task554(){

    }


    private int naturalNumb = 0;

    private ArrayList<Triple> resultArr = new ArrayList<>();

    @Override
    public void setUp(BufferedReader bufferedReader) throws IOException {
        System.out.print("Enter any natural number: ");
        naturalNumb = Integer.valueOf(bufferedReader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        naturalNumb = value;
    }

    public List<Triple> execute() {
        for (int i = 1; i <= naturalNumb; i++) {
            for (int j = 1; j <= naturalNumb; j++) {
                for (int k = 1; k <= naturalNumb; k++) {
                    if ((i * i + j * j == k * k)) { //| (i*i + k*k == j*j) | (j*j + k*k == i*i))
                            resultArr.add(new Triple(i, j, k));
                    }
                }
            }
        }
        return resultArr;
    }

    static class Triple {
        private int a;
        private int b;
        private int c;

        public Triple(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        @Override
        public String toString() {
            return '\n' + "Triple{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
        }
    }
}
