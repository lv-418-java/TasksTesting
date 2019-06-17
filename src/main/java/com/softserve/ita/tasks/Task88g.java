package com.softserve.ita.tasks;

import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.round;

import com.softserve.ita.taskstesting.Task;
import java.io.BufferedReader;
import java.io.IOException;

public class Task88g implements Task<Integer, Integer> {

  private final static Task88g task88g = new Task88g();

  public synchronized static Task<Integer, Integer> getInstance(){
    return task88g;
  }

  private Task88g(){

  }

  private int number;

  @Override
  public void setUp(BufferedReader reader) throws IOException {
    System.out.println("Enter number: ");
    number = Integer.parseInt(reader.readLine());
    System.out.println("Append one ...");
  }

  @Override
  public void setUp(Integer value) throws IOException {
    number = value;
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
