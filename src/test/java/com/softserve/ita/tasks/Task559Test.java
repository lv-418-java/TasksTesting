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

import static org.testng.Assert.*;

public class Task559Test {

    private Task<List<Long>, Long>  task;

    @BeforeTest
    public void init() {
        task = Task559.getInstance();

    }

    @DataProvider(name = "data")
    public Object[][] getDataForTest() {
        return new Object[][]{
                {952323L,  new Long[]{3L, 7L, 31L, 127L, 2047L, 8191L, 131071L, 524287L}},
                {893L,     new Long[]{3L, 7L, 31L, 127L}},
                {9000L,    new Long[]{3L, 7L, 31L, 127L, 2047L, 8191L}},
                {1234567L, new Long[]{3L, 7L, 31L, 127L, 2047L, 8191L, 131071L, 524287L}},
        };
    }

    @Test(dataProvider = "data")
    public void testExecute(Long n, Long[] arr) throws IOException {
        task.setUp(n);
        Assert.assertEquals(new ArrayList<>(Arrays.asList(arr)), task.execute());


    }
}