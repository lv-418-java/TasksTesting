package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


import static org.testng.Assert.*;

public class Task178dTest {
    private Task<Integer,int[]> t;
    private Task178d task;
    @BeforeTest
    public void init() throws IOException {
        t = Task178d.getInstance();
        int array[] = {1,2,3,2,33};
        t.setUp(array);
    }

    @Test
    public void testExecute() {
        Assert.assertTrue(t.execute().equals(1));
    }

    @Test
    public void testFactorial(){
        Assert.assertTrue(task.factorial(5) == 120);
    }
}