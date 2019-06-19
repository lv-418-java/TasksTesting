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

public class Task178bTest {
    private Task<List, Integer> task;

    @BeforeTest
    public void setUp() {
        task = Task178b.getInstance();
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][]{
                {8, new Integer[]{2,7}},
                {13, new Integer[]{4,11}},
                {17, new Integer[]{5,14}},
                {20, new Integer[]{6,16}},
        };
    }

    @Test(dataProvider = "provideData")
    public void testExecute(Integer in, Integer[] arr) throws IOException {
        task.setUp(in);
        Assert.assertEquals(new ArrayList<>(Arrays.asList(arr)), task.execute());
    }
}