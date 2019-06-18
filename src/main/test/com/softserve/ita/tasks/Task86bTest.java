package com.softserve.ita.tasks;
import com.softserve.ita.taskstesting.Task;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class Task86bTest {
    private Task<Integer,Integer> t;
    @BeforeTest
    public void init() throws IOException {
        t = Task86b.getInstance();
        t.setUp(14);
    }
    @Test
    public void testExecute() {
        Assert.assertTrue(t.execute() == 5);
    }
}