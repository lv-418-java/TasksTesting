package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task332 implements Task<List> {
  private int number;

  private final static Task332 task332 = new Task332();

  public synchronized static Task<List> getInstance() {
    return task332;
  }
  @Override
  public void setUp(BufferedReader reader) throws IOException {
    System.out.println("Enter value number: ");
    number = Integer.parseInt(reader.readLine());
    System.out.println("Solution ...");
  }

  @Override
  public List execute() {
    return findSolution(number);
  }

  private List<Solution> findSolution(int number) {
    List<Solution> solutionList=new ArrayList<>();
    for (int x = 0; x < number; x++) {
      for (int y = 0; y < number; y++) {
        for (int z = 0; z < number; z++) {
          for (int t = 0; t < number; t++) {
            if ((x * x + y * y + z * z + t * t) == number) {
              solutionList.add(new Solution(x, y, z, t));
            }
          }
        }
      }
    }
    return solutionList;
  }

  public class Solution {
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
