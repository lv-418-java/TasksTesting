package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task88gTest {

    private Task<Integer, Integer> task88g;

    @BeforeTest
    public void init() throws IOException{
        task88g = Task88g.getInstance();
        task88g.setUp(345);
    }

    @Test
    public void testGetInstance() {
        Task<Integer, Integer> task_1 = Task88b.getInstance();
        Task<Integer, Integer> task_2 = Task88b.getInstance();
        Assert.assertSame(task_1, task_2);
    }
    @Test
    public void testExecute() {
        Integer answer = 13451;
        Assert.assertEquals(task88g.execute(), answer);
    }
}