package com.softserve.ita.tasks;

import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.round;

import com.softserve.ita.taskstesting.Task;
import java.io.BufferedReader;
import java.io.IOException;

public class Task88v implements Task<Integer, Integer> {
  private final static Task88v task88v = new Task88v();

  public synchronized static Task<Integer, Integer> getInstance(){
    return task88v;
  }

  private Task88v(){

  }

  private int number;

  @Override
  public void setUp(BufferedReader reader) throws IOException {
    System.out.println("Enter number: ");
    number = Integer.parseInt(reader.readLine());
    System.out.println("Rearrange number ...");
  }

  @Override
  public void setUp(Integer value) throws IOException {
    number = value;
  }

  @Override
  public Integer execute() {
    return rearrangeNumber(number);
  }


  private static int lastDigit(int number) {
    return (number % 10);
  }

  private static int firstDigit(int number) {
    while (number >= 10) {
      number /= 10;
    }
    return number;
  }

  private static int rearrangeNumber(int number) {
    int swappedNum;
    int firstDigit, lastDigit, digits;

    // Find last digit
    lastDigit = lastDigit(number);

    // Total number of digit - 1
    digits = (int) log10(number);

    // Find first digit
    firstDigit = firstDigit(number);

    swappedNum = lastDigit;
    swappedNum *= (int) round(pow(10, digits));
    swappedNum += number % ((int) round(pow(10, digits)));
    swappedNum -= lastDigit;
    swappedNum += firstDigit;
    return swappedNum;
  }
}
