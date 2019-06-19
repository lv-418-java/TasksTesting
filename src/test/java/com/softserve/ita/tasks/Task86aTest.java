package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class Task86aTest {

    private Task<Integer, Integer> task;

    @BeforeTest
    public void setUp() {
        task = Task86a.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][] {
                {1, 1},
                {2, 1},
                {10, 2},
                {100, 3},
                {1_000_000_000, 10}
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(Integer in, Integer out) throws IOException {
        task.setUp(in);
        assertEquals(task.execute(), out);
    }
}