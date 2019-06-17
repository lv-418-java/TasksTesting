package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task323Test {
private Task<List<Integer>, Integer> task;

    @BeforeTest
    public void init() {
        task = Task323.getInstance();

    }
    @DataProvider(name = "data")
    public Object[][] getDataForTest() {
      return new Object[][]{
              {250, new Integer[]{15,5,0,0}},
              {500, new Integer[]{22,4,0,0}},
              {680, new Integer[]{26,2,0,0}}
      };
    }

    @Test(dataProvider = "data")
    public void testExecute(Integer n, Integer[] arr) throws IOException {
        task.setUp(n);
        Assert.assertEquals(new ArrayList<>(Arrays.asList(arr)), task.execute());


    }
}