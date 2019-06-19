package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task108Test {

  private Task<Double, Integer> task108;

  @BeforeTest
  public void init() {
    task108 = Task108.getInstance();

  }

  @Test
  public void testGetInstance() {
    Task<Double, Integer> task_1 = Task108.getInstance();
    Task<Double, Integer> task_2 = Task108.getInstance();
    Assert.assertSame(task_1, task_2);
  }


  @Test(dataProvider = "data")
  public void testExecute(Integer given, Double expected) throws IOException {
    task108.setUp(given);
    System.out.println(given + "|" + expected);
    Assert.assertEquals(task108.execute(), expected);
  }

  /**
   * first column - given number, second column - expected number
   */
  @DataProvider(name = "data")
  public Object[][] getDataForTest() {
    return new Object[][]{
        {4, 8.0d},
        {1, 2.0d},
        {7, 8.0d},
        {255, 256.0d},
        {256, 512.0d},
    };
  }
}