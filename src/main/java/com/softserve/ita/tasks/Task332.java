package com.softserve.ita.tasks;

import com.softserve.ita.tasks.Task332.Solution;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task332 implements Task<List<Solution>, Integer> {
    private int number;

    private final static Task332 task332 = new Task332();

    public synchronized static Task<List<Solution>, Integer> getInstance() {
        return task332;
    }

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter value number: ");
        number = Integer.parseInt(reader.readLine());
        System.out.println("Solution ...");
    }

    @Override
    public void setUp(Integer value) throws IOException {
        number = value;
    }

    @Override
    public List<Solution> execute() {
        return findSolution(number);
    }

    private List<Solution> findSolution(int number) {
        List<Solution> solutions = new ArrayList<>();
        for (int x = 1; x < number; x++) {
            for (int y = 1; y < number; y++) {
                for (int z = 1; z < number; z++) {
                    for (int t = 1; t < number; t++) {
                        if ((x * x + y * y + z * z + t * t) == number) {
                            solutions.add(new Solution(x, y, z, t));
                        }
                    }
                }
            }
        }
        return solutions;
    }

    public static class Solution {
        private int x;
        private int y;
        private int z;
        private int t;

        Solution(int x, int y, int z, int t) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.t = t;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || obj.getClass() != getClass()) return false;

            Solution s = (Solution) obj;

            return x == s.x && y == s.y && z == s.z && t == s.t;
        }

        @Override
        public String toString() {
            return "Solution{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    ", t=" + t +
                    "}\n";
        }
    }
}
