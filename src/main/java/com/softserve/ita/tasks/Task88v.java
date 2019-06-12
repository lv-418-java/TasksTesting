package com.softserve.ita.tasks;

import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.round;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;
import java.io.BufferedReader;
import java.io.IOException;

public class Task88v implements Task<Integer> {

  private int number;

  static {
    Main.registerTask("88v", new Task88v());
  }

  @Override
  public void setUp(BufferedReader reader) throws IOException {
    number = Integer.parseInt(reader.readLine());
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
