package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import com.softserve.ita.utils.DoubleTuple;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class Task87Test {

    private Task<Long, DoubleTuple<Long, Long>> task;

    @BeforeTest
    public void setUp() {
        task = Task87.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][] {
                {new DoubleTuple<>(321L, 2L), 3L},
                {new DoubleTuple<>(21L, 2L), 3L},
                {new DoubleTuple<>(123L, 1L), 3L},
                {new DoubleTuple<>(1234L, 4L), 10L},
                {new DoubleTuple<>(12345L, 6L), 15L}
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(DoubleTuple<Long, Long> in, Long expected) throws IOException {
        task.setUp(in);

        assertEquals(task.execute(), expected);
    }
}