package com.softserve.ita.tasks;


import com.softserve.ita.taskstesting.Task;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task322Test {

  private Task<Integer, Integer> task322;
  private final Integer ANSWER = 9240;// this task has only one correct answer

  @BeforeTest
  public void init() {
    task322 = Task322.getInstance();
  }

  @Test
  public void testGetInstance() {
    Task<Integer, Integer> task_1 = Task322.getInstance();
    Task<Integer, Integer> task_2 = Task322.getInstance();
    Assert.assertSame(task_1, task_2);
  }

  @Test
  public void testExecute() {
    Assert.assertEquals(task322.execute(), ANSWER);
  }
}