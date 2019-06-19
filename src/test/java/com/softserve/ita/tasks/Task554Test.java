package com.softserve.ita.tasks;

import com.softserve.ita.tasks.Task554.Triple;
import com.softserve.ita.taskstesting.Task;
import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task554Test {

  private Task<List<Triple>, Integer> task554;

  @BeforeTest
  public void init() {
    task554 = Task554.getInstance();
  }

  @Test
  public void testGetInstance() {
    Task<List<Triple>, Integer> task_1 = Task554.getInstance();
    Task<List<Triple>, Integer> task_2 = Task554.getInstance();
    Assert.assertSame(task_1, task_2);
  }

  @Test
  public void testExecute_number_20() throws IOException {
    task554.setUp(20);
    List<Triple> triples = task554.execute();
    for (Triple t : triples) {
      Assert.assertEquals(t.getA() * t.getA() + t.getB() * t.getB(), t.getC() * t.getC());

      Assert.assertTrue(t.getC() <= 20, "c should be less (or the same) then 20");
    }

  }
}