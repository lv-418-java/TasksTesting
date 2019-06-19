package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class Task332Test {

    private Task<List<Task332.Solution>, Integer> task;

    @BeforeTest
    public void setUp() {
        task = Task332.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][] {
                {4, new Task332.Solution(1, 1, 1, 1)},
                {7, new Task332.Solution(1, 1, 1, 2)},
                {16, new Task332.Solution(2, 2, 2, 2)},
                {174, new Task332.Solution(5, 6, 7, 8)}
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(Integer in, Task332.Solution out) throws IOException {
        task.setUp(in);
        List<Task332.Solution> solutions = task.execute();
        assertTrue(solutions.contains(out));
    }
}