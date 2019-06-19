package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import com.softserve.ita.utils.DoubleTuple;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task331aTest {

    private Task<List<String>, Integer> task331a;

    @BeforeTest
    public void init() {
        task331a = Task331a.getInstance();
    }

    @Test
    public void testGetInstance() {
        Task<List<String>, Integer> task_1 = Task331a.getInstance();
        Task<List<String>, Integer> task_2 = Task331a.getInstance();
        Assert.assertSame(task_1, task_2);
    }


    @Test(dataProvider = "data")
    public void testExecute(Integer given, List<String> expected) throws IOException {
        task331a.setUp(given);
        System.out.println(given + "|" + expected);
        Assert.assertEquals(task331a.execute(), expected);
    }

    /**
     * first column - given number, second column - expected number
     */
    @DataProvider(name = "data")
    public Object[][] getDataForTest() {
        return new Object[][] {
                { 42, Arrays.asList("[1 4 5]")},
                { 1, Collections.emptyList()},
                { 4, Collections.emptyList()},
                { 45, Arrays.asList("[2 4 5]")},
                { 111, Collections.emptyList()}
        };
    }
}
