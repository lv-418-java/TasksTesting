package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import com.softserve.ita.utils.DoubleTuple;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class Task88aTest {

    private Task<String, Integer> task;

    @BeforeTest
    public void setUp() {
        task = Task88a.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][]{
                {4, "Square of number doesn't contain 3"},
                {6, "Square of number contains 3"},
                {8, "Square of number doesn't contain 3"},
                {19, "Square of number contains 3"},
                {18, "Square of number contains 3"}
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(Integer in, String expected) throws IOException {
        task.setUp(in);

        assertEquals(task.execute(), expected);
    }
}