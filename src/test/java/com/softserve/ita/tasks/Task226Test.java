package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import com.softserve.ita.utils.DoubleTuple;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class Task226Test {

    private Task<List<Long>, DoubleTuple<Long, Long>> task;

    @BeforeTest
    public void setUp() {
        task = Task226.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][] {
                {new DoubleTuple<>(5L, 15L), Arrays.asList(75L, 60L, 45L, 30L, 15L)},
                {new DoubleTuple<>(4L, 18L), Arrays.asList(72L, 36L)}
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(DoubleTuple<Long, Long> in, List<Long> expected) throws IOException {
        task.setUp(in);

        assertEquals(task.execute(), expected);
    }
}