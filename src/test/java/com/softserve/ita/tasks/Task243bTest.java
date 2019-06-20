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

public class Task243bTest {

    private Task<List<String>, Integer> task;

    @BeforeTest
    public void setUp() {
        task = Task243b.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][] {
                {1000, new ArrayList<>(Arrays.asList("x= 26 y= 18", "x= 30 y= 10"))},
                {666, new ArrayList<>(Arrays.asList("x= 21 y= 15"))},
                {244, new ArrayList<>(Arrays.asList("x= 12 y= 10"))},
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(Integer in, ArrayList expected) throws IOException {
        task.setUp(in);
        List<String> solutions = task.execute();
        assertEquals(solutions, expected);
    }

}