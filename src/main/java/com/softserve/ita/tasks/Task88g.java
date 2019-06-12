package com.softserve.ita.tasks;

import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.round;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;
import java.io.BufferedReader;
import java.io.IOException;

public class Task88g implements Task<Integer> {
  private int number;

  static {
    Main.registerTask("88g", new Task88g());
  }

  @Override
  public void setUp(BufferedReader reader) throws IOException {
    number = Integer.parseInt(reader.readLine());
  }

  @Override
  public Integer execute() {
    return appendOne(number);
  }

  private static int appendOne(int number) {
    int swappedNum;
    int digits;
    // Total number of digit - 1
    digits = (int) log10(number);

    swappedNum = (int) round(pow(10, digits + 1));

    swappedNum += number;
    swappedNum = swappedNum * 10 + 1;
    return swappedNum;
  }
}
