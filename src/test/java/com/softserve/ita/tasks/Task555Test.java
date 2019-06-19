package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//List<List<Integer>>
public class Task555Test {

    private Task<List<List<Integer>>, Integer> task555;

    @BeforeTest
    public void init() {
        task555 = Task555.getInstance();
    }

    @Test
    public void testGetInstance() {
        Task<List<List<Integer>>, Integer> task_1 = Task555.getInstance();
        Task<List<List<Integer>>, Integer> task_2 = Task555.getInstance();
        Assert.assertSame(task_1, task_2);
    }


    @Test(dataProvider = "data")
    public void testExecute(Integer given, List<List<Integer>> expected) throws IOException {
        task555.setUp(given);
        System.out.println(given + "|" + expected);
        Assert.assertEquals(task555.execute(), expected);
    }

    /**
     * first column - given number, second column - expected number
     */
    @DataProvider(name = "data")
    public Object[][] getDataForTest() {
        return new Object[][] {
                { 1, Arrays.asList(Arrays.asList(1))},
                { 2, Arrays.asList(Arrays.asList(1),Arrays.asList(1,1))},
                { 3, Arrays.asList(Arrays.asList(1),Arrays.asList(1,1),Arrays.asList(1,2,1))},
                { 4, Arrays.asList(Arrays.asList(1),Arrays.asList(1,1),Arrays.asList(1,2,1),Arrays.asList(1,3,3,1))},
                { 5, Arrays.asList(Arrays.asList(1),Arrays.asList(1,1),Arrays.asList(1,2,1),Arrays.asList(1,3,3,1),Arrays.asList(1,4,6,4,1))},
        };
    }
}
