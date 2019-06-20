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

public class Task243aTest {

    private Task<List, Integer> task;

    @BeforeTest
    public void setUp() {
        task = Task243a.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][] {
                {10, new ArrayList<>(Arrays.asList(1,3)) },
                {100, new ArrayList<>(Arrays.asList(6,8)) },
                {200, new ArrayList<>(Arrays.asList(2,14)) }
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(Integer in, ArrayList expected) throws IOException {
        task.setUp(in);
        List<Integer> solutions = task.execute();
        assertEquals(solutions, expected);
    }

}