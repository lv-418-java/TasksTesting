package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task330Test {
    private Task<List, Integer> task;

    @BeforeTest
    public void init() throws IOException {
        task = Task330.getInstance();
        task.setUp(8129);
    }

    @Test
    public void testExecute() {
        Assert.assertEquals(new ArrayList<>(Arrays.asList(6, 28, 496, 8128)), task.execute());
    }
}